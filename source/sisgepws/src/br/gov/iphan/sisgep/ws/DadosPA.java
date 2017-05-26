
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenciaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrayAlimentadosPA" type="{http://tipo.servico.wssiapenet}ArrayOfAlimentadosPA" minOccurs="0"/>
 *         &lt;element name="bancoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorUltimaPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPA", propOrder = {
    "agenciaBeneficiario",
    "arrayAlimentadosPA",
    "bancoBeneficiario",
    "codOrgao",
    "contaBeneficiario",
    "cpfBeneficiario",
    "matricula",
    "nomeBeneficiario",
    "valorUltimaPensao"
})
public class DadosPA {

    @XmlElementRef(name = "agenciaBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> agenciaBeneficiario;
    @XmlElementRef(name = "arrayAlimentadosPA", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAlimentadosPA> arrayAlimentadosPA;
    @XmlElementRef(name = "bancoBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> bancoBeneficiario;
    @XmlElementRef(name = "codOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "contaBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> contaBeneficiario;
    @XmlElementRef(name = "cpfBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfBeneficiario;
    @XmlElementRef(name = "matricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "nomeBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeBeneficiario;
    @XmlElementRef(name = "valorUltimaPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> valorUltimaPensao;

    /**
     * Gets the value of the agenciaBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgenciaBeneficiario() {
        return agenciaBeneficiario;
    }

    /**
     * Sets the value of the agenciaBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgenciaBeneficiario(JAXBElement<String> value) {
        this.agenciaBeneficiario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the arrayAlimentadosPA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlimentadosPA }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlimentadosPA> getArrayAlimentadosPA() {
        return arrayAlimentadosPA;
    }

    /**
     * Sets the value of the arrayAlimentadosPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlimentadosPA }{@code >}
     *     
     */
    public void setArrayAlimentadosPA(JAXBElement<ArrayOfAlimentadosPA> value) {
        this.arrayAlimentadosPA = ((JAXBElement<ArrayOfAlimentadosPA> ) value);
    }

    /**
     * Gets the value of the bancoBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBancoBeneficiario() {
        return bancoBeneficiario;
    }

    /**
     * Sets the value of the bancoBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBancoBeneficiario(JAXBElement<String> value) {
        this.bancoBeneficiario = ((JAXBElement<String> ) value);
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
     * Gets the value of the contaBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContaBeneficiario() {
        return contaBeneficiario;
    }

    /**
     * Sets the value of the contaBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContaBeneficiario(JAXBElement<String> value) {
        this.contaBeneficiario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpfBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfBeneficiario() {
        return cpfBeneficiario;
    }

    /**
     * Sets the value of the cpfBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfBeneficiario(JAXBElement<String> value) {
        this.cpfBeneficiario = ((JAXBElement<String> ) value);
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
     * Gets the value of the nomeBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    /**
     * Sets the value of the nomeBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeBeneficiario(JAXBElement<String> value) {
        this.nomeBeneficiario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the valorUltimaPensao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValorUltimaPensao() {
        return valorUltimaPensao;
    }

    /**
     * Sets the value of the valorUltimaPensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValorUltimaPensao(JAXBElement<String> value) {
        this.valorUltimaPensao = ((JAXBElement<String> ) value);
    }

}
