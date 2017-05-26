package br.gov.iphan.sisgep.manager;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.transaction.UserTransaction;

import br.gov.iphan.sisgep.entity.EntidadeBase;
import br.gov.iphan.sisgep.entity.Servidor;

/**
 * Classe responsável por promover o mecanismo de persintêcia e consulta para entidade Servidor. 
 * 
 * @author 	Thiago Nunes Vieira
 **/
@Name("servidorManagerUserTransaction")
@AutoCreate
@TransactionManagement(TransactionManagementType.BEAN)
public class ServidorManagerUserTransaction extends BaseManagerImpl<Servidor> {

	@Override
	public Servidor salvar(EntidadeBase entity) {
		UserTransaction userTransaction = null;
		try {
			userTransaction = org.jboss.seam.transaction.Transaction.instance();
			userTransaction.setTransactionTimeout(1000 * 60 * 60);
			userTransaction.begin();
			super.salvar(entity);
			
			userTransaction.commit();
			
		} catch (Exception e) {
			try {
				if (userTransaction.isActive()) {
					userTransaction.rollback();
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return (Servidor) entity;
	}
	


		
}