
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosFuncionais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosFuncionais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosFuncionais" type="{http://tipo.servico.wssiapenet}ArrayOfDadosFuncionais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosFuncionais", propOrder = {
    "dadosFuncionais"
})
public class ArrayDadosFuncionais {

    @XmlElementRef(name = "dadosFuncionais", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosFuncionais> dadosFuncionais;

    /**
     * Gets the value of the dadosFuncionais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFuncionais }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosFuncionais> getDadosFuncionais() {
        return dadosFuncionais;
    }

    /**
     * Sets the value of the dadosFuncionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFuncionais }{@code >}
     *     
     */
    public void setDadosFuncionais(JAXBElement<ArrayOfDadosFuncionais> value) {
        this.dadosFuncionais = ((JAXBElement<ArrayOfDadosFuncionais> ) value);
    }

}
