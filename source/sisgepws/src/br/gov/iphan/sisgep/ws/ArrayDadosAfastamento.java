
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosAfastamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosAfastamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAfastamentoPorCPF" type="{http://tipo.servico.wssiapenet}ArrayOfDadosAfastamentoPorCpf" minOccurs="0"/>
 *         &lt;element name="dadosAfastamentoPorMatricula" type="{http://tipo.servico.wssiapenet}ArrayOfDadosAfastamentoPorMatricula" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosAfastamento", propOrder = {
    "dadosAfastamentoPorCPF",
    "dadosAfastamentoPorMatricula"
})
public class ArrayDadosAfastamento {

    @XmlElementRef(name = "dadosAfastamentoPorCPF", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosAfastamentoPorCpf> dadosAfastamentoPorCPF;
    @XmlElementRef(name = "dadosAfastamentoPorMatricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosAfastamentoPorMatricula> dadosAfastamentoPorMatricula;

    /**
     * Gets the value of the dadosAfastamentoPorCPF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorCpf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosAfastamentoPorCpf> getDadosAfastamentoPorCPF() {
        return dadosAfastamentoPorCPF;
    }

    /**
     * Sets the value of the dadosAfastamentoPorCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorCpf }{@code >}
     *     
     */
    public void setDadosAfastamentoPorCPF(JAXBElement<ArrayOfDadosAfastamentoPorCpf> value) {
        this.dadosAfastamentoPorCPF = ((JAXBElement<ArrayOfDadosAfastamentoPorCpf> ) value);
    }

    /**
     * Gets the value of the dadosAfastamentoPorMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorMatricula }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosAfastamentoPorMatricula> getDadosAfastamentoPorMatricula() {
        return dadosAfastamentoPorMatricula;
    }

    /**
     * Sets the value of the dadosAfastamentoPorMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorMatricula }{@code >}
     *     
     */
    public void setDadosAfastamentoPorMatricula(JAXBElement<ArrayOfDadosAfastamentoPorMatricula> value) {
        this.dadosAfastamentoPorMatricula = ((JAXBElement<ArrayOfDadosAfastamentoPorMatricula> ) value);
    }

}
