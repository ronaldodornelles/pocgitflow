
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlimentadosPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlimentadosPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codVinculoServidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAlimentado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeVinculoServidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlimentadosPA", propOrder = {
    "codVinculoServidor",
    "nomeAlimentado",
    "nomeVinculoServidor"
})
public class AlimentadosPA {

    @XmlElementRef(name = "codVinculoServidor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codVinculoServidor;
    @XmlElementRef(name = "nomeAlimentado", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeAlimentado;
    @XmlElementRef(name = "nomeVinculoServidor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeVinculoServidor;

    /**
     * Gets the value of the codVinculoServidor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodVinculoServidor() {
        return codVinculoServidor;
    }

    /**
     * Sets the value of the codVinculoServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodVinculoServidor(JAXBElement<String> value) {
        this.codVinculoServidor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeAlimentado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAlimentado() {
        return nomeAlimentado;
    }

    /**
     * Sets the value of the nomeAlimentado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAlimentado(JAXBElement<String> value) {
        this.nomeAlimentado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeVinculoServidor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeVinculoServidor() {
        return nomeVinculoServidor;
    }

    /**
     * Sets the value of the nomeVinculoServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeVinculoServidor(JAXBElement<String> value) {
        this.nomeVinculoServidor = ((JAXBElement<String> ) value);
    }

}
