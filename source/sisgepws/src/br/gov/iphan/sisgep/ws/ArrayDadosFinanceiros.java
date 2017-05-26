
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayDadosFinanceiros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayDadosFinanceiros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosFinanceiros" type="{http://tipo.servico.wssiapenet}ArrayOfDadosFinanceiros" minOccurs="0"/>
 *         &lt;element name="mesAnoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayDadosFinanceiros", propOrder = {
    "dadosFinanceiros",
    "mesAnoPagamento"
})
public class ArrayDadosFinanceiros {

    @XmlElementRef(name = "dadosFinanceiros", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosFinanceiros> dadosFinanceiros;
    @XmlElementRef(name = "mesAnoPagamento", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> mesAnoPagamento;

    /**
     * Gets the value of the dadosFinanceiros property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFinanceiros }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosFinanceiros> getDadosFinanceiros() {
        return dadosFinanceiros;
    }

    /**
     * Sets the value of the dadosFinanceiros property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFinanceiros }{@code >}
     *     
     */
    public void setDadosFinanceiros(JAXBElement<ArrayOfDadosFinanceiros> value) {
        this.dadosFinanceiros = ((JAXBElement<ArrayOfDadosFinanceiros> ) value);
    }

    /**
     * Gets the value of the mesAnoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMesAnoPagamento() {
        return mesAnoPagamento;
    }

    /**
     * Sets the value of the mesAnoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMesAnoPagamento(JAXBElement<String> value) {
        this.mesAnoPagamento = ((JAXBElement<String> ) value);
    }

}
