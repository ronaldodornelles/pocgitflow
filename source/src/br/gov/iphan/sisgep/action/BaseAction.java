package br.gov.iphan.sisgep.action;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.FlushModeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.international.StatusMessage.Severity;

import br.gov.iphan.sisgep.entity.FimDependente;

/**
 * Classe Abstrata responsável por conceder funções basicas para todas Action   
 * da Aplicação.
 * 
 * @author 	Thiago Nunes Vieira
 **/
public abstract class BaseAction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static String CONTENT_TYPE_PDF = "application/pdf";
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isIncluir;
	
	@In(create = true, required = false)
	@Out(required = false)
	ControllerHelper controllerHelper;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isEditar;

	@In(create = true, required = false)
	@Out(required = false)
	public Boolean isVisualizar;
	
	@In(create = true, required = false)
	@Out(required = false)
	public Boolean reRenderModal;

	@Create
	@Begin(flushMode = FlushModeType.MANUAL, join = true)
	public void init() {
	}
	
	public String link = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()+"/help/start.html";
	
	@In
	public FacesMessages facesMessages;

	/**
	 * Metodo responsável por imprimir mensagem de ALERTA padrão para registro existentes.
	 * @param registro    String com o valor do registro duplicado.
	 * @author            Thiago Nunes Vieira
	 **/
	public void registroExistente(String registro) {
		facesMessages.add(
				Severity.WARN,
				"O registro "
						+ '"'
						+ (registro.length() < 50 ? registro : (registro
								.substring(0, 25) + "...")) + '"'
						+ " já existe.");
	}

	/**
	 * Metodo responsável por imprimir mensagem de ALERTA padrão para registro existente
	 * e informar que ele se encontra Inativado.
	 * @param registro    String com o valor do registro duplicado.
	 * @author            Thiago Nunes Vieira
	 **/
	public void registroExistenteInativo(String registro) {
		facesMessages.add(
				Severity.WARN,
				"O registro "
						+ '"'
						+ (registro.length() < 50 ? registro : (registro
								.substring(0, 25) + "...")) + '"'
						+ " já existe e está inativo.");
	}

	/**
	 * Metodo responsável por imprimir mensagens de INFORMAÇÃO.
	 * @param msg    	  String com conteúdo da mensagem.
	 * @author            Thiago Nunes Vieira
	 **/
	public void mensagemInfo(String msg) {
		facesMessages.add(Severity.INFO, msg);
	}

	/**
	 * Metodo responsável por imprimir mensagens de ERRO.
	 * @param msg    	  String com conteúdo da mensagem.
	 * @author            Thiago Nunes Vieira
	 **/
	public void mensagemErro(String msg) {
		facesMessages.add(Severity.ERROR, msg);
	}

	/**
	 * Metodo responsável por imprimir mensagens de ALERTA.
	 * @param msg    	  String com conteúdo da mensagem.
	 * @author            Thiago Nunes Vieira
	 **/
	public void mensagemWarn(String msg) {
		facesMessages.add(Severity.WARN, msg);
	}

	/**
	 * Metodo responsável por imprimir mensagens de ALERTA.
	 * @param msg    	  String com conteúdo da mensagem.
	 * @param msg    	  Object em que a mensagem diz respeito.
	 * @author            Thiago Nunes Vieira
	 **/
	public void mensagemWarn(String msg, Object... params) {
		facesMessages.add(Severity.WARN, msg, params);
	}

	/**
	 * Metodo responsável por responder via Servlet por meio do protocolo HTTP.
	 * @return HttpServletResponse  HttpServletResponse response de envio para o Servlet.
	 * @author            Thiago Nunes Vieira
	 **/
	public HttpServletResponse getResponse() {

		return (HttpServletResponse) FacesContext.getCurrentInstance()
				.getExternalContext().getResponse();

	}

	/**
	 * Metodo responsável receber via Servlet as requisições realizadas por meio do protocolo HTTP.
	 * @return HttpServletResponse  HttpServletResponse request de envio para o Servlet.
	 * @author            Thiago Nunes Vieira
	 **/
	public HttpServletRequest getRequest() {

		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();

	}

	/**
	 * Metodo responsável por realizar o Download de arquuivo.
	 * @param nomeArquivo String com nome do arquivo.
	 * @param arquivo     byte[] array de bytes com o conteúdo do arquivo em binário.
	 * @author            Thiago Nunes Vieira
	 **/
	public void downloadArquivo(String nomeArquivo, byte[] arquivo,
			String contetType, String mensagemArquivoInexistente) {

		if (arquivo != null && arquivo.length > 0) {

			getResponse().setContentType(contetType);
			getResponse().setHeader(
					"Content-disposition",
					"inline;filename="
							+ new StringBuffer(nomeArquivo).toString());
			getResponse().setHeader("Content-disposition",
					"attachment;filename=" + nomeArquivo);
			try {
				getResponse().getOutputStream().write(arquivo);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			FacesContext.getCurrentInstance().responseComplete();
		} else {
			mensagemWarn(mensagemArquivoInexistente);
		}

	}

	/**
	 * Metodo responsável por realizar a copia dos atributos de um objeto para outro object 
	 * sem manter o vinculos entre os dois.
	 * @param destino 	  Object que rebecerá os valores dos atributos copiados.
	 * @param origem      Object o qual os atributos será copiado os valores dos atributos.
	 * @author            Thiago Nunes Vieira
	 **/
	public void copyPropertiesObject(Object destino, Object origem) {
		try {
			BeanUtils.copyProperties(destino, origem);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo responsável por converter um Date em uma String.
	 * @param date 	  	  Date usa para obter a data que será convertida.
	 * @param mask        String que contém a mascara a ser aplicada na conversão.
	 * @return			  Strin com o resultado da coversão.
	 * @author            Thiago Nunes Vieira
	 **/
	public String formataData(Date date, String mask) {
		DateFormat df = new SimpleDateFormat (mask);  
		return df.format(date);
	}
	
	/**
	 * Metodo responsável por converter um List em uma String.
	 * @param list 	  	  list usa para obter a valor que será convertida.
	 * @return			  Strin com o resultado da coversão.
	 * @author            Thiago Nunes Vieira
	 **/
	public String gerarString(List<FimDependente> list) {
		String value = "";
		for(FimDependente fimDependente : list){
			value += fimDependente.getDesFimDependente() + ", ";
		}
		String nova="";
		if(!value.trim().equals("")){
			nova = value.trim().substring (0, value.length() - 2);
			return nova.length() > 1 ? nova : "-";
		}
		return "-";
	}
	
	public FacesMessages getFacesMessages() {
		return facesMessages;
	}

	public void setFacesMessages(FacesMessages facesMessages) {
		this.facesMessages = facesMessages;
	}

	public String getLink() {
		return link;
	}	
}