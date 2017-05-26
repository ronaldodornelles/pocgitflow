
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperienciaProfissional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperienciaProfissional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://entidade.wssiapenet}Area" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOrgaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAtuacao" type="{http://entidade.wssiapenet}TipoAtuacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperienciaProfissional", namespace = "http://entidade.wssiapenet", propOrder = {
    "area",
    "cargo",
    "codigo",
    "dataFim",
    "dataInicio",
    "identificUnica",
    "nomeOrgaoEmpresa",
    "projeto",
    "tipoAtuacao"
})
public class ExperienciaProfissional {

    @XmlElementRef(name = "area", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Area> area;
    @XmlElementRef(name = "cargo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cargo;
    @XmlElementRef(name = "codigo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> codigo;
    @XmlElementRef(name = "dataFim", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataFim;
    @XmlElementRef(name = "dataInicio", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataInicio;
    @XmlElementRef(name = "identificUnica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identificUnica;
    @XmlElementRef(name = "nomeOrgaoEmpresa", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOrgaoEmpresa;
    @XmlElementRef(name = "projeto", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> projeto;
    @XmlElementRef(name = "tipoAtuacao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<TipoAtuacao> tipoAtuacao;

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
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargo(JAXBElement<String> value) {
        this.cargo = ((JAXBElement<String> ) value);
    }

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
     * Gets the value of the nomeOrgaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOrgaoEmpresa() {
        return nomeOrgaoEmpresa;
    }

    /**
     * Sets the value of the nomeOrgaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOrgaoEmpresa(JAXBElement<String> value) {
        this.nomeOrgaoEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the projeto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjeto() {
        return projeto;
    }

    /**
     * Sets the value of the projeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjeto(JAXBElement<String> value) {
        this.projeto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoAtuacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoAtuacao }{@code >}
     *     
     */
    public JAXBElement<TipoAtuacao> getTipoAtuacao() {
        return tipoAtuacao;
    }

    /**
     * Sets the value of the tipoAtuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoAtuacao }{@code >}
     *     
     */
    public void setTipoAtuacao(JAXBElement<TipoAtuacao> value) {
        this.tipoAtuacao = ((JAXBElement<TipoAtuacao> ) value);
    }

}
