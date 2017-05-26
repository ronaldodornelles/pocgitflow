
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Curso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Curso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://entidade.wssiapenet}Area" minOccurs="0"/>
 *         &lt;element name="cargaHoraria" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codCurso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataConclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEvento" type="{http://entidade.wssiapenet}TipoEvento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curso", namespace = "http://entidade.wssiapenet", propOrder = {
    "area",
    "cargaHoraria",
    "codCurso",
    "dataConclusao",
    "instituicao",
    "nomeCurso",
    "tipoEvento"
})
public class Curso {

    @XmlElementRef(name = "area", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Area> area;
    @XmlElementRef(name = "cargaHoraria", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Short> cargaHoraria;
    @XmlElementRef(name = "codCurso", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> codCurso;
    @XmlElementRef(name = "dataConclusao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataConclusao;
    @XmlElementRef(name = "instituicao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> instituicao;
    @XmlElementRef(name = "nomeCurso", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeCurso;
    @XmlElementRef(name = "tipoEvento", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<TipoEvento> tipoEvento;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Area }{@code >}
     *     
     */
    public JAXBElement<Area> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Area }{@code >}
     *     
     */
    public void setArea(JAXBElement<Area> value) {
        this.area = ((JAXBElement<Area> ) value);
    }

    /**
     * Gets the value of the cargaHoraria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Sets the value of the cargaHoraria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCargaHoraria(JAXBElement<Short> value) {
        this.cargaHoraria = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the codCurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodCurso() {
        return codCurso;
    }

    /**
     * Sets the value of the codCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodCurso(JAXBElement<Integer> value) {
        this.codCurso = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dataConclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataConclusao() {
        return dataConclusao;
    }

    /**
     * Sets the value of the dataConclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataConclusao(JAXBElement<String> value) {
        this.dataConclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the instituicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstituicao() {
        return instituicao;
    }

    /**
     * Sets the value of the instituicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstituicao(JAXBElement<String> value) {
        this.instituicao = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoEvento }{@code >}
     *     
     */
    public JAXBElement<TipoEvento> getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoEvento }{@code >}
     *     
     */
    public void setTipoEvento(JAXBElement<TipoEvento> value) {
        this.tipoEvento = ((JAXBElement<TipoEvento> ) value);
    }

}
