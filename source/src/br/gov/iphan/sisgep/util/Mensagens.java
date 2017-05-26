package br.gov.iphan.sisgep.util;

import org.jboss.seam.annotations.Name;

/**
 * Classe Utilitária que contem um Enum com as principais menssagem do sistema
 * @author 	Thiago Nunes Vieira
 **/
@Name("mensagens")
public enum Mensagens {

	MSGI000("Nenhum registro encontrado."),
	MSGI001("Operação realizada com sucesso."),

	MSGW001("Não é possível realizar essa operação! Existe(m) associação(ões) para esse registro."),
	MSGW002("O registro 'MSGTAG' já existe."),
	MSGW004("A 'MSGTAG' não pode ser maior que a data atual."),
	MSGW009("A MSGTAG não pode ser menor que a data de entrada."),
	MSGW012("Soma dos pontos de Escala deve ser igual ao Valor Máximo do Subfator."),
	MSGW013("Máximo de 5 servidores por equipe."),
	MSGW014("Selecione ao menos um servidor."),
	MSGW015("Não é possível excluir a Equipe, pois já existe uma Avaliação associada a ela."),
	MSGW016("Não é possível excluir a Subcategoria, pois já existe um Tipo Avaliação associada a ela."),
	MSGW017("Esse servidor já pertence a outra equipe."),
	MSGW018("Instituição de Ensino salva com sucesso."),
	MSGW019("Não é possível excluir a Área de Atuação, pois já existe um Cargo Efetivo associado a ele.");
	private String mensagem;
	
	
	/**
	 * Contrutor padrão da classe
	 * @param   String mensagem
	 * @author 	Thiago Nunes Vieira
	 **/
	Mensagens(String mensagem){
		this.mensagem=mensagem;	
	}
	
	/**
	 * Medoto com a função de retornar a messagem com os parametros concatenados
	 * @param   String parametro
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public String retornaMensagem(String parametro) {
		String mensagemRetorno=mensagem.replaceAll("MSGTAG", parametro);
		return mensagemRetorno;
	}
	public String retornaMensagem() {
		return this.mensagem;
	}
}
