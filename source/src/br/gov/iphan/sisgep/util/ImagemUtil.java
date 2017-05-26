package br.gov.iphan.sisgep.util;

import org.jboss.seam.annotations.Name;

/**
 * Classe Utilitária que recupera as imagens do enum IconeURL
 * @author 	Thiago Nunes Vieira
 **/
@Name("imagemUtil")
public class ImagemUtil {
	
	/**
	 * Metodo que recupera as imagens do enum IconeURL
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String getURLIcone(String URL) {
		for(IconeURL icone : IconeURL.values()){
			if(icone.toString().equals(URL)){
				return icone.retornaUrl();
			}
		}
		return null;
	}	
	
}
