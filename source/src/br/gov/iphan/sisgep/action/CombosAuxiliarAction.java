package br.gov.iphan.sisgep.action;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

import br.gov.iphan.sisgep.entity.AreaAtuacao;
import br.gov.iphan.sisgep.entity.CargoFuncionario;
import br.gov.iphan.sisgep.entity.ClasseFuncionario;
import br.gov.iphan.sisgep.entity.CondicaoDependente;
import br.gov.iphan.sisgep.entity.FimDependente;
import br.gov.iphan.sisgep.entity.FormaPassagemServ;
import br.gov.iphan.sisgep.entity.FormaSaida;
import br.gov.iphan.sisgep.entity.GrupoFuncionario;
import br.gov.iphan.sisgep.entity.InstituicaoEnsino;
import br.gov.iphan.sisgep.entity.NivelCargoFuncionario;
import br.gov.iphan.sisgep.entity.Orgao;
import br.gov.iphan.sisgep.entity.PadraoCargo;
import br.gov.iphan.sisgep.entity.RegistroAfastamento;
import br.gov.iphan.sisgep.entity.Servidor;
import br.gov.iphan.sisgep.entity.SituacaoFuncional;
import br.gov.iphan.sisgep.entity.StatusAvaliacao;
import br.gov.iphan.sisgep.entity.TipoAvaliacao;
import br.gov.iphan.sisgep.entity.TipoCargoComissinado;
import br.gov.iphan.sisgep.entity.corp.CorRaca;
import br.gov.iphan.sisgep.entity.corp.EscolaridadePessoa;
import br.gov.iphan.sisgep.entity.corp.EstadoCivil;
import br.gov.iphan.sisgep.entity.corp.GrupoSanguineo;
import br.gov.iphan.sisgep.entity.corp.Municipio;
import br.gov.iphan.sisgep.entity.corp.PessoaFisica;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;
import br.gov.iphan.sisgep.manager.AreaAtuacaoManager;
import br.gov.iphan.sisgep.manager.AvaliacaoManager;
import br.gov.iphan.sisgep.manager.CargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.ClasseFuncionarioManager;
import br.gov.iphan.sisgep.manager.CondicaoDependenteManager;
import br.gov.iphan.sisgep.manager.CorRacaManager;
import br.gov.iphan.sisgep.manager.EscolaridadePessoaManager;
import br.gov.iphan.sisgep.manager.EstadoCivilManager;
import br.gov.iphan.sisgep.manager.FimDependenteManager;
import br.gov.iphan.sisgep.manager.FormaIngressoManager;
import br.gov.iphan.sisgep.manager.FormaPassagemServManager;
import br.gov.iphan.sisgep.manager.FormaSaidaManager;
import br.gov.iphan.sisgep.manager.GrupoFuncionarioManager;
import br.gov.iphan.sisgep.manager.GrupoSanguineoManager;
import br.gov.iphan.sisgep.manager.InstituicaoEnsinoManager;
import br.gov.iphan.sisgep.manager.MunicipioManager;
import br.gov.iphan.sisgep.manager.NivelCargoFuncionarioManager;
import br.gov.iphan.sisgep.manager.OrgaoManager;
import br.gov.iphan.sisgep.manager.PadraoCargoManager;
import br.gov.iphan.sisgep.manager.RegistroAfastamentoManager;
import br.gov.iphan.sisgep.manager.SituacaoFuncionalManager;
import br.gov.iphan.sisgep.manager.StatusAvaliacaoManager;
import br.gov.iphan.sisgep.manager.TipoCargoComissionadoManager;
import br.gov.iphan.sisgep.manager.UfManager;
import br.gov.iphan.sisgep.manager.UnidadeAdministrativaManager;
import br.gov.iphan.sisgep.util.Mensagens;

/**
 * Classe responsável por carregar variás coleções de informações uteis, na
 * camada de visão da Aplicação. Exemplo: carregamento de combos de Unidade
 * Federativa e Grupo Sanguineo.
 * 
 * @author Thiago Nunes Vieira
 **/
