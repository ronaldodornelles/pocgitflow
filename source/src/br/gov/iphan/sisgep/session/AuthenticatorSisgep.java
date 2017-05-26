package br.gov.iphan.sisgep.session;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

import br.gov.iphan.autenticador.ErroVO;
import br.gov.iphan.autenticador.FuncionalidadeVO;
import br.gov.iphan.autenticador.UsuarioSistemaWS;
import br.gov.iphan.autenticador.UsuarioSistemaWSProxy;
import br.gov.iphan.sisgep.entity.corp.PessoaContato;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;

import com.thoughtworks.xstream.XStream;
/**
* Classe responsável por realizar a autencicação do Usuário no sistema.
* 
* @author 	Thiago Nunes Vieira
**/

@Name("authenticatorSisgep")
public class AuthenticatorSisgep
{
		@Logger private Log log;
	    @In Identity identity;
	    @In Credentials credentials;
		@In public FacesMessages facesMessages;
		
		
	    UsuarioSistemaWS usuarioSistemaWS = new UsuarioSistemaWSProxy();
		XStream retorno = new XStream();
	    
		/**
		* Metodo responsável por realizar a autencicação do Usuário no sistema.
		* 
		* @author Thiago Nunes Vieira
		**/
	    @SuppressWarnings({ "unused" })
		public boolean authenticate(){
	    	try{
	    	log.info("authenticating {0}", credentials.getUsername());
	    	//#TODO Retirar
	    	String result =  consultarUsuarioSISCAU(credentials);
	    	//String result = "result";
	    	
	    	Contexts.getSessionContext().set("user", credentials);
	    	
	    	
	        List<FuncionalidadeVO> listaFuncionalidades = null ;
	    	if(result.contains("<br.gov.iphan.siscau.ws.vo.ErroVO>") && !result.contains("Nenhuma funcionalidade (CAT_FUNCIONALIDADE) encontrada para esse usuário")){
	    		retorno.alias("br.gov.iphan.siscau.ws.vo.ErroVO", ErroVO.class);
	    		ErroVO erro = (ErroVO) retorno.fromXML(result);    		
				return false;
	    	}else{
	    		retorno.alias("br.gov.iphan.siscau.ws.vo.FuncionalidadeVO", FuncionalidadeVO.class);
				retorno.alias("list", List.class);
				retorno.alias("br.gov.iphan.siscau.ws.vo.FuncionalidadeVO", FuncionalidadeVO.class);
				retorno.alias("list", List.class);
		    	//#TODO Retirar								
				//listaFuncionalidades = (List<FuncionalidadeVO>) retorno.fromXML(result);
				listaFuncionalidades = new ArrayList<FuncionalidadeVO>();
				
	    		identity.addRole("admin");
	            return true;
	            
	    	}
	    	}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	    }
	    
		/**
		* Metodo responsável por consultar o Usuário no WebService do SISCAU.
		* @param  Credentials credentials
		* @return String					retorno do webService
		* @author 							Thiago Nunes Vieira
		**/
		public String consultarUsuarioSISCAU(Credentials credentials) {
			String result = null;
			
			try{
				Properties properties = new Properties();
				properties.load(getClass().getResourceAsStream("/authenticator.properties"));
				result = usuarioSistemaWS.autenticaUsuario(credentials.getUsername(), credentials.getPassword(), properties.getProperty("sistema"));
			
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ClassCastException e) {
				e.printStackTrace();		
			}catch (IOException e) {
				e.printStackTrace();
			}
			return result == null ? "" : result;
		}
		
		public PessoaFisica getEmailUsuario(Credentials credentials) {
			String result = null;
			String email = new String();
			
			Credentials user = (Credentials) Contexts.getSessionContext().get("user");
			PessoaFisica pessoa = new PessoaFisica();
			try{
				Properties properties = new Properties();
				properties.load(getClass().getResourceAsStream("/authenticator.properties"));
				result = usuarioSistemaWS.pesquisaDadosUsuario(user.getUsername());
				result = "<list>" + result + "</list>"; 
				email = mineraEmail(result);  
				
				pessoa.setNomPessoaFisica(user.getUsername());
				PessoaContato pessoaContatoEmail = new PessoaContato();
				pessoaContatoEmail.setTxtContato(email);
				pessoa.setPessoaContatoEmail(pessoaContatoEmail);
				
				
			
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ClassCastException e) {
				e.printStackTrace();		
			}catch (IOException e) {
				e.printStackTrace();
			}
			return pessoa;
		}

		private String mineraEmail(String fromXML) {
			String xml = (String) fromXML;
			xml.replaceAll("<", "");
			xml.replaceAll("/>", "");
			xml.replaceAll(">", "");
			String[] miolo = xml.split("emailUsuario");
			String email = " >iris.ferrera@jointecnologia.com.br</";
			
			if (miolo != null && miolo.length > 1) {
				System.out.println(miolo[1]); 
				email = miolo[1];
			}

			email = email.replaceAll(">", "");
			email = email.replaceAll("<", "");
			email = email.replaceAll("/", "");
			System.out.println(email); 
			
			return email;
		}
		
		
	    
}
