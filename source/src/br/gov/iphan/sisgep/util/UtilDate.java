package br.gov.iphan.sisgep.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jboss.seam.annotations.Name;

/**
 * Classe Utilitária para tratamento de datas 
 * @author 	Thiago Nunes Vieira
 **/
@Name("utilDate")
public class UtilDate {
	
	/**
	 * Metodo responsavel por verificar se uma data e menor ou maior que outra
	 * @return  boolean
	 * @param 	Date dataMenor, Date dataMaior
	 * @author 	Thiago Nunes Vieira
	 **/
	public static boolean menorQue(Date dataMenor, Date dataMaior){
		SimpleDateFormat novoFormato = new SimpleDateFormat("yyyyMMdd");
		Integer dtMenor = Integer.parseInt(novoFormato.format(dataMenor));
		Integer dtMaior = Integer.parseInt(novoFormato.format(dataMaior));
		
		if(dtMenor < dtMaior) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Metodo responsavel converter uma data e uma string
	 * @return  String
	 * @param 	Date data
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatDate(Date data){
		SimpleDateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy");
		if(data != null){
			return formatedDate.format(data);
		}
		return "";		
	}
	
	/**
	 * Metodo responsavel converter uma data e uma string
	 * @return  String
	 * @param 	Date data, String format
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String formatDate(Date data, String format){
		SimpleDateFormat formatedDate = new SimpleDateFormat(format);
		if(data != null){
			return formatedDate.format(data);
		}
		return "";		
	}
	
	/**
	 * Metodo responsavel retornar uma string com a data e atual
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public static String currentDateInText(){
		SimpleDateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return formatedDate.format(new Date());
	}
}