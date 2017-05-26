package br.gov.iphan.sisgep.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;

import br.gov.iphan.sisgep.entity.corp.UnidadeAdministrativa;

@Entity
@Table(name="AVALIACAO")
@Name("avaliacao")
public class Avaliacao extends EntidadeAbstrata implements EntidadeBase{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="periodo_inicio")
	private Date periodoInicio;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="periodo_fim")
	private Date periodoFim;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="periodo_processo_inicio")
	private Date periodoProcessoInicio;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="periodo_processo_fim")
	private Date periodoProcessoFim;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_tipo_avaliacao")
	private TipoAvaliacao tipoAvaliacao;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_status")
	private StatusAvaliacao statusAvaliacao;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_unidade_organizacional")
	private UnidadeAdministrativa unidadeOrganizacional;

	@OneToMany(mappedBy = "avaliacao", fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
	private List<ServidorAvaliacao> servidoresAvaliacao;
	
	@OneToMany(mappedBy = "avaliacao", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<EquipeAvaliacao> equipeAvaliacao;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_condutor")
	private Servidor condutor;
	
	@Transient
    private String dataInicioConcatDataFim;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPeriodoInicio() {
		return periodoInicio;
	}

	public void setPeriodoInicio(Date periodoInicio) {
		this.periodoInicio = periodoInicio;
	}

	public Date getPeriodoFim() {
		return periodoFim;
	}

	public void setPeriodoFim(Date periodoFim) {
		this.periodoFim = periodoFim;
	}

	public Date getPeriodoProcessoInicio() {
		return periodoProcessoInicio;
	}

	public void setPeriodoProcessoInicio(Date periodoProcessoInicio) {
		this.periodoProcessoInicio = periodoProcessoInicio;
	}

	public Date getPeriodoProcessoFim() {
		return periodoProcessoFim;
	}

	public void setPeriodoProcessoFim(Date periodoProcessoFim) {
		this.periodoProcessoFim = periodoProcessoFim;
	}

	public TipoAvaliacao getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}

	public StatusAvaliacao getStatusAvaliacao() {
		return statusAvaliacao;
	}

	public void setStatusAvaliacao(StatusAvaliacao statusAvaliacao) {
		this.statusAvaliacao = statusAvaliacao;
	}

	public UnidadeAdministrativa getUnidadeOrganizacional() {
		return unidadeOrganizacional;
	}

	public void setUnidadeOrganizacional(UnidadeAdministrativa unidadeOrganizacional) {
		this.unidadeOrganizacional = unidadeOrganizacional;
	}

	public List<ServidorAvaliacao> getServidoresAvaliacao() {
		return servidoresAvaliacao;
	}

	public void setServidoresAvaliacao(List<ServidorAvaliacao> servidoresAvaliacao) {
		this.servidoresAvaliacao = servidoresAvaliacao;
	}

	public List<EquipeAvaliacao> getEquipeAvaliacao() {
		return equipeAvaliacao;
	}

	public void setEquipeAvaliacao(List<EquipeAvaliacao> equipeAvaliacao) {
		this.equipeAvaliacao = equipeAvaliacao;
	}

	public Servidor getCondutor() {
		return condutor;
	}

	public void setCondutor(Servidor condutor) {
		this.condutor = condutor;
	}

	public String getDataInicioConcatDataFim() {
		if (getPeriodoInicio() != null && getPeriodoFim() != null) {
			String dataz = "dd/MM/yyyy";
            SimpleDateFormat formatas = new SimpleDateFormat(dataz);
            String dataInicio = formatas.format(getPeriodoInicio());
            String dataFim = formatas.format(getPeriodoFim());
			return dataInicio + " a " + dataFim;
		} else {
			String data = "";
			return data;
		}
	}

	public void setDataInicioConcatDataFim(String dataInicioConcatDataFim) {
		this.dataInicioConcatDataFim = dataInicioConcatDataFim;
	}
}
