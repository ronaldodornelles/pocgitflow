package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.contexts.SessionContext;

import br.gov.iphan.sisgep.entity.corp.PessoaContato;
import br.gov.iphan.sisgep.entity.corp.PessoaEndereco;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.enums.ContatoEnum;
import br.gov.iphan.sisgep.manager.PessoaFisicaManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por promover e tratar ações pertinentes a entidade
 * PessoaFisica e as entidade associadas a ela.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("manterPessoaFisicaAction")
@Scope(ScopeType.CONVERSATION)
public class ManterPessoaFisicaAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	private Boolean isIncluindo;
	private Boolean isEditando;
	private Boolean isVisualizando;

	@In(required = false, create = true)
	private PessoaFisicaManager pessoaFisicaManager;
	
	@In(required = false, create = true)
	private CombosAuxiliarAction combosAuxiliarAction; 

	@In(required = false, create = true)
	@Out(required = false)
	private PessoaFisica pessoaFisica;
	
	
	
	private PessoaFisica pessoaFisicaConsulta;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<PessoaFisica> listPessoaFisica;
	
	public List<PessoaFisica> listPessoaFisicaConsulta;

	/**
	 * Metodo responsável por tratar e realizar as ações de Inserção e Atualização da entidade pessoaFisica.
	 * @return 			  String contendo o indentificador do redirect que aplicação deve realizar.
	 * @author            Thiago Nunes Vieira
	 **/
	@End
	public String salvar() {
		
		if(!validarPessoa(pessoaFisica)){
			return "";
		}
		
		if(pessoaFisica.getPessoaEnderecos()==null){
			pessoaFisica.setPessoaEnderecos(new HashSet<PessoaEndereco>());
		}
		pessoaFisica.getPessoaEndereco().setTpEndereco("R");
		pessoaFisica.getPessoaEndereco().setPessoaFisica(pessoaFisica);
		pessoaFisica.getPessoaEnderecos().add(pessoaFisica.getPessoaEndereco());
		
		controleContato();
		
		pessoaFisicaManager.salvar(pessoaFisica);
		
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		
		limparObjetos();
		
		return "sucesso_salvar";
	}

	/**
	 * Metodo responsável por carregar e controlar os Contatos e o Endereço do Servidor.
	 * @author            Thiago Nunes Vieira
	 **/
	private void controleContato() {
		
		if(pessoaFisica.getId()==null){
			if(pessoaFisica.getPessoaContatos()==null){
				pessoaFisica.setPessoaContatos(new HashSet<PessoaContato>());
			}
			if(pessoaFisica.getPessoaContatoTel().getTxtContato() != null && pessoaFisica.getPessoaContatoTel().getTxtContato().trim().length() > 0 ){
				pessoaFisica.getPessoaContatoTel().setIndContato(ContatoEnum.TELEFONE.getChave());
				pessoaFisica.getPessoaContatoTel().setPessoaFisica(pessoaFisica);
				pessoaFisica.getPessoaContatos().add(pessoaFisica.getPessoaContatoTel());
			}
			if(pessoaFisica.getPessoaContatoCel().getTxtContato().trim().length() > 0){
				pessoaFisica.getPessoaContatoCel().setIndContato(ContatoEnum.CELULAR.getChave());
				pessoaFisica.getPessoaContatoCel().setPessoaFisica(pessoaFisica);
				pessoaFisica.getPessoaContatos().add(pessoaFisica.getPessoaContatoCel());
			}
			if(pessoaFisica.getPessoaContatoEmail().getTxtContato() != null && pessoaFisica.getPessoaContatoEmail().getTxtContato().trim().length() > 0){
				pessoaFisica.getPessoaContatoEmail().setIndContato(ContatoEnum.EMAIL.getChave());
				pessoaFisica.getPessoaContatoEmail().setPessoaFisica(pessoaFisica);
				pessoaFisica.getPessoaContatos().add(pessoaFisica.getPessoaContatoEmail());
			}
		}
		else{
			if(pessoaFisica.getPessoaContatos()!=null){
				for(PessoaContato pessoaContato : pessoaFisica.getPessoaContatos()){
					if(pessoaContato.getIndContato().equals(ContatoEnum.TELEFONE.getChave())){
						pessoaFisica.setPessoaContatoTel(pessoaContato);
					}
					if(pessoaContato.getIndContato().equals(ContatoEnum.CELULAR.getChave())){
						pessoaFisica.setPessoaContatoCel(pessoaContato);
					}
					if(pessoaContato.getIndContato().equals(ContatoEnum.EMAIL.getChave())){
						pessoaFisica.setPessoaContatoEmail(pessoaContato);
					}
					if(pessoaContato.getIndContato().equals(ContatoEnum.EMAIL_CORP.getChave())){
						pessoaFisica.setPessoaContatoEmailCorp(pessoaContato);
					}
				}
			}
			
		}
		
	}
	
	/**
	 * Metodo responsável por realizar as regras de validação de Pessoa Física.
	 * @param  param	  Entidade PessoaFisica com os atributos a serem validados.
	 * @return			  boolean com o status da validação.
	 * @author            Thiago Nunes Vieira
	 **/
	public boolean validarPessoa(PessoaFisica param) {
		
		PessoaFisica pessoaFisicaCpf = new PessoaFisica();
		if(param.getNumCpf() != null){
			if(param.getId() == null){
				pessoaFisicaCpf = pessoaFisicaManager.verificarDuplicidadeCpfNovo(param);
			}
			else{
				pessoaFisicaCpf = pessoaFisicaManager.verificarDuplicidadeCpf(param);
			}
			if(pessoaFisicaCpf!=null){
				if(pessoaFisicaCpf.getId() != null){
					registroExistente(pessoaFisicaCpf.getNumCpf());
					mensagemWarn(Mensagens.MSGW002.retornaMensagem(pessoaFisica.getNomPessoaFisica()));
					return false;
				}
			}
		}
		PessoaFisica pessoaFisicaNome = new PessoaFisica();
		if(param.getId() != null){
			pessoaFisicaNome = pessoaFisicaManager.verificarDuplicidadeNome(param);
		}else{
			pessoaFisicaNome = pessoaFisicaManager.verificarDuplicidadeNomeNovo(param);
		}
		if (pessoaFisicaNome.getId() != null){
			registroExistente(pessoaFisicaNome.getNomPessoaFisica());
			mensagemWarn(Mensagens.MSGW002.retornaMensagem(pessoaFisica.getNomPessoaFisica()));
			return false;
		}
		if(param.getDatEmissaoRg()!=null){
			if(param.getDatEmissaoRg().after(new Date())){
				mensagemWarn("A data de emissão não pode ser maior que a data atual.");
				return false;
			}
		}
		if(param.getDatEmissaoRg()!=null){
			if(param.getDatEmissaoRg().before(param.getDatNascimento())){
				mensagemWarn("A data de emissão não pode ser maior que a data de nascimento.");
				return false;
			}
		}
		if(param.getDatNascimento()!=null){
			if(param.getDatNascimento().after(new Date())){
				mensagemWarn("A data de nascimento não pode ser maior que a data atual.");
				return false;
			}
		}
		return true;
	}

	/**
	 * Metodo responsável por tratar e realizar a ações de exclusão da entidade pessoaFisica.
	 * @author            Thiago Nunes Vieira
	 **/
	public void excluir() {
		listPessoaFisica.remove(pessoaFisica);
		pessoaFisicaManager.excluir(pessoaFisica);
		mensagemInfo(Mensagens.MSGI001.retornaMensagem());
		pessoaFisica = new PessoaFisica();
	}

	/**
	 * Metodo responsável por promover e realizar a ações de pesquisa da entidade pessoaFisica.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurar() {
		listPessoaFisica = pessoaFisicaManager.consultarPessoaFisica(pessoaFisica);
		pessoaFisicaConsulta = pessoaFisica;
		if (listPessoaFisica == null || listPessoaFisica.isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
		listPessoaFisicaConsulta = new ArrayList<PessoaFisica>();
		listPessoaFisicaConsulta.addAll(listPessoaFisica);
	}

	/**
	 * Metodo responsável por preparar a entidade pessoaFisica para inclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de inclusão de pessoaFisica.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irIncluir() {
		limparObjetos();
		isIncluindo = true;
		
		controllerHelper.setRedirect("?Page=Incluir_Pessoa");
		
		return "ir_incluir";
	}
	
	
	/**
	 * Metodo responsável por voltar o CSU para interdace anterior.
	 * @return 			  String contendo o indentificador do redirect para a interface anterior.
	 * @author            Thiago Nunes Vieira
	 **/
	public String cancelar() {
		pessoaFisica = new PessoaFisica();
		pessoaFisica = pessoaFisicaConsulta;
		listPessoaFisica = new ArrayList<PessoaFisica>();
		if(listPessoaFisicaConsulta!=null){
			listPessoaFisica.addAll(listPessoaFisicaConsulta);
		}
		
		return "cancelar";
	}

	/**
	 * Metodo responsável por preparar a entidade pessoaFisica para edição.
	 * @return 			  String contendo o indentificador do redirect para a interface de edição de pessoaFisica.
	 * @author            Thiago Nunes Vieira
	 **/
	public String irEditar(PessoaFisica pessoaFisica) {
		limparObjetos();
		this.pessoaFisica = pessoaFisica;
		isEditando = true;
		controleContato();
		if(pessoaFisica.getPessoaEnderecos()!=null 
				&& !pessoaFisica.getPessoaEnderecos().isEmpty()){
			pessoaFisica.setPessoaEndereco(pessoaFisica.getPessoaEnderecos().iterator().next());
		}
		
		controllerHelper.setRedirect("?Page=Editar_Pessoa");
		return "ir_editar";
	}

	/**
	 * Metodo responsável por preparar a entidade pessoaFisica para visualização.
	 * @return 			  String contendo o indentificador do redirect para a interface de visualização de pessoaFisica.
	 * @author            Thiago Nunes Vieira
	 * @throws NamingException 
	 **/
	
	
	public void getUserName() throws NamingException {
        InitialContext ic = new InitialContext();
        SessionContext sctxLookup = (SessionContext) ic.lookup("java:comp/EJBContext");
        System.out.println("look up EJBContext by standard name: " + sctxLookup);
	}
	
	public String irVisualizar(PessoaFisica pessoaFisica) {
		
	//	Email email = new Email();
	//	email.enviarEmailSincronizacao();
		
		this.pessoaFisica = pessoaFisica;
		this.isVisualizando = true;
		controleContato();
		if(pessoaFisica.getPessoaEnderecos()!=null 
				&& !pessoaFisica.getPessoaEnderecos().isEmpty()){
			pessoaFisica.setPessoaEndereco(pessoaFisica.getPessoaEnderecos().iterator().next());
		}
		isVisualizar = true;
		
		controllerHelper.setRedirect("?Page=Visualizar_Pessoa");
		
		return "ir_visualizar";
	}

	/**
	 * Metodo responsável por preparar a entidade pessoa para exclusão.
	 * @return 			  String contendo o indentificador do redirect para a interface de exclusão de pessoa.
	 * @author            Thiago Nunes Vieira
	 **/
	public String preparExclusao(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
		return null;
	}
	
	/**
	 * Metodo responsável por limpar os atributos dos objetos.
	 * @author            Thiago Nunes Vieira
	 **/
	private void limparObjetos() {
		pessoaFisica = new PessoaFisica();
		listPessoaFisica= new ArrayList<PessoaFisica>();
		isVisualizando = false;
		isIncluindo = false;
		isEditando = false;
		combosAuxiliarAction.setUf(new Uf());
		combosAuxiliarAction.setUf2(new Uf());
	}
	
	public Boolean getIsVisualizando() {
		return isVisualizando;
	}

	public Boolean getIsEditando() {
		return isEditando;
	}

	public Boolean getIsIncluindo() {
		return isIncluindo;
	}
}