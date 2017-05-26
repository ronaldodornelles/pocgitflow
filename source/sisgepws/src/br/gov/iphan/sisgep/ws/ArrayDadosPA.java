
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosPA" type="{http://tipo.servico.wssiapenet}ArrayOfDadosPA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosPA", propOrder = {
    "dadosPA"
})
public class ArrayDadosPA {

    @XmlElementRef(name = "dadosPA", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosPA> dadosPA;

    /**
     * Gets the value of the dadosPA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosPA }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosPA> getDadosPA() {
        return dadosPA;
    }

    /**
     * Sets the value of the dadosPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosPA }{@code >}
     *     
     */
    public void setDadosPA(JAXBElement<ArrayOfDadosPA> value) {
        this.dadosPA = ((JAXBElement<ArrayOfDadosPA> ) value);
    }

}
