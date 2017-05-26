
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosEscolares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosEscolares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayCursos" type="{http://tipo.servico.wssiapenet}ArrayOfDadosCurso" minOccurs="0"/>
 *         &lt;element name="arrayTitulacao" type="{http://tipo.servico.wssiapenet}ArrayOfDadosTitulacao" minOccurs="0"/>
 *         &lt;element name="codEscolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEscolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosEscolares", propOrder = {
    "arrayCursos",
    "arrayTitulacao",
    "codEscolaridade",
    "nomeEscolaridade"
})
public class DadosEscolares {

    @XmlElementRef(name = "arrayCursos", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosCurso> arrayCursos;
    @XmlElementRef(name = "arrayTitulacao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDadosTitulacao> arrayTitulacao;
    @XmlElementRef(name = "codEscolaridade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codEscolaridade;
    @XmlElementRef(name = "nomeEscolaridade", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeEscolaridade;

    /**
     * Gets the value of the arrayCursos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosCurso }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosCurso> getArrayCursos() {
        return arrayCursos;
    }

    /**
     * Sets the value of the arrayCursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosCurso }{@code >}
     *     
     */
    public void setArrayCursos(JAXBElement<ArrayOfDadosCurso> value) {
        this.arrayCursos = ((JAXBElement<ArrayOfDadosCurso> ) value);
    }

    /**
     * Gets the value of the arrayTitulacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosTitulacao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosTitulacao> getArrayTitulacao() {
        return arrayTitulacao;
    }

    /**
     * Sets the value of the arrayTitulacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosTitulacao }{@code >}
     *     
     */
    public void setArrayTitulacao(JAXBElement<ArrayOfDadosTitulacao> value) {
        this.arrayTitulacao = ((JAXBElement<ArrayOfDadosTitulacao> ) value);
    }

    /**
     * Gets the value of the codEscolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEscolaridade() {
        return codEscolaridade;
    }

    /**
     * Sets the value of the codEscolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEscolaridade(JAXBElement<String> value) {
        this.codEscolaridade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeEscolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEscolaridade() {
        return nomeEscolaridade;
    }

    /**
     * Sets the value of the nomeEscolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEscolaridade(JAXBElement<String> value) {
        this.nomeEscolaridade = ((JAXBElement<String> ) value);
    }

}
