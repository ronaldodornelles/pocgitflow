package br.gov.iphan.sisgep.util;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("email")
@Scope(ScopeType.CONVERSATION)
public class Email {
	/*

	@Logger
	private Log log;

	@In
	private FacesMessages facesMessages;

	@In
	Credentials credentials;

	@In
	private Renderer renderer;

	private final String EMAIL_SINCRONIZACAO = "/pages/email/sincronizacaoConcluida.xhtml";

	@In(create = true)
	private PessoaFisica pessoa;

	public void send() {
		try {
			AuthenticatorSisgep authenticatorSisgep = new AuthenticatorSisgep();
			pessoa = authenticatorSisgep.getEmailUsuario(credentials);

			renderer.render(EMAIL_SINCRONIZACAO);
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			log.error("Error sending mail", e);
			facesMessages.add(FacesMessage.SEVERITY_INFO, "Email sending failed: " + e.getMessage());
		}
	}

	public void sendAttachment() {
		try {
			renderer.render("/attachment.xhtml");
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			log.error("Error sending mail", e);
			facesMessages.add(FacesMessage.SEVERITY_INFO, "Email sending failed: " + e.getMessage());
		}
	}

	public void sendHtml() {
		try {
			renderer.render("/html.xhtml");
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			log.error("Error sending mail", e);
			facesMessages.add("Email sending failed:" + e.getMessage());
		}
	}

	public void sendPlain() {
		try {
			renderer.render("/plain.xhtml");
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			log.error("Error sending mail", e);
			facesMessages.add("Email sending failed: " + e.getMessage());
		}
	}

	public void sendTemplate() {
		try {
			renderer.render("/templating.xhtml");
			facesMessages.add("Email sent successfully");
		} catch (Exception e) {
			log.error("Error sending mail", e);
			facesMessages.add("Email sending failed: " + e.getMessage());
		}
	}

	@Factory("numbers")
	public URL getFile() {
		return ResourceLoader.instance().getResource("/numbers.csv");
	}
*/
}
