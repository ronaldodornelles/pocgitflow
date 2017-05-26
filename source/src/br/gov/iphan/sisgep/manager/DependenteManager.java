package br.gov.iphan.sisgep.manager;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Dependente;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Dependente. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("dependenteManager")
@AutoCreate
public class DependenteManager extends BaseManagerImpl<Dependente>{
}
