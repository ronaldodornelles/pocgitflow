
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayFichaFinanceira complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayFichaFinanceira">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaFinaceiraBeneficiario" type="{http://tipo.servico.wssiapenet}ArrayOfFichaFinaceiraBeneficiario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayFichaFinanceira", propOrder = {
    "data",
    "fichaFinaceiraBeneficiario"
})
public class ArrayFichaFinanceira {

    @XmlElementRef(name = "data", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> data;
    @XmlElementRef(name = "fichaFinaceiraBeneficiario", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFichaFinaceiraBeneficiario> fichaFinaceiraBeneficiario;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setData(JAXBElement<String> value) {
        this.data = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fichaFinaceiraBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFichaFinaceiraBeneficiario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFichaFinaceiraBeneficiario> getFichaFinaceiraBeneficiario() {
        return fichaFinaceiraBeneficiario;
    }

    /**
     * Sets the value of the fichaFinaceiraBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFichaFinaceiraBeneficiario }{@code >}
     *     
     */
    public void setFichaFinaceiraBeneficiario(JAXBElement<ArrayOfFichaFinaceiraBeneficiario> value) {
        this.fichaFinaceiraBeneficiario = ((JAXBElement<ArrayOfFichaFinaceiraBeneficiario> ) value);
    }

}