@Name("combosAuxiliarAction")
@Scope(ScopeType.CONVERSATION)
public class CombosAuxiliarAction extends BaseAction {
	private static final long serialVersionUID = -7409735643659325694L;

	@In(required = false, create = true)
	@Out(required = false)
	NivelCargoFuncionario nivelCargoFuncionario;
	
	@In(required = false, create = true)
	@Out(required = false)
	NivelCargoFuncionario nivelCargoFuncionarioComissao;

	@In(required = false, create = true)
	@Out(required = false)
	GrupoFuncionario grupoFuncionario;
	
	@In(required = false, create = true)
	@Out(required = false)
	ClasseFuncionario classeFuncionario;
	
	@In(required = false, create = true)
	@Out(required = false)
	private UnidadeAdministrativa unidadeAdministrativa;
	
	@In(required = false, create = true)
	@Out(required = false)
	private List<UnidadeAdministrativa> listUnidadeAdministrativaModal;
	
	@In(required = false, create = true)
	@Out(required = false)
	public List<TipoCargoComissinado> listTipoCargoComissinado;
	
	@In(required = false, create = true)
	UfManager ufManager;

	@In(required = false, create = true)
	MunicipioManager municipioManager;

	@In(required = false, create = true)
	GrupoSanguineoManager grupoSanguineoManager;

	@In(required = false, create = true)
	EscolaridadePessoaManager escolaridadePessoaManager;

	@In(required = false, create = true)
	EstadoCivilManager estadoCivilManager;

	@In(required = false, create = true)
	SituacaoFuncionalManager situacaoFuncionalManager;

	@In(required = false, create = true)
	CorRacaManager corRacaManager;

	@In(required = false, create = true)
	FormaIngressoManager formaIngressoManager;

	@In(required = false, create = true)
	FormaPassagemServManager formaPassagemServManager;

	@In(required = false, create = true)
	FormaSaidaManager formaSaidaManager;

	@In(required = false, create = true)
	GrupoFuncionarioManager grupoFuncionarioManager;

	@In(required = false, create = true)
	RegistroAfastamentoManager registroAfastamentoManager;

	@In(required = false, create = true)
	PadraoCargoManager padraoCargoManager;

	@In(required = false, create = true)
	ClasseFuncionarioManager classeFuncionarioManager;

	@In(required = false, create = true)
	NivelCargoFuncionarioManager nivelCargoFuncionarioManager;

	@In(required = false, create = true)
	CargoFuncionarioManager cargoFuncionarioManager;

	@In(required = false, create = true)
	AreaAtuacaoManager areaAtuacaoManager;

	@In(required = false, create = true)
	TipoCargoComissionadoManager tipoCargoComissionadoManager;

	@In(required = false, create = true)
	FimDependenteManager fimDependenteManager;

	@In(required = false, create = true)
	CondicaoDependenteManager condicaoDependenteManager;

	@In(required = false, create = true)
	OrgaoManager orgaoManager;
	
	@In(required = false, create = true)
	AvaliacaoManager avaliacaoManager;
	
	@In(required = false, create = true)
	StatusAvaliacaoManager statusAvaliacaoManager;
	
	@In(required = false, create = true)
	private UnidadeAdministrativaManager unidadeAdministrativaManager;
	
	@In(required= false ,  create = true)
	private InstituicaoEnsinoManager instituicaoEnsinoManager;

	@In(required = false, create = true)
	@Out(required = false)
	private PessoaFisica pessoaFisica;

	@In(required = false, create = true)
	@Out(required = false)
	private Servidor servidor;

	Uf uf = new Uf();
	Uf uf2 = new Uf();
	Uf ufFormacaoAcademica = new Uf();
	
