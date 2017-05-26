package br.gov.iphan.sisgep.entity;

import java.io.Serializable;
/**
 * Interface responsável garantir a padronização de acesso aos Indetificadores 
 * de todos os POJO's da Aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
public interface EntidadeBase extends Serializable {
	
	public abstract Long getId();

}
