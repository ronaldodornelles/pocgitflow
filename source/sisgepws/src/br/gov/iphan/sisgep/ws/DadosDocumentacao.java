
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosDocumentacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosDocumentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriaCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCarteiraIdentidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataComprovanteMilitar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataExpedicaoCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPrimExpedCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataValidadeCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPisPasep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCarteiraIdentidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCarteiraTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroComprovanteMilitar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgaoCarteiraIdentidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgaoComprovanteMilitar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registroCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secaoTituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieCarteiraTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieComprovanteMilitar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufCarteiraIdentidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufCarteiraMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufCarteiraTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufTituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zonaTituloEleitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDocumentacao", propOrder = {
    "categoriaCarteiraMotorista",
    "dataCarteiraIdentidade",
    "dataComprovanteMilitar",
    "dataExpedicaoCarteiraMotorista",
    "dataPrimExpedCarteiraMotorista",
    "dataTituloEleitor",
    "dataValidadeCarteiraMotorista",
    "numCPF",
    "numPisPasep",
    "numeroCarteiraIdentidade",
    "numeroCarteiraMotorista",
    "numeroCarteiraTrabalho",
    "numeroComprovanteMilitar",
    "numeroTituloEleitor",
    "orgaoCarteiraIdentidade",
    "orgaoComprovanteMilitar",
    "passaporte",
    "registroCarteiraMotorista",
    "secaoTituloEleitor",
    "serieCarteiraTrabalho",
    "serieComprovanteMilitar",
    "ufCarteiraIdentidade",
    "ufCarteiraMotorista",
    "ufCarteiraTrabalho",
    "ufTituloEleitor",
    "zonaTituloEleitor"
})
public class DadosDocumentacao {

