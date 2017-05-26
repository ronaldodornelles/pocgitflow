package br.gov.iphan.sisgep.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.Municipio;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.util.Utils;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Municipio. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("municipioManager")
@AutoCreate
public class MunicipioManager extends BaseManagerImpl<Municipio>{
	
	/**
	 * Realiza a pesquisa de todos os Municípios.
	 * @return 	Lista de todos Municípios encontrados.
	 * @author 	Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Municipio> listarTodos(){
		return (List<Municipio>) listarTodos(Municipio.class);
	}

	/**
	 * Realiza a pesquisa de todos os Municípios de um Estado/Unidade Federação.
	 * @param uf	Estado/Unidade Federação
	 * @return 		Lista de todos Municípios encontrados de um determinado Estado/Unidade Federação.
	 * @author 		Thiago Nunes Vieira
	 */
	@SuppressWarnings("unchecked")
	public List<Municipio> findByUf(Uf uf) {

		return getEntityManager()
					.createNamedQuery("municipio.findByUf")
					.setParameter("codUf", uf.getId())
					.getResultList();
	}

	public List<Municipio> consultarMunicipio(Municipio municipio){
		List<String> query = new ArrayList<String>();

		query.add(" lower( nomMunicipio )  like lower( concat('%',#{municipio.nomMunicipio},'%') ) ");
		query.add(" codUf =  #{municipio.codUf}");

		return obtemLista(Municipio.class, query);
	}
	
	public Municipio consultarMunicipioPorNome(Municipio municipio) {
		String sql = " select * from CORP.CRP_MUNICIPIO where lower( nom_municipio ) like lower( '%" 
					+ Utils.semAcentos(municipio.getNomMunicipio())
					+ "%' ) COLLATE LATIN1_GENERAL_CI_AI and cod_uf = " + municipio.getCodUf().getId();

		Municipio retorno = (Municipio) getEntityManager().createNativeQuery(sql.toString(), Municipio.class).getSingleResult();

		return retorno;
	}
}
