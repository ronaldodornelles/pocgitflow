
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayPensoesInstituidas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayPensoesInstituidas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pensoesInstituidas" type="{http://tipo.servico.wssiapenet}ArrayOfPensoesInstituidas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayPensoesInstituidas", propOrder = {
    "pensoesInstituidas"
})
public class ArrayPensoesInstituidas {

    @XmlElementRef(name = "pensoesInstituidas", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPensoesInstituidas> pensoesInstituidas;

    /**
     * Gets the value of the pensoesInstituidas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPensoesInstituidas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPensoesInstituidas> getPensoesInstituidas() {
        return pensoesInstituidas;
    }

    /**
     * Sets the value of the pensoesInstituidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPensoesInstituidas }{@code >}
     *     
     */
    public void setPensoesInstituidas(JAXBElement<ArrayOfPensoesInstituidas> value) {
        this.pensoesInstituidas = ((JAXBElement<ArrayOfPensoesInstituidas> ) value);
    }

}
