
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayPensaoRecebida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayPensaoRecebida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pensaoRecebida" type="{http://tipo.servico.wssiapenet}ArrayOfPensaoRecebida" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayPensaoRecebida", propOrder = {
    "pensaoRecebida"
})
public class ArrayPensaoRecebida {

    @XmlElementRef(name = "pensaoRecebida", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPensaoRecebida> pensaoRecebida;

    /**
     * Gets the value of the pensaoRecebida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPensaoRecebida }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPensaoRecebida> getPensaoRecebida() {
        return pensaoRecebida;
    }

    /**
     * Sets the value of the pensaoRecebida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPensaoRecebida }{@code >}
     *     
     */
    public void setPensaoRecebida(JAXBElement<ArrayOfPensaoRecebida> value) {
        this.pensaoRecebida = ((JAXBElement<ArrayOfPensaoRecebida> ) value);
    }

}
