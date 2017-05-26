package br.gov.iphan.sisgep.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.jboss.seam.annotations.Name;

@Entity
@Table(name = "GPT_CARGO_FUNCAO")
@Name("cargoFuncao")
public class CargoFuncao extends EntidadeAbstrata implements EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cargo_funcao", unique = true, nullable = false)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_servidor")
	private Servidor servidor;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_comissao")
	private CargoComissionado cargoComissionado;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_efetivo")
	private CargoEfetivo cargoEfetivo;

	@Column(name = "tipo_efetivo")
	private Boolean tipoEfetivo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public CargoComissionado getCargoComissionado() {
		return cargoComissionado;
	}

	public void setCargoComissionado(CargoComissionado cargoComissionado) {
		this.cargoComissionado = cargoComissionado;
	}

	public CargoEfetivo getCargoEfetivo() {
		return cargoEfetivo;
	}

	public void setCargoEfetivo(CargoEfetivo cargoEfetivo) {
		this.cargoEfetivo = cargoEfetivo;
	}

	public Boolean getTipoEfetivo() {
		return tipoEfetivo;
	}

	public void setTipoEfetivo(Boolean tipoEfetivo) {
		this.tipoEfetivo = tipoEfetivo;
	}

}
