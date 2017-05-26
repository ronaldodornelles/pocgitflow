package br.gov.iphan.sisgep.manager;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.FormacaoAcademica;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Formacao Academica
 * 
 * @author 	Erick Xavier
 **/
@Name("formacaoAcademicaManager")
@AutoCreate
public class FormacaoAcademicaManager extends BaseManagerImpl<FormacaoAcademica>{
		
	@Transactional
	public void excluirFormacaoAcademica(FormacaoAcademica formacaoAcademica){
			getEntityManager()
			.createNativeQuery(
					"delete from SISGEP.GPT_FORMACAO_ACADEMICA where COD_FORMACAO_ACADEMICA = ?")
			.setParameter(1, formacaoAcademica.getId()).executeUpdate();
		}
}
