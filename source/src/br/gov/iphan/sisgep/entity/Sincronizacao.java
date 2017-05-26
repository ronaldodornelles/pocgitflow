package br.gov.iphan.sisgep.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.anotation.Orderby;
import br.gov.iphan.sisgep.entity.enums.TipoSincronizacaoEnum;

@Entity
@Table(name = "GPT_SINCRONIZACAO")
@Name("sincronizacao")
@Orderby(ordenacao = "id_sincronizacao")
public class Sincronizacao extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = -2191589756919441692L;
	public static final String STATUS_ANDAMENTO = new String("ANDAMENTO");
	public static final String STATUS_SUCESSO = new String("SUCESSO");
	public static final String STATUS_CONCLUIDO_COM_RESSALVA = new String("CONCLUÍDO COM RESSALVA");
	public static final String STATUS_ERRO = new String("ERRO");

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SINCRONIZACAO", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "TIPO")
	private Integer tipo;
	
	@Column(name = "NOME_USUARIO", length = 250)
	private String nomeUsuario;
	
	@Column(name = "EMAIL_USUARIO", length = 250)
	private String emailUsuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_INICIO")
	private Date dataHoraInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_FIM")
	private Date dataHoraFim;

	@Column(name = "STATUS_SINCRONIZACAO", length = 50)
	private String status;
	
	@Column(name = "MENSAGEM_ERRO", length = 500)
	private String mensagemErro;

	@OneToMany(mappedBy = "sincronizacao", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private List<HistoricoSincronizacao> historicos;
	
	@Transient
	private String tipoSincronizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public List<HistoricoSincronizacao> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<HistoricoSincronizacao> historicos) {
		this.historicos = historicos;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getTipoSincronizacao() {
		if(this.tipo != null) {
			return TipoSincronizacaoEnum.valueOfInt(this.tipo).getDescricao();
		}
		return new String();
	}

	public void setTipoSincronizacao(String tipoSincronizacao) {
		this.tipoSincronizacao = tipoSincronizacao;
	}
	
	
}