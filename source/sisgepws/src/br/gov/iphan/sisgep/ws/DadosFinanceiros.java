
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosFinanceiros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosFinanceiros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAnoMesRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorMovSupl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pzRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosFinanceiros", propOrder = {
    "codRubrica",
    "dataAnoMesRubrica",
    "indicadorMovSupl",
    "indicadorRD",
    "nomeRubrica",
    "numeroSeq",
    "peRubrica",
    "pzRubrica",
    "valorRubrica"
})
public class DadosFinanceiros {

    @XmlElementRef(name = "codRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codRubrica;
    @XmlElementRef(name = "dataAnoMesRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataAnoMesRubrica;
    @XmlElementRef(name = "indicadorMovSupl", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorMovSupl;
    @XmlElementRef(name = "indicadorRD", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorRD;
    @XmlElementRef(name = "nomeRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeRubrica;
    @XmlElementRef(name = "numeroSeq", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> numeroSeq;
    @XmlElementRef(name = "peRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> peRubrica;
    @XmlElementRef(name = "pzRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> pzRubrica;
    @XmlElementRef(name = "valorRubrica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> valorRubrica;

    /**
     * Gets the value of the codRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodRubrica() {
        return codRubrica;
    }

    /**
     * Sets the value of the codRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodRubrica(JAXBElement<String> value) {
        this.codRubrica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataAnoMesRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAnoMesRubrica() {
        return dataAnoMesRubrica;
    }

    /**
     * Sets the value of the dataAnoMesRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAnoMesRubrica(JAXBElement<String> value) {
        this.dataAnoMesRubrica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorMovSupl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorMovSupl() {
        return indicadorMovSupl;
    }

    /**
     * Sets the value of the indicadorMovSupl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorMovSupl(JAXBElement<String> value) {
        this.indicadorMovSupl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorRD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorRD() {
        return indicadorRD;
    }

    /**
     * Sets the value of the indicadorRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorRD(JAXBElement<String> value) {
        this.indicadorRD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeRubrica() {
        return nomeRubrica;
    }

    /**
     * Sets the value of the nomeRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeRubrica(JAXBElement<String> value) {
        this.nomeRubrica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroSeq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroSeq() {
        return numeroSeq;
    }

    /**
     * Sets the value of the numeroSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroSeq(JAXBElement<String> value) {
        this.numeroSeq = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the peRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeRubrica() {
        return peRubrica;
    }

    /**
     * Sets the value of the peRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeRubrica(JAXBElement<String> value) {
        this.peRubrica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pzRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPzRubrica() {
        return pzRubrica;
    }

    /**
     * Sets the value of the pzRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPzRubrica(JAXBElement<String> value) {
        this.pzRubrica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the valorRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValorRubrica() {
        return valorRubrica;
    }

    /**
     * Sets the value of the valorRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValorRubrica(JAXBElement<String> value) {
        this.valorRubrica = ((JAXBElement<String> ) value);
    }

}
