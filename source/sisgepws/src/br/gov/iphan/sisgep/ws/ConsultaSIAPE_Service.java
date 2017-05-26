
package br.gov.iphan.sisgep.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "ConsultaSIAPE", targetNamespace = "http://servico.wssiapenet", wsdlLocation = "file:/C:/git/sisgep/source/WebContent/ConsultaSIAPE.wsdl")
public class ConsultaSIAPE_Service
    extends Service
{

    private final static URL CONSULTASIAPE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("file:/C:/git/sisgep/source/WebContent/ConsultaSIAPE.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        CONSULTASIAPE_WSDL_LOCATION = url;
    }

    public ConsultaSIAPE_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaSIAPE_Service() {
        super(CONSULTASIAPE_WSDL_LOCATION, new QName("http://servico.wssiapenet", "ConsultaSIAPE"));
    }

    /**
     * 
     * @return
     *     returns ConsultaSIAPE
     */
    @WebEndpoint(name = "ConsultaSIAPEHttpPort")
    public ConsultaSIAPE getConsultaSIAPEHttpPort() {
        return (ConsultaSIAPE)super.getPort(new QName("http://servico.wssiapenet", "ConsultaSIAPEHttpPort"), ConsultaSIAPE.class);
    }

}