	/**
	 * Metodo responsável por promover e realizar a ação de pesquisa das Unidades Administrativas pais.
	 * @author            Thiago Nunes Vieira
	 **/
	public void procurarModal() {
		setListUnidadeAdministrativaModal(unidadeAdministrativaManager.consultarUnidadeAdministrativa(unidadeAdministrativa));
		if (getListUnidadeAdministrativaModal() == null || getListUnidadeAdministrativaModal().isEmpty()) {
			mensagemWarn(Mensagens.MSGI000.retornaMensagem());
		}
	}
	
	/**
	 * Metodo responsável por carregar todos os combos de Área de Atuação.
	 * @return 			 List<AreaAtuacao> Coleção com todos as Área de Atuaçãos.
	 * @author 			 Thiago Nunes Vieira
	 **/
	public List<TipoCargoComissinado> getTipoCargoComissionados() {
		if(getServidor() != null){
			if(getServidor().getCodSiape()!=null){
				listTipoCargoComissinado = tipoCargoComissionadoManager.findTipoCargoComissinado(getServidor().getCodSiape());
				return listTipoCargoComissinado;
			}
		}
		return new ArrayList<TipoCargoComissinado>();
	}

	
	
	/**
	 * Metodo responsável por carregar todos os combos de Área de Atuação.
	 * @return 			 List<AreaAtuacao> Coleção com todos as Área de Atuaçãos.
	 * @author 			 Thiago Nunes Vieira
	 **/
	public List<TipoCargoComissinado> getTipoCargoComissionados(String codSiape) {
		if(codSiape!=null){
			listTipoCargoComissinado = tipoCargoComissionadoManager.findTipoCargoComissinado(codSiape);
			return listTipoCargoComissinado;
		}
		return new ArrayList<TipoCargoComissinado>();
	}	
	
	
	/**
	 * Metodo responsável por carregar todos os combos de Órgão.
	 * 
	 * @return List<Orgao> Coleção com todos os Órgãos.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<Orgao> getCondicaoCessaoRequisicaos() {
		return orgaoManager.listarTodos(Orgao.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Condição de
	 * Dependência.
	 * 
	 * @return List<CondicaoDependente> Coleção com todos as Condições de
	 *         Dependência.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<CondicaoDependente> getCondicaoDependentes() {
		return condicaoDependenteManager.listarTodos(CondicaoDependente.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Fim de Dependência.
	 * 
	 * @return List<FimDependente> Coleção com todos os Fins de Dependência.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<FimDependente> getFimDependentes() {
		return fimDependenteManager.listarTodos(FimDependente.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Área de Atuação.
	 * 
	 * @return List<AreaAtuacao> Coleção com todos as Área de Atuaçãos.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<AreaAtuacao> getAreaAtuacaos() {
		return areaAtuacaoManager.listarTodosAtivos(AreaAtuacao.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Unidade Federativa.
	 * 
	 * @return List<Uf> Coleção com todos as Unidades Federativas.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<Uf> getUfs() {
		return ufManager.listarTodos(Uf.class);
	}

	/**
	 * Metodo responsável por carregar os combos de Maturalidade.
	 * 
	 * @return List<Municipio> Coleção com todos as Maturalidades.
	 * @author Thiago Nunes Vieira
	 **/
	public List<Municipio> getNaturalidades() {
		if (uf != null) {
			if (uf.getId() != null) {
				return municipioManager.findByUf(uf);
			}
		}
		return new ArrayList<Municipio>();
	}

	/**
	 * Metodo responsável por carregar os combos de Municipio.
	 * 
	 * @return List<Municipio> Coleção com todos as Municipios.
	 * @author Thiago Nunes Vieira
	 **/
	public List<Municipio> getMunicipios() {
		if (uf2 != null) {
			if (uf2.getId() != null) {
				return municipioManager.findByUf(uf2);
			}
		}
		return new ArrayList<Municipio>();
	}
	
