
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosSICAJ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosSICAJ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosSICAJ" type="{http://tipo.servico.wssiapenet}ArrayOfDadosSICAJ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosSICAJ", propOrder = {
    "dadosSICAJ"
})
public class ArrayDadosSICAJ {

    @XmlElementRef(name = "dadosSICAJ", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosSICAJ> dadosSICAJ;

    /**
     * Gets the value of the dadosSICAJ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosSICAJ }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosSICAJ> getDadosSICAJ() {
        return dadosSICAJ;
    }

    /**
     * Sets the value of the dadosSICAJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosSICAJ }{@code >}
     *     
     */
    public void setDadosSICAJ(JAXBElement<ArrayOfDadosSICAJ> value) {
        this.dadosSICAJ = ((JAXBElement<ArrayOfDadosSICAJ> ) value);
    }

}
