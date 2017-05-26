
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosDependentes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosDependentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosDependentes" type="{http://tipo.servico.wssiapenet}ArrayOfDadosDependentes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosDependentes", propOrder = {
    "dadosDependentes"
})
public class ArrayDadosDependentes {

    @XmlElementRef(name = "dadosDependentes", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosDependentes> dadosDependentes;

    /**
     * Gets the value of the dadosDependentes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosDependentes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosDependentes> getDadosDependentes() {
        return dadosDependentes;
    }

    /**
     * Sets the value of the dadosDependentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosDependentes }{@code >}
     *     
     */
    public void setDadosDependentes(JAXBElement<ArrayOfDadosDependentes> value) {
        this.dadosDependentes = ((JAXBElement<ArrayOfDadosDependentes> ) value);
    }

}
