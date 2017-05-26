package br.gov.iphan.sisgep.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.anotation.Orderby;
import br.gov.iphan.sisgep.entity.enums.StatusHistoricoSincronizacaoEnum;
import br.gov.iphan.sisgep.entity.enums.TipoSincronizacaoEnum;

@Entity
@Table(name = "GPT_HISTORICO_SINCRONIZACAO")
@Name("historicoSincronizacao")
@Orderby(ordenacao = "id_sincronizacao")
public class HistoricoSincronizacao extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = -6761215694502583691L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HISTORICO", unique = true, nullable = false)
	private Long id;

	@Column(name = "CPF", length = 11)
	private String cpf;
	
	@Column(name = "NOME_CAMPO", length = 250)
	private String nomeCampo;
	
	@Column(name = "VALOR_ANTERIOR", length = 250)
	private String valorAnterior;
	
	@Column(name = "VALOR_ATUAL", length = 250)
	private String valorAtual;
	
	@Column(name = "NOME_SERVIDOR", length = 250)
	private String nomeServidor;
	
	@Column(name = "STATUS")
	private Integer status;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "ID_SINCRONIZACAO")
	private Sincronizacao sincronizacao;
	
	@Transient
	private String statusHistoricoSincronizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public String getValorAnterior() {
		return valorAnterior;
	}

	public void setValorAnterior(String valorAnterior) {
		this.valorAnterior = valorAnterior;
	}

	public String getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(String valorAtual) {
		this.valorAtual = valorAtual;
	}

	public Sincronizacao getSincronizacao() {
		return sincronizacao;
	}

	public void setSincronizacao(Sincronizacao sincronizacao) {
		this.sincronizacao = sincronizacao;
	}

	public String getNomeServidor() {
		return nomeServidor;
	}

	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusHistoricoSincronizacao() {
		if(this.status != null) {
			return StatusHistoricoSincronizacaoEnum.valueOfInt(this.status).getDescricao();
		}
		return new String();
	}

	public void setStatusHistoricoSincronizacao(String statusHistoricoSincronizacao) {
		this.statusHistoricoSincronizacao = statusHistoricoSincronizacao;
	}
	
}