package br.gov.iphan.sisgep.entity;

import java.io.Serializable;
/**
 * Classe Abstrata responsável por implementar a classe Serializable.
 * Responsável também por conceder serialização e funções comuns paras todos 
 * os POJO's da Aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
public class EntidadeAbstrata implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Metodo responsável por eliminar caracteres especiais de uma String.
	 * @param valor   	  String inicial com caracteres especiais
	 * @return     		  String final sem os caracteres especiais
	 * @author            Thiago Nunes Vieira
	 **/
	public String removerCaracteresEsp (String valor){
		if(valor != null){
	      valor = valor.replaceAll("[ÂÀÁÄÃ]","A");  
	      valor = valor.replaceAll("[âãàáä]","a");  
	      valor = valor.replaceAll("[ÊÈÉË]","E");  
	      valor = valor.replaceAll("[êèéë]","e");  
	      valor = valor.replaceAll("ÎÍÌÏ","I");  
	      valor = valor.replaceAll("îíìï","i");  
	      valor = valor.replaceAll("[ÔÕÒÓÖ]","O");  
	      valor = valor.replaceAll("[ôõòóö]","o");  
	      valor = valor.replaceAll("[ÛÙÚÜ]","U");  
	      valor = valor.replaceAll("[ûúùü]","u");  
	      valor = valor.replaceAll("Ç","C");  
	      valor = valor.replaceAll("ç","c");   
	      valor = valor.replaceAll("[ýÿ]","y");  
	      valor = valor.replaceAll("Ý","Y");  
	      valor = valor.replaceAll("ñ","n");  
	      valor = valor.replaceAll("Ñ","N");  
	      valor = valor.replaceAll("['<>\\|/]",""); 
	      valor = valor.replace(".",""); 
	      valor = valor.replace("-",""); 
	      return valor;  
		}
		  return "";
	   }
}