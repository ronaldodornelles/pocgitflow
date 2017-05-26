package br.gov.iphan.sisgep.util;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.faces.FacesMessages;

/**
 * Classe Utilitária para imprimir menssagens para o cliente
 * @author 	Thiago Nunes Vieira
 **/
@Name("mensagensUtil")
public class MensagensUtil {
	
	@In
	FacesMessages facesMessages;
	
	/**
	 * Classe responsavel por concatenar parametros a mensagem
	 * @param   String parametro
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String getMensagem(String parametro) {
		for(Mensagens mensagens : Mensagens.values()){
			if(mensagens.toString().equals(parametro)){
				return mensagens.retornaMensagem(parametro).toString();
			}
		}
		return null;
	}
	
}
