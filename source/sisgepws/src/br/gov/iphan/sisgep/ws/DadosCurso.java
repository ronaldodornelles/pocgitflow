
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCurso", propOrder = {
    "codCurso",
    "nomeCurso"
})
public class DadosCurso {

    @XmlElementRef(name = "codCurso", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codCurso;
    @XmlElementRef(name = "nomeCurso", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeCurso;

    /**
     * Gets the value of the codCurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCurso() {
        return codCurso;
    }

    /**
     * Sets the value of the codCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCurso(JAXBElement<String> value) {
        this.codCurso = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeCurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCurso() {
        return nomeCurso;
    }

    /**
     * Sets the value of the nomeCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCurso(JAXBElement<String> value) {
        this.nomeCurso = ((JAXBElement<String> ) value);
    }

}
