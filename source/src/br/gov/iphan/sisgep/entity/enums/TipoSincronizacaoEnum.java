package br.gov.iphan.sisgep.entity.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoSincronizacaoEnum {
	SIAPE(1,"SIAPE"), 
	ARQUIVO(2,"Arquivo");
	
	int chave;
	String descricao;
	
	TipoSincronizacaoEnum(int chave){
		this.chave = chave;
	}
	
	
	
	TipoSincronizacaoEnum(int chave, String descricao){
		this.chave = chave;
		this.descricao = descricao;
	}
	
	/**
	 * Metodo responsável por retornar a coleção de tipos de sincronizacao.
	 * @return     		  List<TipoSincronizacaoEnum> lista de tipos de sincronizacao.  
	 **/
	public List<TipoSincronizacaoEnum> getValues(){
		return Arrays.asList(values());
	}
	
	public int getChave(){
		return this.chave;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public static TipoSincronizacaoEnum valueOfInt(Integer chave) {
		   if (chave != null) {
		       int idInt = chave.intValue();
		       for (TipoSincronizacaoEnum e : values()) {
		               if (e.getChave() == idInt) {
		                   return e;
		               }
		           }
		   }
		   return null;
		}
}
