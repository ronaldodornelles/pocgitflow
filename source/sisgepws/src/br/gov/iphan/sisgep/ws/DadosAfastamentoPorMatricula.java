
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosAfastamentoPorMatricula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosAfastamentoPorMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ferias" type="{http://tipo.servico.wssiapenet}ArrayOfDadosFerias" minOccurs="0"/>
 *         &lt;element name="grMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpa" type="{http://tipo.servico.wssiapenet}ArrayOfDadosLpa" minOccurs="0"/>
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
@XmlType(name = "DadosAfastamentoPorMatricula", propOrder = {
    "ferias",
    "grMatricula",
    "lpa",
    "ocorrencias",
    "reclusao"
})
public class DadosAfastamentoPorMatricula {

    @XmlElementRef(name = "ferias", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosFerias> ferias;
    @XmlElementRef(name = "grMatricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> grMatricula;
    @XmlElementRef(name = "lpa", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosLpa> lpa;
    @XmlElementRef(name = "ocorrencias", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosOcorrencias> ocorrencias;
    @XmlElementRef(name = "reclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosReclusao> reclusao;

    /**
     * Gets the value of the ferias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFerias }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosFerias> getFerias() {
        return ferias;
    }

    /**
     * Sets the value of the ferias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosFerias }{@code >}
     *     
     */
    public void setFerias(JAXBElement<ArrayOfDadosFerias> value) {
        this.ferias = ((JAXBElement<ArrayOfDadosFerias> ) value);
    }

    /**
     * Gets the value of the grMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrMatricula() {
        return grMatricula;
    }

    /**
     * Sets the value of the grMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrMatricula(JAXBElement<String> value) {
        this.grMatricula = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lpa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosLpa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosLpa> getLpa() {
        return lpa;
    }

    /**
     * Sets the value of the lpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosLpa }{@code >}
     *     
     */
    public void setLpa(JAXBElement<ArrayOfDadosLpa> value) {
        this.lpa = ((JAXBElement<ArrayOfDadosLpa> ) value);
    }

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
