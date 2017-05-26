package br.gov.iphan.sisgep.util;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;

/**
 * Classe Utilitária para tratamento de diversar funções do sistemas
 * @author 	Thiago Nunes Vieira
 **/
@Name("util")
public class Util {
	
	@Logger
	private Log log;
	
	/**
	 * Metodo responsavel por retornar a versão do sistema de 
	 * acordo com o MANIFEST.MF da aplicação
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public String getBuildVersion() {
		try {
			HttpServletRequest request = ((HttpServletRequest) FacesContext
					.getCurrentInstance().getExternalContext().getRequest());
			@SuppressWarnings("deprecation")
			String appServerHome = request.getRealPath("/");

			File manifestFile = new File(appServerHome, "META-INF/MANIFEST.MF");

			Manifest mf = new Manifest();
			mf.read(new FileInputStream(manifestFile));

			Attributes atts = mf.getMainAttributes();

			String version = atts.getValue("Implementation-Version");
			if (version == null) {
				version = "{version}";
			}
			return version + " " ;
		} catch (Exception e) {
			log.error("Falha ao ler informações de versão da aplicação.", e);
		}

		return null;
	}
	
	/**
	 * Metodo responsavel por retornar formatado um valor monetario para o padrão brasileiro
	 * @param   Object value
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatMoney(Object value){
		if(value != null) {
			Locale BRAZIL = new Locale("pt","BR"); 
			DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL); 
		    NumberFormat nf = new DecimalFormat("¤ ###,###,##0.00",REAL);  
		    return nf.format(value);
		}
		return "";
	}
	
	/**
	 * Metodo responsavel por retornar formatado o cpf com mascara
	 * @param   Object value
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatCPF(Object value){
		String cpf=(String) value;
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");  
        Matcher matcher = pattern.matcher(cpf);  
        if (matcher.matches())   
            cpf = matcher.replaceAll("$1.$2.$3-$4");  
        return cpf;       
	}
	
	/**
	 * Metodo responsavel por retornar formatado os codigos sispe com mascara
	 * @param   String prefixo,Long value
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatCodigoCombo(String prefixo,Long value){
		String retorno= prefixo + value.toString();
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{4})");  
        Matcher matcher = pattern.matcher(retorno);  
        if (matcher.matches())   
        	retorno = matcher.replaceAll("$1.$2");  
        return retorno;       
	}
	
	/**
	 * Metodo responsavel por retornar formatado uma string com mascara
	 * @param   int tamanho ,Long value
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatCargo(int tamanho ,Long value){
		String retorno=value.toString();
		int size = retorno.length();
		if(size < tamanho){
			int add = tamanho - size;
			for(int i=0; i<add; i++){
				retorno = "0"+retorno;
			}
		}
		return retorno;
	}
}
