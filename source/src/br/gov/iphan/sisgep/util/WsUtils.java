package br.gov.iphan.sisgep.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.text.Collator;
import java.util.Enumeration;
import java.util.Locale;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class WsUtils {

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://ws.cdyne.com/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("example", serverURI);

        /*
        Constructed SOAP Request Message:
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
            <SOAP-ENV:Header/>
            <SOAP-ENV:Body>
                <example:VerifyEmail>
                    <example:email>mutantninja@gmail.com</example:email>
                    <example:LicenseKey>123</example:LicenseKey>
                </example:VerifyEmail>
            </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
         */

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("VerifyEmail", "example");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("email", "example");
        soapBodyElem1.addTextNode("mutantninja@gmail.com");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("LicenseKey", "example");
        soapBodyElem2.addTextNode("123");

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "VerifyEmail");

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }

    public static String requestWs(String xml, String url, String metodo) throws Exception {
		URL urlGo = new URL(url);

		HttpURLConnection con = (HttpURLConnection) urlGo.openConnection();

		con.setRequestProperty("Content-type", "text/xml; charset=ISO-8859-1");
		con.setRequestProperty("SOAPAction", urlGo + "" + metodo);

		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.setDoInput(true);

		OutputStream reqStream = con.getOutputStream();
		reqStream.write(xml.getBytes());

		StringBuilder xmlRetorno = new StringBuilder();
		String line;
		BufferedReader retornoWs = new BufferedReader(new InputStreamReader(con.getInputStream()));
		while ((line = retornoWs.readLine()) != null) {
			xmlRetorno.append(line);
		}
		retornoWs.close();
		con.disconnect();

		return xmlRetorno.toString();
	}

	@SuppressWarnings("restriction")
	public static void setupSSL(String alias, String password, String cacerts) {
		try {
			String javaHomePath = System.getProperty("java.home");
			String keystore = javaHomePath + "/lib/security/cacerts";
			String storepass= "changeit";
			String storetype= "JKS";
			  
			String[][] props = {
			      { "javax.net.ssl.trustStore", keystore, },
			      { "javax.net.ssl.keyStore", keystore, },
			      { "javax.net.ssl.keyStorePassword", storepass, },
			      { "javax.net.ssl.keyStoreType", storetype, },
			    };
			
			for (int i = 0; i < props.length; i++)
				System.getProperties().setProperty(props[i][0], props[i][1]);
			    
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(null, null);
			Enumeration<String> aliasEnum = ks.aliases();
			Collator collator = Collator.getInstance(new Locale("pt", "BR"));
			while (aliasEnum.hasMoreElements()) {
				String aliasKey = (String) aliasEnum.nextElement();
				collator.setStrength(Collator.PRIMARY);
				if (aliasKey.toLowerCase().contains(alias)) {
					System.setProperty("javax.net.ssl.keyStoreAlias", alias);
					System.setProperty("javax.net.ssl.keyStorePassword", password);
					break;
				}
			}

			System.setProperty("javax.net.ssl.trustStoreType", "JKS");
			System.setProperty("javax.net.ssl.trustStore", cacerts);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
