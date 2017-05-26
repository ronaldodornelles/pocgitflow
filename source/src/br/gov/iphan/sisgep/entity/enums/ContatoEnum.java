package br.gov.iphan.sisgep.entity.enums;

import java.util.Arrays;
import java.util.List;


/**
 * Enum resposável por padronizar aos tipo de contato em nível de aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
public enum ContatoEnum {
	CELULAR(	"C","Telefone Celular"), 
	TELEFONE(	"F","Telefone Fixo"), 
	EMAIL(		"P","Email Pessoal"), 
	EMAIL_CORP(	"I","Email Corporativo"); 
	
	String chave;
	String descricao;
	
	/**
	 * Metodo construtor padrão do Enum.
	 * @param chave   	  String com função de campo indetificador
	 * @param descricao	  String com função de descrever o tipo de contato  
	 * @author            Thiago Nunes Vieira
	 **/
	ContatoEnum(String chave, String descricao){
		this.chave = chave;
		this.descricao = descricao;
	}
	
	/**
	 * Metodo responsável por retornar a coleção de tipos de contato.
	 * @return     		  List<ContatoEnum> lista de tipos de contatos.  
	 * @author            Thiago Nunes Vieira
	 **/
	public List<ContatoEnum> getValues(){
		return Arrays.asList(values());
	}
	
	public String getChave(){
		return this.chave;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	
}