    @XmlElementRef(name = "categoriaCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> categoriaCarteiraMotorista;
    @XmlElementRef(name = "dataCarteiraIdentidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataCarteiraIdentidade;
    @XmlElementRef(name = "dataComprovanteMilitar", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataComprovanteMilitar;
    @XmlElementRef(name = "dataExpedicaoCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataExpedicaoCarteiraMotorista;
    @XmlElementRef(name = "dataPrimExpedCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataPrimExpedCarteiraMotorista;
    @XmlElementRef(name = "dataTituloEleitor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataTituloEleitor;
    @XmlElementRef(name = "dataValidadeCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataValidadeCarteiraMotorista;
    @XmlElementRef(name = "numCPF", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numCPF;
    @XmlElementRef(name = "numPisPasep", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numPisPasep;
    @XmlElementRef(name = "numeroCarteiraIdentidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroCarteiraIdentidade;
    @XmlElementRef(name = "numeroCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroCarteiraMotorista;
    @XmlElementRef(name = "numeroCarteiraTrabalho", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroCarteiraTrabalho;
    @XmlElementRef(name = "numeroComprovanteMilitar", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroComprovanteMilitar;
    @XmlElementRef(name = "numeroTituloEleitor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroTituloEleitor;
    @XmlElementRef(name = "orgaoCarteiraIdentidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> orgaoCarteiraIdentidade;
    @XmlElementRef(name = "orgaoComprovanteMilitar", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> orgaoComprovanteMilitar;
    @XmlElementRef(name = "passaporte", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> passaporte;
    @XmlElementRef(name = "registroCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> registroCarteiraMotorista;
    @XmlElementRef(name = "secaoTituloEleitor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> secaoTituloEleitor;
    @XmlElementRef(name = "serieCarteiraTrabalho", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> serieCarteiraTrabalho;
    @XmlElementRef(name = "serieComprovanteMilitar", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> serieComprovanteMilitar;
    @XmlElementRef(name = "ufCarteiraIdentidade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufCarteiraIdentidade;
    @XmlElementRef(name = "ufCarteiraMotorista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufCarteiraMotorista;
    @XmlElementRef(name = "ufCarteiraTrabalho", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufCarteiraTrabalho;
    @XmlElementRef(name = "ufTituloEleitor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufTituloEleitor;
    @XmlElementRef(name = "zonaTituloEleitor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> zonaTituloEleitor;

    /**
     * Gets the value of the categoriaCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoriaCarteiraMotorista() {
        return categoriaCarteiraMotorista;
    }

    /**
     * Sets the value of the categoriaCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoriaCarteiraMotorista(JAXBElement<String> value) {
        this.categoriaCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataCarteiraIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCarteiraIdentidade() {
        return dataCarteiraIdentidade;
    }

    /**
     * Sets the value of the dataCarteiraIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCarteiraIdentidade(JAXBElement<String> value) {
        this.dataCarteiraIdentidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataComprovanteMilitar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataComprovanteMilitar() {
        return dataComprovanteMilitar;
    }

    /**
     * Sets the value of the dataComprovanteMilitar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataComprovanteMilitar(JAXBElement<String> value) {
        this.dataComprovanteMilitar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataExpedicaoCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataExpedicaoCarteiraMotorista() {
        return dataExpedicaoCarteiraMotorista;
    }

    /**
     * Sets the value of the dataExpedicaoCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataExpedicaoCarteiraMotorista(JAXBElement<String> value) {
        this.dataExpedicaoCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataPrimExpedCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataPrimExpedCarteiraMotorista() {
        return dataPrimExpedCarteiraMotorista;
    }

    /**
     * Sets the value of the dataPrimExpedCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataPrimExpedCarteiraMotorista(JAXBElement<String> value) {
        this.dataPrimExpedCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataTituloEleitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataTituloEleitor() {
        return dataTituloEleitor;
    }

    /**
     * Sets the value of the dataTituloEleitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataTituloEleitor(JAXBElement<String> value) {
        this.dataTituloEleitor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataValidadeCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataValidadeCarteiraMotorista() {
        return dataValidadeCarteiraMotorista;
    }

    /**
     * Sets the value of the dataValidadeCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataValidadeCarteiraMotorista(JAXBElement<String> value) {
        this.dataValidadeCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numCPF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumCPF() {
        return numCPF;
    }

    /**
     * Sets the value of the numCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumCPF(JAXBElement<String> value) {
        this.numCPF = ((JAXBElement<String> ) value);
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
     * Gets the value of the numeroCarteiraIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCarteiraIdentidade() {
        return numeroCarteiraIdentidade;
    }

    /**
     * Sets the value of the numeroCarteiraIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCarteiraIdentidade(JAXBElement<String> value) {
        this.numeroCarteiraIdentidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCarteiraMotorista() {
        return numeroCarteiraMotorista;
    }

    /**
     * Sets the value of the numeroCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCarteiraMotorista(JAXBElement<String> value) {
        this.numeroCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroCarteiraTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    /**
     * Sets the value of the numeroCarteiraTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCarteiraTrabalho(JAXBElement<String> value) {
        this.numeroCarteiraTrabalho = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroComprovanteMilitar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroComprovanteMilitar() {
        return numeroComprovanteMilitar;
    }

    /**
     * Sets the value of the numeroComprovanteMilitar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroComprovanteMilitar(JAXBElement<String> value) {
        this.numeroComprovanteMilitar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroTituloEleitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTituloEleitor() {
        return numeroTituloEleitor;
    }

    /**
     * Sets the value of the numeroTituloEleitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTituloEleitor(JAXBElement<String> value) {
        this.numeroTituloEleitor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgaoCarteiraIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaoCarteiraIdentidade() {
        return orgaoCarteiraIdentidade;
    }

    /**
     * Sets the value of the orgaoCarteiraIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaoCarteiraIdentidade(JAXBElement<String> value) {
        this.orgaoCarteiraIdentidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgaoComprovanteMilitar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaoComprovanteMilitar() {
        return orgaoComprovanteMilitar;
    }

    /**
     * Sets the value of the orgaoComprovanteMilitar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaoComprovanteMilitar(JAXBElement<String> value) {
        this.orgaoComprovanteMilitar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the passaporte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassaporte() {
        return passaporte;
    }

    /**
     * Sets the value of the passaporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassaporte(JAXBElement<String> value) {
        this.passaporte = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registroCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistroCarteiraMotorista() {
        return registroCarteiraMotorista;
    }

    /**
     * Sets the value of the registroCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistroCarteiraMotorista(JAXBElement<String> value) {
        this.registroCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secaoTituloEleitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecaoTituloEleitor() {
        return secaoTituloEleitor;
    }

    /**
     * Sets the value of the secaoTituloEleitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecaoTituloEleitor(JAXBElement<String> value) {
        this.secaoTituloEleitor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serieCarteiraTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieCarteiraTrabalho() {
        return serieCarteiraTrabalho;
    }

    /**
     * Sets the value of the serieCarteiraTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieCarteiraTrabalho(JAXBElement<String> value) {
        this.serieCarteiraTrabalho = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serieComprovanteMilitar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieComprovanteMilitar() {
        return serieComprovanteMilitar;
    }

    /**
     * Sets the value of the serieComprovanteMilitar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieComprovanteMilitar(JAXBElement<String> value) {
        this.serieComprovanteMilitar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufCarteiraIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfCarteiraIdentidade() {
        return ufCarteiraIdentidade;
    }

    /**
     * Sets the value of the ufCarteiraIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfCarteiraIdentidade(JAXBElement<String> value) {
        this.ufCarteiraIdentidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufCarteiraMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfCarteiraMotorista() {
        return ufCarteiraMotorista;
    }

    /**
     * Sets the value of the ufCarteiraMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfCarteiraMotorista(JAXBElement<String> value) {
        this.ufCarteiraMotorista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufCarteiraTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfCarteiraTrabalho() {
        return ufCarteiraTrabalho;
    }

    /**
     * Sets the value of the ufCarteiraTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfCarteiraTrabalho(JAXBElement<String> value) {
        this.ufCarteiraTrabalho = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufTituloEleitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfTituloEleitor() {
        return ufTituloEleitor;
    }

    /**
     * Sets the value of the ufTituloEleitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfTituloEleitor(JAXBElement<String> value) {
        this.ufTituloEleitor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the zonaTituloEleitor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZonaTituloEleitor() {
        return zonaTituloEleitor;
    }

    /**
     * Sets the value of the zonaTituloEleitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZonaTituloEleitor(JAXBElement<String> value) {
        this.zonaTituloEleitor = ((JAXBElement<String> ) value);
    }

}
