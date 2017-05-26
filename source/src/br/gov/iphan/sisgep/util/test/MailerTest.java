package br.gov.iphan.sisgep.util.test;

import javax.mail.MessagingException;
import javax.naming.NamingException;

import org.junit.Test;

import br.gov.iphan.sisgep.util.Mailer;

public class MailerTest {

	@Test
	public final void testSendMsg() {
		String br = System.getProperty("line.separator");
		String body = "Olá Teste" + br;
		body+="A sincronização iniciada foi concluída.";
		body+=br;
		body+="Para maiores detalhes, acesse os dados de histórico no sistema SISGEP.";

		Mailer mailer = new Mailer();
		
		try {
			mailer.sendMsg("fabio.avila@jointecnologia.com.br", "Sincronização SISGEP", body);
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
