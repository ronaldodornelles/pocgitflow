
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VagasOrgao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VagasOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcoesOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantVagaFuncaoLivre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantVagaFuncaoOcupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VagasOrgao", propOrder = {
    "funcoesOrgao",
    "quantVagaFuncaoLivre",
    "quantVagaFuncaoOcupada"
})
public class VagasOrgao {

    @XmlElementRef(name = "funcoesOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> funcoesOrgao;
    @XmlElementRef(name = "quantVagaFuncaoLivre", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> quantVagaFuncaoLivre;
    @XmlElementRef(name = "quantVagaFuncaoOcupada", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> quantVagaFuncaoOcupada;

    /**
     * Gets the value of the funcoesOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuncoesOrgao() {
        return funcoesOrgao;
    }

    /**
     * Sets the value of the funcoesOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuncoesOrgao(JAXBElement<String> value) {
        this.funcoesOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the quantVagaFuncaoLivre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantVagaFuncaoLivre() {
        return quantVagaFuncaoLivre;
    }

    /**
     * Sets the value of the quantVagaFuncaoLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantVagaFuncaoLivre(JAXBElement<String> value) {
        this.quantVagaFuncaoLivre = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the quantVagaFuncaoOcupada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantVagaFuncaoOcupada() {
        return quantVagaFuncaoOcupada;
    }

    /**
     * Sets the value of the quantVagaFuncaoOcupada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantVagaFuncaoOcupada(JAXBElement<String> value) {
        this.quantVagaFuncaoOcupada = ((JAXBElement<String> ) value);
    }

}
