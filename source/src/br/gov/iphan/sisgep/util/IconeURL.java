package br.gov.iphan.sisgep.util;

/**
 * Classe Utilitária que contem um Enum com os principais icones do sistema
 * @author 	Thiago Nunes Vieira
 **/
public enum IconeURL {
	EDITAR("/img/editar.png"),
	EXCLUIR("/img/excluir.gif"),
	DETALHAR("/img/zoom.png"),
	DOWNLOAD("/img/disk_download.png"),
	ADD("/img/add.png"),
	IMPRIMIR("/img/imprimir.jpg"),
	ENTRAR("/img/bt_entrar.png"),
	ACESSAR("/img/bt_acessar.png"),
	OP_ADD("/img/op_add_e.png"),
	OP_CONFIG("/img/op_config_e.png"),
	OP_VOLTAR("/img/op_voltar.png"),
	OP_HOME("/img/op_home.png"),
	BT_SAVE("/img/bt_save.png"),
	BT_BACK("/img/bt_back.png"),
	FOLDER("/img/folder.png"),
	ACAO_ATIVO("/img/acao_ativo.png"),
	ACAO_INATIVO("/img/acao_inativo.png"),
	ALTERAR("/img/alterar.png"),
	INCLUIR("/img/incluir.png"),
	VISUALIZAR("/img/visualizar.png"),
	VINCULAR("/img/onetomany.gif"),
	LINK("/img/link.png"),
	PERFIL("/img/perfil.png"),
	HOME1("/img/home.png"),
	REMOVE("/img/finalizar.png"),
	PUBLICAR("/img/publicar.png"),
	NAO_PUBLICAR("/img/nao_publicar.png"),
	HOME2("/img/casa_icone.png"),
	CHEFIA("/img/chefia.PNG");
	
	private String url;
	
	/**
	 * Contrutor padrão da classe
	 * @param   String url
	 * @author 	Thiago Nunes Vieira
	 **/
	IconeURL(String url){
		this.url=url;
	}
	
	/**
	 * Medoto responsável por retornar o caminho da imagem
	 * @return  String
	 * @author 	Thiago Nunes Vieira
	 **/
	public String retornaUrl() {
		return url;
	}
}