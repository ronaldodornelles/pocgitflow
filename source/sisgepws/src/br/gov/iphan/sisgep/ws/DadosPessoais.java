
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosPessoais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosPessoais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDefFisica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codNacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChegBrasil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeDefFisica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMunicipNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeNacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPisPasep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPessoais", propOrder = {
    "codCor",
    "codDefFisica",
    "codEstadoCivil",
    "codNacionalidade",
    "codSexo",
    "dataChegBrasil",
    "dataNascimento",
    "grupoSanguineo",
    "nome",
    "nomeCor",
    "nomeDefFisica",
    "nomeEstadoCivil",
    "nomeMae",
    "nomeMunicipNasc",
    "nomeNacionalidade",
    "nomePai",
    "nomePais",
    "nomeSexo",
    "numPisPasep",
    "ufNascimento"
})
public class DadosPessoais {

    @XmlElementRef(name = "codCor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codCor;
    @XmlElementRef(name = "codDefFisica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codDefFisica;
    @XmlElementRef(name = "codEstadoCivil", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codEstadoCivil;
    @XmlElementRef(name = "codNacionalidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codNacionalidade;
    @XmlElementRef(name = "codSexo", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codSexo;
    @XmlElementRef(name = "dataChegBrasil", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataChegBrasil;
    @XmlElementRef(name = "dataNascimento", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataNascimento;
    @XmlElementRef(name = "grupoSanguineo", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> grupoSanguineo;
    @XmlElementRef(name = "nome", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "nomeCor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeCor;
    @XmlElementRef(name = "nomeDefFisica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeDefFisica;
    @XmlElementRef(name = "nomeEstadoCivil", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeEstadoCivil;
    @XmlElementRef(name = "nomeMae", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeMae;
    @XmlElementRef(name = "nomeMunicipNasc", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeMunicipNasc;
    @XmlElementRef(name = "nomeNacionalidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeNacionalidade;
    @XmlElementRef(name = "nomePai", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomePai;
    @XmlElementRef(name = "nomePais", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomePais;
    @XmlElementRef(name = "nomeSexo", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeSexo;
    @XmlElementRef(name = "numPisPasep", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numPisPasep;
    @XmlElementRef(name = "ufNascimento", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufNascimento;

    /**
     * Gets the value of the codCor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCor() {
        return codCor;
    }

    /**
     * Sets the value of the codCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCor(JAXBElement<String> value) {
        this.codCor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codDefFisica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodDefFisica() {
        return codDefFisica;
    }

    /**
     * Sets the value of the codDefFisica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodDefFisica(JAXBElement<String> value) {
        this.codDefFisica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codEstadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEstadoCivil() {
        return codEstadoCivil;
    }

    /**
     * Sets the value of the codEstadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEstadoCivil(JAXBElement<String> value) {
        this.codEstadoCivil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codNacionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodNacionalidade() {
        return codNacionalidade;
    }

    /**
     * Sets the value of the codNacionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodNacionalidade(JAXBElement<String> value) {
        this.codNacionalidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codSexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSexo() {
        return codSexo;
    }

    /**
     * Sets the value of the codSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSexo(JAXBElement<String> value) {
        this.codSexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataChegBrasil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataChegBrasil() {
        return dataChegBrasil;
    }

    /**
     * Sets the value of the dataChegBrasil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataChegBrasil(JAXBElement<String> value) {
        this.dataChegBrasil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNascimento(JAXBElement<String> value) {
        this.dataNascimento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the grupoSanguineo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrupoSanguineo() {
        return grupoSanguineo;
    }

    /**
     * Sets the value of the grupoSanguineo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrupoSanguineo(JAXBElement<String> value) {
        this.grupoSanguineo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeCor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCor() {
        return nomeCor;
    }

    /**
     * Sets the value of the nomeCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCor(JAXBElement<String> value) {
        this.nomeCor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeDefFisica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeDefFisica() {
        return nomeDefFisica;
    }

    /**
     * Sets the value of the nomeDefFisica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeDefFisica(JAXBElement<String> value) {
        this.nomeDefFisica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeEstadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEstadoCivil() {
        return nomeEstadoCivil;
    }

    /**
     * Sets the value of the nomeEstadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEstadoCivil(JAXBElement<String> value) {
        this.nomeEstadoCivil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeMae property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMae() {
        return nomeMae;
    }

    /**
     * Sets the value of the nomeMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMae(JAXBElement<String> value) {
        this.nomeMae = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeMunicipNasc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMunicipNasc() {
        return nomeMunicipNasc;
    }

    /**
     * Sets the value of the nomeMunicipNasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMunicipNasc(JAXBElement<String> value) {
        this.nomeMunicipNasc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeNacionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeNacionalidade() {
        return nomeNacionalidade;
    }

    /**
     * Sets the value of the nomeNacionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeNacionalidade(JAXBElement<String> value) {
        this.nomeNacionalidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomePai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePai() {
        return nomePai;
    }

    /**
     * Sets the value of the nomePai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePai(JAXBElement<String> value) {
        this.nomePai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomePais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePais() {
        return nomePais;
    }

    /**
     * Sets the value of the nomePais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePais(JAXBElement<String> value) {
        this.nomePais = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeSexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeSexo() {
        return nomeSexo;
    }

    /**
     * Sets the value of the nomeSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeSexo(JAXBElement<String> value) {
        this.nomeSexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numPisPasep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumPisPasep() {
        return numPisPasep;
    }

    /**
     * Sets the value of the numPisPasep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumPisPasep(JAXBElement<String> value) {
        this.numPisPasep = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfNascimento() {
        return ufNascimento;
    }

    /**
     * Sets the value of the ufNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfNascimento(JAXBElement<String> value) {
        this.ufNascimento = ((JAXBElement<String> ) value);
    }

}
