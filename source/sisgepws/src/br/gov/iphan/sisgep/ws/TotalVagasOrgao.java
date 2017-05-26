
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalVagasOrgao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalVagasOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codNatJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeNatJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vagasPorOrgao" type="{http://tipo.servico.wssiapenet}ArrayOfVagasOrgao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalVagasOrgao", propOrder = {
    "codNatJuridica",
    "nomeNatJuridica",
    "vagasPorOrgao"
})
public class TotalVagasOrgao {

    @XmlElementRef(name = "codNatJuridica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codNatJuridica;
    @XmlElementRef(name = "nomeNatJuridica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeNatJuridica;
    @XmlElementRef(name = "vagasPorOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfVagasOrgao> vagasPorOrgao;

    /**
     * Gets the value of the codNatJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodNatJuridica() {
        return codNatJuridica;
    }

    /**
     * Sets the value of the codNatJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodNatJuridica(JAXBElement<String> value) {
        this.codNatJuridica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeNatJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeNatJuridica() {
        return nomeNatJuridica;
    }

    /**
     * Sets the value of the nomeNatJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeNatJuridica(JAXBElement<String> value) {
        this.nomeNatJuridica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the vagasPorOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVagasOrgao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVagasOrgao> getVagasPorOrgao() {
        return vagasPorOrgao;
    }

    /**
     * Sets the value of the vagasPorOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVagasOrgao }{@code >}
     *     
     */
    public void setVagasPorOrgao(JAXBElement<ArrayOfVagasOrgao> value) {
        this.vagasPorOrgao = ((JAXBElement<ArrayOfVagasOrgao> ) value);
    }

}
