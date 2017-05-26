package br.gov.iphan.sisgep.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.soap.SOAPFaultException;

import br.gov.iphan.sisgep.ws.SQLException_Exception;
import br.gov.iphan.sisgep.ws.ConsultaSIAPE;
import br.gov.iphan.sisgep.ws.ConsultaSIAPE_Service;
import br.gov.iphan.sisgep.ws.ArrayDadosAfastamento;
import br.gov.iphan.sisgep.ws.ArrayDadosDependentes;
import br.gov.iphan.sisgep.ws.ArrayDadosFuncionais;
import br.gov.iphan.sisgep.ws.ArrayOfServidor;
import br.gov.iphan.sisgep.ws.ArrayOfUorg;
import br.gov.iphan.sisgep.ws.DadosAfastamentoPorMatricula;
import br.gov.iphan.sisgep.ws.DadosDependentes;
import br.gov.iphan.sisgep.ws.DadosDocumentacao;
import br.gov.iphan.sisgep.ws.DadosEnderecoResidencial;
import br.gov.iphan.sisgep.ws.DadosEscolares;
import br.gov.iphan.sisgep.ws.DadosFuncionais;
import br.gov.iphan.sisgep.ws.DadosPessoais;
import br.gov.iphan.sisgep.ws.Servidor;
import br.gov.iphan.sisgep.ws.Uorg;
import br.gov.iphan.sisgep.webservices.vo.ParametrosEntradaSIAPE;

public class ConsultaSIAPEWS {

	QName serviceName = new QName("http://servico.wssiapenet", "ConsultaSIAPE");
	ConsultaSIAPE_Service service = new ConsultaSIAPE_Service();
	ConsultaSIAPE port = service.getConsultaSIAPEHttpPort();
	
	public ConsultaSIAPEWS(String url) throws MalformedURLException {
		URL wsdlLocation = new URL(url);
		service = new ConsultaSIAPE_Service(wsdlLocation, serviceName);
		//service = new ConsultaSIAPE_Service();
		port = service.getConsultaSIAPEHttpPort();
	}
	
	public DadosPessoais consultaDadosPessoais(ParametrosEntradaSIAPE entrada) throws Exception {
			DadosPessoais dadosPessoais = null;
			try {
				dadosPessoais = port.consultaDadosPessoais(entrada.getSiglaSistema(), 
						entrada.getNomeSistema(), 
						entrada.getSenha(), 
						entrada.getCpf(), 
						entrada.getCodigoOrgao(), 
						entrada.getParametroExistePagamento(), 
						entrada.getParametroTipoVinculo());
			} catch (SQLException_Exception e) {
				e.printStackTrace();
				throw new Exception(e.getMessage(), e.getCause());
			} catch (SOAPFaultException e1) {
				e1.printStackTrace();
			}
 			
			return dadosPessoais;
	}

	public DadosDocumentacao consultaDadosDocumentacao(ParametrosEntradaSIAPE entrada) throws Exception {
		DadosDocumentacao dadosDocumentacao = null;
		try {
			dadosDocumentacao = port.consultaDadosDocumentacao(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosDocumentacao;
	}

	public List<DadosFuncionais> consultaDadosFuncionais(ParametrosEntradaSIAPE entrada) throws Exception {
		List<DadosFuncionais> dadosFuncionais = new ArrayList<DadosFuncionais>();
		try {
			ArrayDadosFuncionais dados = port.consultaDadosFuncionais(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
			
			dadosFuncionais = dados.getDadosFuncionais().getValue().getDadosFuncionais();
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosFuncionais;
	}

	public List<DadosDependentes> consultaDadosDependentes(ParametrosEntradaSIAPE entrada) throws Exception {
		List<DadosDependentes> dadosDependentes = new ArrayList<DadosDependentes>();
		try {
			ArrayDadosDependentes dados = port.consultaDadosDependentes(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
			
			dadosDependentes = dados.getDadosDependentes().getValue().getDadosDependentes();
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosDependentes;
	}

	public DadosEscolares consultaDadosEscolares(ParametrosEntradaSIAPE entrada) throws Exception {
		DadosEscolares dadosEscolares = null;
		try {
			dadosEscolares = port.consultaDadosEscolares(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosEscolares;
	}
	
	public DadosEnderecoResidencial consultaDadosEnderecoResidencial(ParametrosEntradaSIAPE entrada) throws Exception {
		DadosEnderecoResidencial dadosEnderecoResidencial = null;
		try {
			dadosEnderecoResidencial = port.consultaDadosEnderecoResidencial(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosEnderecoResidencial;
	}
	
	public List<DadosAfastamentoPorMatricula> consultaDadosAfastamento(ParametrosEntradaSIAPE entrada) throws Exception {
		List<DadosAfastamentoPorMatricula> dadosAfastamento = new ArrayList<DadosAfastamentoPorMatricula>();
		try {
			ArrayDadosAfastamento arrayDados = port.consultaDadosAfastamento(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(), 
					entrada.getParametroExistePagamento(), 
					entrada.getParametroTipoVinculo());
			
			dadosAfastamento = arrayDados.getDadosAfastamentoPorMatricula().getValue().getDadosAfastamentoPorMatricula();
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage(), e.getCause());
		} catch (SOAPFaultException e1) {
			e1.printStackTrace();
		}
		
		return dadosAfastamento;
	}
	
	public List<Uorg> listaUorgs(ParametrosEntradaSIAPE entrada) throws Exception {
		List<Uorg> uorgs = new ArrayList<Uorg>();
		ArrayOfUorg dados = port.listaUorgs(entrada.getSiglaSistema(), 
				entrada.getNomeSistema(), 
				entrada.getSenha(), 
				entrada.getCpf(), 
				entrada.getCodigoOrgao(),
				"");

		uorgs = dados.getUorg();
		
		return uorgs;
	}
	
	public List<Servidor> listaServidores(ParametrosEntradaSIAPE entrada) throws Exception {
		List<Servidor> servidores = new ArrayList<Servidor>();
		try {
			ArrayOfServidor dados = port.listaServidores(entrada.getSiglaSistema(), 
					entrada.getNomeSistema(), 
					entrada.getSenha(), 
					entrada.getCpf(), 
					entrada.getCodigoOrgao(),
					entrada.getCodigoUnidadeOrganizacional());

			servidores = dados.getServidor();
		} catch (SOAPFaultException e) {
			e.printStackTrace();
		}
		
		return servidores;
	}
	

}
