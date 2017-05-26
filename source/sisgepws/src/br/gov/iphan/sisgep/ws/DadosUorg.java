
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosUorg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosUorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bairroUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipioUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgaoUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logradouroUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMunicipioUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numFaxUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTelefoneUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosUorg", propOrder = {
    "bairroUorg",
    "cepUorg",
    "codMatricula",
    "codMunicipioUorg",
    "codOrgao",
    "codOrgaoUorg",
    "complementoUorg",
    "emailUorg",
    "endUorg",
    "logradouroUorg",
    "nomeMunicipioUorg",
    "nomeUorg",
    "numFaxUorg",
    "numTelefoneUorg",
    "numeroUorg",
    "siglaUorg",
    "ufUorg"
})
public class DadosUorg {

    @XmlElementRef(name = "bairroUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> bairroUorg;
    @XmlElementRef(name = "cepUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cepUorg;
    @XmlElementRef(name = "codMatricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codMatricula;
    @XmlElementRef(name = "codMunicipioUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codMunicipioUorg;
    @XmlElementRef(name = "codOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "codOrgaoUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgaoUorg;
    @XmlElementRef(name = "complementoUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> complementoUorg;
    @XmlElementRef(name = "emailUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> emailUorg;
    @XmlElementRef(name = "endUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> endUorg;
    @XmlElementRef(name = "logradouroUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> logradouroUorg;
    @XmlElementRef(name = "nomeMunicipioUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeMunicipioUorg;
    @XmlElementRef(name = "nomeUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUorg;
    @XmlElementRef(name = "numFaxUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numFaxUorg;
    @XmlElementRef(name = "numTelefoneUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numTelefoneUorg;
    @XmlElementRef(name = "numeroUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroUorg;
    @XmlElementRef(name = "siglaUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaUorg;
    @XmlElementRef(name = "ufUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> ufUorg;

    /**
     * Gets the value of the bairroUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairroUorg() {
        return bairroUorg;
    }

    /**
     * Sets the value of the bairroUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairroUorg(JAXBElement<String> value) {
        this.bairroUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cepUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCepUorg() {
        return cepUorg;
    }

    /**
     * Sets the value of the cepUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCepUorg(JAXBElement<String> value) {
        this.cepUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMatricula() {
        return codMatricula;
    }

    /**
     * Sets the value of the codMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMatricula(JAXBElement<String> value) {
        this.codMatricula = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codMunicipioUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMunicipioUorg() {
        return codMunicipioUorg;
    }

    /**
     * Sets the value of the codMunicipioUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMunicipioUorg(JAXBElement<String> value) {
        this.codMunicipioUorg = ((JAXBElement<String> ) value);
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
     * Gets the value of the codOrgaoUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOrgaoUorg() {
        return codOrgaoUorg;
    }

    /**
     * Sets the value of the codOrgaoUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOrgaoUorg(JAXBElement<String> value) {
        this.codOrgaoUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the complementoUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplementoUorg() {
        return complementoUorg;
    }

    /**
     * Sets the value of the complementoUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplementoUorg(JAXBElement<String> value) {
        this.complementoUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailUorg() {
        return emailUorg;
    }

    /**
     * Sets the value of the emailUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailUorg(JAXBElement<String> value) {
        this.emailUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndUorg() {
        return endUorg;
    }

    /**
     * Sets the value of the endUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndUorg(JAXBElement<String> value) {
        this.endUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the logradouroUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogradouroUorg() {
        return logradouroUorg;
    }

    /**
     * Sets the value of the logradouroUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogradouroUorg(JAXBElement<String> value) {
        this.logradouroUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeMunicipioUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMunicipioUorg() {
        return nomeMunicipioUorg;
    }

    /**
     * Sets the value of the nomeMunicipioUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMunicipioUorg(JAXBElement<String> value) {
        this.nomeMunicipioUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUorg() {
        return nomeUorg;
    }

    /**
     * Sets the value of the nomeUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUorg(JAXBElement<String> value) {
        this.nomeUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numFaxUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumFaxUorg() {
        return numFaxUorg;
    }

    /**
     * Sets the value of the numFaxUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumFaxUorg(JAXBElement<String> value) {
        this.numFaxUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numTelefoneUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumTelefoneUorg() {
        return numTelefoneUorg;
    }

    /**
     * Sets the value of the numTelefoneUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumTelefoneUorg(JAXBElement<String> value) {
        this.numTelefoneUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroUorg() {
        return numeroUorg;
    }

    /**
     * Sets the value of the numeroUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroUorg(JAXBElement<String> value) {
        this.numeroUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaUorg() {
        return siglaUorg;
    }

    /**
     * Sets the value of the siglaUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaUorg(JAXBElement<String> value) {
        this.siglaUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ufUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfUorg() {
        return ufUorg;
    }

    /**
     * Sets the value of the ufUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfUorg(JAXBElement<String> value) {
        this.ufUorg = ((JAXBElement<String> ) value);
    }

}
