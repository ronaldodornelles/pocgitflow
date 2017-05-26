
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pensionista complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pensionista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faixaEtaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgao" type="{http://servico.wssiapenet}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upag" type="{http://servico.wssiapenet}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pensionista", namespace = "http://entidade.wssiapenet", propOrder = {
    "bairro",
    "cep",
    "cidade",
    "faixaEtaria",
    "logradouro",
    "matriculaBeneficiario",
    "nome",
    "numero",
    "orgao",
    "sexo",
    "uf",
    "upag"
})
public class Pensionista {

    @XmlElementRef(name = "bairro", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> bairro;
    @XmlElementRef(name = "cep", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cep;
    @XmlElementRef(name = "cidade", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cidade;
    @XmlElementRef(name = "faixaEtaria", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> faixaEtaria;
    @XmlElementRef(name = "logradouro", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> logradouro;
    @XmlElementRef(name = "matriculaBeneficiario", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matriculaBeneficiario;
    @XmlElementRef(name = "nome", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "numero", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "orgao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> orgao;
    @XmlElementRef(name = "sexo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "uf", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> uf;
    @XmlElementRef(name = "upag", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> upag;

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairro(JAXBElement<String> value) {
        this.bairro = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCep() {
        return cep;
    }

    /**
     * Sets the value of the cep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCep(JAXBElement<String> value) {
        this.cep = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCidade(JAXBElement<String> value) {
        this.cidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faixaEtaria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaixaEtaria() {
        return faixaEtaria;
    }

    /**
     * Sets the value of the faixaEtaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaixaEtaria(JAXBElement<String> value) {
        this.faixaEtaria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the logradouro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogradouro() {
        return logradouro;
    }

    /**
     * Sets the value of the logradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogradouro(JAXBElement<String> value) {
        this.logradouro = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matriculaBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatriculaBeneficiario() {
        return matriculaBeneficiario;
    }

    /**
     * Sets the value of the matriculaBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatriculaBeneficiario(JAXBElement<String> value) {
        this.matriculaBeneficiario = ((JAXBElement<String> ) value);
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
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getOrgao() {
        return orgao;
    }

    /**
     * Sets the value of the orgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setOrgao(JAXBElement<ArrayOfString> value) {
        this.orgao = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUf(JAXBElement<String> value) {
        this.uf = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the upag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getUpag() {
        return upag;
    }

    /**
     * Sets the value of the upag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setUpag(JAXBElement<ArrayOfString> value) {
        this.upag = ((JAXBElement<ArrayOfString> ) value);
    }

}
