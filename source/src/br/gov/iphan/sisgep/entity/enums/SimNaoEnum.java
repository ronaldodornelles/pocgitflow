package br.gov.iphan.sisgep.entity.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Enum resposável por padronizar o valores para as resposta 
 * 'SIM' e 'NÂO' a nível de aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
public enum SimNaoEnum {
	SIM("S", 1L, true,"SIM"), 
	NAO("N", 0L, false,"Sim"); 
	
	boolean check;
	String chave;
	String descricao;
	Long value;
	
	/**
	 * Metodo construtor padrão do Enum.
	 * @param chave   	  String com função de campo indetificador
	 * @param value   	  Long com função de indetificar SIM/NAO de forma numérica 
	 * @param check	  	  boolean com função de indetificar SIM/NAO de forma booleana
	 * @param descricao	  String com função de descrever a resposta       
	 * @author            Thiago Nunes Vieira
	 **/
	SimNaoEnum(String chave, Long value, boolean check, String descricao){
		this.chave = chave;
		this.value = value;
		this.check = check;
		this.descricao = descricao;
	}
	
	/**
	 * Metodo responsável por retornar a coleção de resposntas.
	 * @return     		  List<SimNaoEnum> lista de resposntas.  
	 * @author            Thiago Nunes Vieira
	 **/
	public List<SimNaoEnum> getValues(){
		return Arrays.asList(values());
	}
	
	public String getChave(){
		return this.chave;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	public boolean isCheck() {
		return check;
	}
	public Long getValue() {
		return value;
	}

}
