package br.gov.iphan.sisgep.manager;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

import br.gov.iphan.sisgep.entity.Avaliacao;
import br.gov.iphan.sisgep.entity.Sincronizacao;
import br.gov.iphan.sisgep.entity.StatusAvaliacao;

@Name("statusAvaliacaoManager")
@AutoCreate
@Transactional
public class StatusAvaliacaoManager extends BaseManagerImpl<StatusAvaliacao> {

	@SuppressWarnings("unchecked")
	public List<StatusAvaliacao> listarTodos(){
		return (List<StatusAvaliacao>) listarTodos(StatusAvaliacao.class);
	}

	public StatusAvaliacao salvar(StatusAvaliacao entity) {
		return (StatusAvaliacao) super.salvar(entity);
		//super.getEntityManager().getTransaction().commit();
	}

	public StatusAvaliacao recuperarPorId(Long id) {
		return (StatusAvaliacao) super.recuperarPorId(StatusAvaliacao.class, id);
	}
}