	/**
	 * Metodo responsável por carregar os combos de Municipio da modal de formação academica na tela de servidor
	 * @return List<Municipio> Coleção com todos as Municipios.
	 * @author Erick Xavier
	 **/
	public List<Municipio> getMunicipiosFormacaoAcademica() {
		if (ufFormacaoAcademica != null) {
			if (ufFormacaoAcademica.getId() != null) {
				
				return municipioManager.findByUf(ufFormacaoAcademica);
			}
		}
		return new ArrayList<Municipio>();
	}


	/**
	 * Metodo responsável por carregar todos os combos de Grupos Sanguineos.
	 * 
	 * @return List<GrupoSanguineo> Coleção com todos os Grupos Sanguineos.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<GrupoSanguineo> getGrupoSanguineos() {
		return grupoSanguineoManager.listarTodos(GrupoSanguineo.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Escolaridade.
	 * 
	 * @return List<EscolaridadePessoa> Coleção com todos as Escolaridades.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<EscolaridadePessoa> getEscolaridadePessoas() {
		return escolaridadePessoaManager.listarTodos(EscolaridadePessoa.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Estados Civil.
	 * 
	 * @return List<EstadoCivils> Coleção com todos os Estados Civis.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<EstadoCivil> getEstadoCivils() {
		return estadoCivilManager.listarTodos(EstadoCivil.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Situação Funcional.
	 * 
	 * @return List<SituacaoFuncional> Coleção com todos as Situações
	 *         Funcionais.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<SituacaoFuncional> getSituacaoFuncionals() {
		try{
			return situacaoFuncionalManager.listarTodos(SituacaoFuncional.class);
		}catch(PersistenceException pe){
			return new ArrayList<SituacaoFuncional>();
		}
	}

	/**
	 * Metodo responsável por carregar todos os combos de Cor/Raca.
	 * 
	 * @return List<CorRaca> Coleção com todos as Cores/Raças.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<CorRaca> getCorRacas() {
		return corRacaManager.listarTodos(CorRaca.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Forma de Passagem
	 * Servidor do tipo de Entrada.
	 * 
	 * @return List<FormaPassagemServ> Coleção com todos as Formas de Passagem
	 *         Servidor  do tipo de Entrada.
	 * @author Thiago Nunes Vieira
	 **/
	public List<FormaPassagemServ> getFormaPassagemServs() {
		return formaPassagemServManager.findByTipo("E");
	}
	
	/**
	 * Metodo responsável por carregar todos os combos de Forma de Passagem
	 * Servidor do tipo de Saida.
	 * 
	 * @return List<FormaPassagemServ> Coleção com todos as Formas de Passagem
	 *         Servidor  do tipo de Entrada.
	 * @author Thiago Nunes Vieira
	 **/
	public List<FormaPassagemServ> getFormaPassagemServsSaida() {
		return formaPassagemServManager.findByTipo("S");
	}
	
	/**
	 * Metodo responsável por carregar todos os combos de Forma de Passagem
	 * Servidor do tipo de Aposentacao.
	 * 
	 * @return List<FormaPassagemServ> Coleção com todos as Formas de Passagem
	 *         Servidor  do tipo de Aposentacao.
	 * @author Thiago Nunes Vieira
	 **/
	public List<FormaPassagemServ> getFormaPassagemServsAposentacao() {
		return formaPassagemServManager.findByTipo("A");
	}

	/**
	 * Metodo responsável por carregar todos os combos de Forma de Saída.
	 * 
	 * @return List<FormaSaida> Coleção com todos as Formas de Saídas.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<FormaSaida> getFormaSaidas() {
		return formaSaidaManager.listarTodos(FormaSaida.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoAvaliacao> getTipoAvaliacoes() {
		return avaliacaoManager.listarTodos(TipoAvaliacao.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<StatusAvaliacao> getStatusAvaliacoes() {
		return statusAvaliacaoManager.listarTodos(StatusAvaliacao.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Grupo de Funcionário.
	 * 
	 * @return List<GrupoFuncionario> Coleção com todos os Grupos de
	 *         Funcionários.
	 * @author Thiago Nunes Vieira
	 **/
	public List<GrupoFuncionario> getGrupoFuncionarios() {

		if (nivelCargoFuncionario.getId() != null) {
			GrupoFuncionario grupoFuncionario = new GrupoFuncionario();
			grupoFuncionario.setNivelCargoFuncionario(nivelCargoFuncionario);
			return grupoFuncionarioManager.
					consultarGrupoFuncionario(grupoFuncionario);
		}
		return new ArrayList<GrupoFuncionario>();
	}

