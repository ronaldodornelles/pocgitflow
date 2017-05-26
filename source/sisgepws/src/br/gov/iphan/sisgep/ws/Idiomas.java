
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Idiomas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Idiomas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="identificUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idiomasDesc" type="{http://entidade.wssiapenet}IdiomasDesc" minOccurs="0"/>
 *         &lt;element name="idiomasEscreve" type="{http://entidade.wssiapenet}IdiomasDominio" minOccurs="0"/>
 *         &lt;element name="idiomasFala" type="{http://entidade.wssiapenet}IdiomasDominio" minOccurs="0"/>
 *         &lt;element name="idiomasLe" type="{http://entidade.wssiapenet}IdiomasDominio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Idiomas", namespace = "http://entidade.wssiapenet", propOrder = {
    "codigo",
    "identificUnica",
    "idiomasDesc",
    "idiomasEscreve",
    "idiomasFala",
    "idiomasLe"
})
public class Idiomas {

    @XmlElementRef(name = "codigo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> codigo;
    @XmlElementRef(name = "identificUnica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identificUnica;
    @XmlElementRef(name = "idiomasDesc", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<IdiomasDesc> idiomasDesc;
    @XmlElementRef(name = "idiomasEscreve", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<IdiomasDominio> idiomasEscreve;
    @XmlElementRef(name = "idiomasFala", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<IdiomasDominio> idiomasFala;
    @XmlElementRef(name = "idiomasLe", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<IdiomasDominio> idiomasLe;

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
     * Gets the value of the idiomasDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDesc }{@code >}
     *     
     */
    public JAXBElement<IdiomasDesc> getIdiomasDesc() {
        return idiomasDesc;
    }

    /**
     * Sets the value of the idiomasDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDesc }{@code >}
     *     
     */
    public void setIdiomasDesc(JAXBElement<IdiomasDesc> value) {
        this.idiomasDesc = ((JAXBElement<IdiomasDesc> ) value);
    }

    /**
     * Gets the value of the idiomasEscreve property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public JAXBElement<IdiomasDominio> getIdiomasEscreve() {
        return idiomasEscreve;
    }

    /**
     * Sets the value of the idiomasEscreve property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public void setIdiomasEscreve(JAXBElement<IdiomasDominio> value) {
        this.idiomasEscreve = ((JAXBElement<IdiomasDominio> ) value);
    }

    /**
     * Gets the value of the idiomasFala property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public JAXBElement<IdiomasDominio> getIdiomasFala() {
        return idiomasFala;
    }

    /**
     * Sets the value of the idiomasFala property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public void setIdiomasFala(JAXBElement<IdiomasDominio> value) {
        this.idiomasFala = ((JAXBElement<IdiomasDominio> ) value);
    }

    /**
     * Gets the value of the idiomasLe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public JAXBElement<IdiomasDominio> getIdiomasLe() {
        return idiomasLe;
    }

    /**
     * Sets the value of the idiomasLe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}
     *     
     */
    public void setIdiomasLe(JAXBElement<IdiomasDominio> value) {
        this.idiomasLe = ((JAXBElement<IdiomasDominio> ) value);
    }

}
