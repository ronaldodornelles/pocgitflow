
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Servidor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Servidor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUltimaTransacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Servidor", namespace = "http://entidade.wssiapenet", propOrder = {
    "cpf",
    "dataUltimaTransacao"
})
public class Servidor {

    @XmlElementRef(name = "cpf", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "dataUltimaTransacao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataUltimaTransacao;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpf(JAXBElement<String> value) {
        this.cpf = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataUltimaTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataUltimaTransacao() {
        return dataUltimaTransacao;
    }

    /**
     * Sets the value of the dataUltimaTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataUltimaTransacao(JAXBElement<String> value) {
        this.dataUltimaTransacao = ((JAXBElement<String> ) value);
    }

}
