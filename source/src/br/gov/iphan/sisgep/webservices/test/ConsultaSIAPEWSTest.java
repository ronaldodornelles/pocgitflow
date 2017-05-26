package br.gov.iphan.sisgep.webservices.test;

import java.util.List;

import org.junit.Test;

import br.gov.iphan.sisgep.webservices.ConsultaSIAPEWS;
import br.gov.iphan.sisgep.webservices.vo.ParametrosEntradaSIAPE;
import br.gov.iphan.sisgep.ws.DadosPessoais;
import br.gov.iphan.sisgep.ws.Uorg;

public class ConsultaSIAPEWSTest {

	@Test
	public final void testListaUorgs() {
		try {
			ConsultaSIAPEWS consultaWS = new ConsultaSIAPEWS("https://www1.siapenet.gov.br/WSSiapenet/services/ConsultaSIAPE?wsdl");
			ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
			List<Uorg> uorgs = consultaWS.listaUorgs(parametros);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public final void testConsultaDadosPessoais() {
		try {
			ConsultaSIAPEWS consultaWS = new ConsultaSIAPEWS("https://www1.siapenet.gov.br/WSSiapenet/services/ConsultaSIAPE?wsdl");
			ParametrosEntradaSIAPE parametros = new ParametrosEntradaSIAPE();
			DadosPessoais dadosPessoais = consultaWS.consultaDadosPessoais(parametros);
			System.out.println(dadosPessoais.getNome().getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