	/**
	 * Metodo responsável por carregar todos os combos de Registro de
	 * Afastamento.
	 * 
	 * @return List<RegistroAfastamento> Coleção com todos os Registros de
	 *         Afastamentos.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<RegistroAfastamento> getRegistroAfastamentos() {
		return registroAfastamentoManager
				.listarTodos(RegistroAfastamento.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Padrão de Cargo.
	 * 
	 * @return List<PadraoCargo> Coleção com todos os Padrões de Cargos.
	 * @author Thiago Nunes Vieira
	 **/
	public List<PadraoCargo> getPadraoCargos() {
		if(classeFuncionario.getId()!=null){
			return padraoCargoManager.consultarPadraoCargo(classeFuncionario);
		}
		return new ArrayList<PadraoCargo>();
	}
	
	public List<PadraoCargo> getPadraoCargos(ClasseFuncionario classeFuncionario) {
		if(classeFuncionario != null && classeFuncionario.getId()!=null){
			return padraoCargoManager.consultarPadraoCargo(classeFuncionario);
		} else {
			return padraoCargoManager.listarTodos();
		}
	}	


	/**
	 * Metodo responsável por carregar todos os combos de Classe de Funcionário.
	 * 
	 * @return List<ClasseFuncionario> Coleção com todos as Classes de
	 *         Funcionários.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<ClasseFuncionario> getClasseFuncionarios() {
		return classeFuncionarioManager.listarTodos(ClasseFuncionario.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Nível de Cargo de
	 * Funcionário.
	 * 
	 * @return List<NivelCargoFuncionario> Coleção com todos os Níveis de Cargos
	 *         de Funcionários.
	 * @author Thiago Nunes Vieira
	 **/
	@SuppressWarnings("unchecked")
	public List<NivelCargoFuncionario> getNivelCargoFuncionarios() {
		return nivelCargoFuncionarioManager.listarTodos(NivelCargoFuncionario.class);
	}

