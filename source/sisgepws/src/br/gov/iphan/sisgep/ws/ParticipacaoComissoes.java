
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipacaoComissoes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipacaoComissoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoParticipacaoComissoes" type="{http://entidade.wssiapenet}TipoParticipacaoComissoes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipacaoComissoes", namespace = "http://entidade.wssiapenet", propOrder = {
    "codigo",
    "dataFim",
    "dataInicio",
    "identificUnica",
    "infoAdicionais",
    "tipoDesc",
    "tipoParticipacaoComissoes"
})
public class ParticipacaoComissoes {

    @XmlElementRef(name = "codigo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> codigo;
    @XmlElementRef(name = "dataFim", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataFim;
    @XmlElementRef(name = "dataInicio", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataInicio;
    @XmlElementRef(name = "identificUnica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identificUnica;
    @XmlElementRef(name = "infoAdicionais", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> infoAdicionais;
    @XmlElementRef(name = "tipoDesc", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> tipoDesc;
    @XmlElementRef(name = "tipoParticipacaoComissoes", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<TipoParticipacaoComissoes> tipoParticipacaoComissoes;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigo(JAXBElement<Integer> value) {
        this.codigo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dataFim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFim() {
        return dataFim;
    }

    /**
     * Sets the value of the dataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFim(JAXBElement<String> value) {
        this.dataFim = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataInicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataInicio() {
        return dataInicio;
    }

    /**
     * Sets the value of the dataInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataInicio(JAXBElement<String> value) {
        this.dataInicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identificUnica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificUnica() {
        return identificUnica;
    }

    /**
     * Sets the value of the identificUnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificUnica(JAXBElement<String> value) {
        this.identificUnica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the infoAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfoAdicionais() {
        return infoAdicionais;
    }

    /**
     * Sets the value of the infoAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfoAdicionais(JAXBElement<String> value) {
        this.infoAdicionais = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDesc() {
        return tipoDesc;
    }

    /**
     * Sets the value of the tipoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDesc(JAXBElement<String> value) {
        this.tipoDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoParticipacaoComissoes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoParticipacaoComissoes }{@code >}
     *     
     */
    public JAXBElement<TipoParticipacaoComissoes> getTipoParticipacaoComissoes() {
        return tipoParticipacaoComissoes;
    }

    /**
     * Sets the value of the tipoParticipacaoComissoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoParticipacaoComissoes }{@code >}
     *     
     */
    public void setTipoParticipacaoComissoes(JAXBElement<TipoParticipacaoComissoes> value) {
        this.tipoParticipacaoComissoes = ((JAXBElement<TipoParticipacaoComissoes> ) value);
    }

}
