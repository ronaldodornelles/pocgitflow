
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosAfastamentoPorCpf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosAfastamentoPorCpf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ocorrencias" type="{http://tipo.servico.wssiapenet}ArrayOfDadosOcorrencias" minOccurs="0"/>
 *         &lt;element name="reclusao" type="{http://tipo.servico.wssiapenet}ArrayOfDadosReclusao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAfastamentoPorCpf", propOrder = {
    "ocorrencias",
    "reclusao"
})
public class DadosAfastamentoPorCpf {

    @XmlElementRef(name = "ocorrencias", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosOcorrencias> ocorrencias;
    @XmlElementRef(name = "reclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosReclusao> reclusao;

    /**
     * Gets the value of the ocorrencias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosOcorrencias }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosOcorrencias> getOcorrencias() {
        return ocorrencias;
    }

    /**
     * Sets the value of the ocorrencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosOcorrencias }{@code >}
     *     
     */
    public void setOcorrencias(JAXBElement<ArrayOfDadosOcorrencias> value) {
        this.ocorrencias = ((JAXBElement<ArrayOfDadosOcorrencias> ) value);
    }

    /**
     * Gets the value of the reclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosReclusao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosReclusao> getReclusao() {
        return reclusao;
    }

    /**
     * Sets the value of the reclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosReclusao }{@code >}
     *     
     */
    public void setReclusao(JAXBElement<ArrayOfDadosReclusao> value) {
        this.reclusao = ((JAXBElement<ArrayOfDadosReclusao> ) value);
    }

}
