package br.gov.iphan.sisgep.util;

/**
 * Classe Utilitária para para validar campos vazios "com valor somente com espaçamento",
 * validação em nivel da camada de modelo.
 * @author 	Thiago Nunes Vieira
 **/
public class CampoVazio {
	
	 /**
	  * Metodo responsável valuidar sem o campo esta vazio
	  * @param 		Object obj
	  * @return 	boolean
	  * @author 	Thiago Nunes Vieira
	  **/
	public static boolean isVazio(Object obj){
	     return (obj == null || obj.toString().trim().length() ==0);	
	}
}