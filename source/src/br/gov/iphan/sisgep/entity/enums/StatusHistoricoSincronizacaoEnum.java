package br.gov.iphan.sisgep.entity.enums;

import java.util.Arrays;
import java.util.List;

public enum StatusHistoricoSincronizacaoEnum {
	INCLUIDO(1,"Incluído"), 
	ALTERADO(2,"Alterado");
	
	int chave;
	String descricao;
	
	StatusHistoricoSincronizacaoEnum(int chave){
		this.chave = chave;
	}
	
	
	
	StatusHistoricoSincronizacaoEnum(int chave, String descricao){
		this.chave = chave;
		this.descricao = descricao;
	}
	
	public List<StatusHistoricoSincronizacaoEnum> getValues(){
		return Arrays.asList(values());
	}
	
	public int getChave(){
		return this.chave;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public static StatusHistoricoSincronizacaoEnum valueOfInt(Integer chave) {
		   if (chave != null) {
		       int idInt = chave.intValue();
		       for (StatusHistoricoSincronizacaoEnum e : values()) {
		               if (e.getChave() == idInt) {
		                   return e;
		               }
		           }
		   }
		   return null;
		}
}
