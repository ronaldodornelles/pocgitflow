
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosSICAJ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosSICAJ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAjuizamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTransitoJulgamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorExclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorSituacaoAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusAcaoSICAJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusAcaoTabela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorBeneficiarioAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosSICAJ", propOrder = {
    "codAcao",
    "codOrgao",
    "dataAjuizamento",
    "dataTransitoJulgamento",
    "indicadorExclusao",
    "indicadorSituacaoAcao",
    "matricula",
    "numAcao",
    "statusAcaoSICAJ",
    "statusAcaoTabela",
    "ufAcao",
    "valorBeneficiarioAcao"
})
public class DadosSICAJ {

    @XmlElementRef(name = "codAcao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codAcao;
    @XmlElementRef(name = "codOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "dataAjuizamento", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataAjuizamento;
    @XmlElementRef(name = "dataTransitoJulgamento", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataTransitoJulgamento;
    @XmlElementRef(name = "indicadorExclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorExclusao;
    @XmlElementRef(name = "indicadorSituacaoAcao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorSituacaoAcao;
    @XmlElementRef(name = "matricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "numAcao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numAcao;
    @XmlElementRef(name = "statusAcaoSICAJ", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> statusAcaoSICAJ;
    @XmlElementRef(name = "statusAcaoTabela", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> statusAcaoTabela;
    @XmlElementRef(name = "ufAcao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufAcao;
    @XmlElementRef(name = "valorBeneficiarioAcao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> valorBeneficiarioAcao;

    /**
     * Gets the value of the codAcao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAcao() {
        return codAcao;
    }

    /**
     * Sets the value of the codAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAcao(JAXBElement<String> value) {
        this.codAcao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOrgao() {
        return codOrgao;
    }

    /**
     * Sets the value of the codOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOrgao(JAXBElement<String> value) {
        this.codOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataAjuizamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAjuizamento() {
        return dataAjuizamento;
    }

    /**
     * Sets the value of the dataAjuizamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAjuizamento(JAXBElement<String> value) {
        this.dataAjuizamento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataTransitoJulgamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataTransitoJulgamento() {
        return dataTransitoJulgamento;
    }

    /**
     * Sets the value of the dataTransitoJulgamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataTransitoJulgamento(JAXBElement<String> value) {
        this.dataTransitoJulgamento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorExclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorExclusao() {
        return indicadorExclusao;
    }

    /**
     * Sets the value of the indicadorExclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorExclusao(JAXBElement<String> value) {
        this.indicadorExclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorSituacaoAcao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorSituacaoAcao() {
        return indicadorSituacaoAcao;
    }

    /**
     * Sets the value of the indicadorSituacaoAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorSituacaoAcao(JAXBElement<String> value) {
        this.indicadorSituacaoAcao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatricula(JAXBElement<String> value) {
        this.matricula = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numAcao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAcao() {
        return numAcao;
    }

    /**
     * Sets the value of the numAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAcao(JAXBElement<String> value) {
        this.numAcao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusAcaoSICAJ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusAcaoSICAJ() {
        return statusAcaoSICAJ;
    }

    /**
     * Sets the value of the statusAcaoSICAJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusAcaoSICAJ(JAXBElement<String> value) {
        this.statusAcaoSICAJ = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusAcaoTabela property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusAcaoTabela() {
        return statusAcaoTabela;
    }

    /**
     * Sets the value of the statusAcaoTabela property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusAcaoTabela(JAXBElement<String> value) {
        this.statusAcaoTabela = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufAcao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfAcao() {
        return ufAcao;
    }

    /**
     * Sets the value of the ufAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfAcao(JAXBElement<String> value) {
        this.ufAcao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the valorBeneficiarioAcao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValorBeneficiarioAcao() {
        return valorBeneficiarioAcao;
    }

    /**
     * Sets the value of the valorBeneficiarioAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValorBeneficiarioAcao(JAXBElement<String> value) {
        this.valorBeneficiarioAcao = ((JAXBElement<String> ) value);
    }

}
