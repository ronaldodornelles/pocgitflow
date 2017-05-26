
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosBancarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosBancarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosBancarios" type="{http://tipo.servico.wssiapenet}ArrayOfDadosBancarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosBancarios", propOrder = {
    "dadosBancarios"
})
public class ArrayDadosBancarios {

    @XmlElementRef(name = "dadosBancarios", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosBancarios> dadosBancarios;

    /**
     * Gets the value of the dadosBancarios property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosBancarios }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosBancarios> getDadosBancarios() {
        return dadosBancarios;
    }

    /**
     * Sets the value of the dadosBancarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosBancarios }{@code >}
     *     
     */
    public void setDadosBancarios(JAXBElement<ArrayOfDadosBancarios> value) {
        this.dadosBancarios = ((JAXBElement<ArrayOfDadosBancarios> ) value);
    }

}