	/**
	 * Metodo responsável por carregar todos os combos de Cargo de Funcionário.
	 * @return List<CargoFuncionario> Coleção com todos os Cargos de Funcionários.
	 * @author Thiago Nunes Vieira
	 **/
	public List<CargoFuncionario> getCargoFuncionarios() {
		if (grupoFuncionario.getId() != null) {
			try {
				return cargoFuncionarioManager.consultarCargoFuncionario(grupoFuncionario);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return new ArrayList<CargoFuncionario>();
	}
	
	
	public List<CargoFuncionario> getCargoFuncionarios(GrupoFuncionario grupoFuncionario) {
		if (grupoFuncionario != null && grupoFuncionario.getId() != null) {
			return cargoFuncionarioManager.consultarCargoFuncionario(grupoFuncionario);
		}
		return new ArrayList<CargoFuncionario>();
	}
	
	/**
	 * Metodo responsavel por carregar todas as combos de instituicao de ensino
	 * @author Erick Xavier
	 * @return List<CargoFuncionario>. Lista com todas as  InstituicoesEnsino
	 */

	public List<InstituicaoEnsino> getInstituicoesEnsino() {
			return instituicaoEnsinoManager.listarInstituicoes();
	}
	
	/**
	 * Metodo responsavel pela o valor da UF uf2
	 * @author Erick Xavier
	 * @return UF
	 */
	public Uf getUf2() {
		if (getServidor().getPessoaFisica().getId() != null && uf2.getId() == null) {
			if(getServidor().getPessoaFisica().getPessoaEndereco() != null) {
				if(getServidor().getPessoaFisica().getPessoaEndereco().getMunicipio() != null) {
					if(getServidor().getPessoaFisica().getPessoaEndereco().getMunicipio().getCodUf() != null) {
						uf2 = getServidor().getPessoaFisica().getPessoaEndereco().getMunicipio().getCodUf();
					}
				}
			}
		}
		if (pessoaFisica.getId() != null && uf2.getId() == null) {
			if(pessoaFisica.getPessoaEndereco() != null) {
				if(pessoaFisica.getPessoaEndereco().getMunicipio() != null) {
					if(pessoaFisica.getPessoaEndereco().getMunicipio().getCodUf() != null) {
						uf2 = pessoaFisica.getPessoaEndereco().getMunicipio().getCodUf();
					}
				}
			}
		}
		return uf2;
	}

	public void setUf2(Uf uf2) {
		this.uf2 = uf2;
	}

	/**
	 * Metodo responsavel pela o valor da UF uf
	 * @author Erick Xavier
	 * @return UF
	 */
	public Uf getUf() {
		if (getServidor().getPessoaFisica().getId() != null && uf.getId() == null) {
			if(getServidor().getPessoaFisica().getCodMunicipio() != null) {
				if(getServidor().getPessoaFisica().getCodMunicipio().getCodUf() != null) {
					uf = getServidor().getPessoaFisica().getCodMunicipio().getCodUf();		
				}
			}
		}
		if (pessoaFisica.getId() != null && uf.getId() == null) {
			if(pessoaFisica.getCodMunicipio() != null) {
				if(pessoaFisica.getCodMunicipio().getCodUf() != null) {
					uf = pessoaFisica.getCodMunicipio().getCodUf();		
				}
			}
		}
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public Uf getUfFormacaoAcademica() {
		return ufFormacaoAcademica;
	}

	public void setUfFormacaoAcademica(Uf ufFormacaoAcademica) {
		this.ufFormacaoAcademica = ufFormacaoAcademica;
	}

	public NivelCargoFuncionario getNivelCargoFuncionario() {
		return nivelCargoFuncionario;
	}

	public void setNivelCargoFuncionario(NivelCargoFuncionario nivelCargoFuncionario) {
		this.nivelCargoFuncionario = nivelCargoFuncionario;
	}

	public GrupoFuncionario getGrupoFuncionario() {
		return grupoFuncionario;
	}

	public void setGrupoFuncionario(GrupoFuncionario grupoFuncionario) {
		this.grupoFuncionario = grupoFuncionario;
	}

	public ClasseFuncionario getClasseFuncionario() {
		return classeFuncionario;
	}

	public void setClasseFuncionario(ClasseFuncionario classeFuncionario) {
		this.classeFuncionario = classeFuncionario;
	}

	public List<TipoCargoComissinado> getListTipoCargoComissinado() {
		return listTipoCargoComissinado;
	}

	public void setListTipoCargoComissinado(
			List<TipoCargoComissinado> listTipoCargoComissinado) {
		this.listTipoCargoComissinado = listTipoCargoComissinado;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public List<UnidadeAdministrativa> getListUnidadeAdministrativaModal() {
		return unidadeAdministrativaManager.listarTodos();
	}

	public void setListUnidadeAdministrativaModal(
			List<UnidadeAdministrativa> listUnidadeAdministrativaModal) {
		this.listUnidadeAdministrativaModal = listUnidadeAdministrativaModal;
	}

	public NivelCargoFuncionario getNivelCargoFuncionarioComissao() {
		return nivelCargoFuncionarioComissao;
	}

	public void setNivelCargoFuncionarioComissao(
			NivelCargoFuncionario nivelCargoFuncionarioComissao) {
		this.nivelCargoFuncionarioComissao = nivelCargoFuncionarioComissao;
	}
	
}