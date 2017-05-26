
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosUorg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosUorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uorgs" type="{http://tipo.servico.wssiapenet}ArrayOfDadosUorg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosUorg", propOrder = {
    "uorgs"
})
public class ArrayDadosUorg {

    @XmlElementRef(name = "uorgs", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosUorg> uorgs;

    /**
     * Gets the value of the uorgs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosUorg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosUorg> getUorgs() {
        return uorgs;
    }

    /**
     * Sets the value of the uorgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosUorg }{@code >}
     *     
     */
    public void setUorgs(JAXBElement<ArrayOfDadosUorg> value) {
        this.uorgs = ((JAXBElement<ArrayOfDadosUorg> ) value);
    }

}
