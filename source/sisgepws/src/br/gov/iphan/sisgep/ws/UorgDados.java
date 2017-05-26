
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UorgDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UorgDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjLocalizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjUpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAreaAtuaUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSiorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSiorgOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUnidadeSiafi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorgPagadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorgPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorgPessoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCriacaoUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diplomaLegalCriacaoUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacaoAntecedentesUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorUorgAdministrativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorUorgDestIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorUorgPessoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorUorgRegimenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorUorgUpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAreaAtuaUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeExtendido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUorgMaiusculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UorgDados", namespace = "http://entidade.wssiapenet", propOrder = {
    "cnpjLocalizador",
    "cnpjUpag",
    "codAreaAtuaUorg",
    "codMunicipio",
    "codOrgao",
    "codSiorg",
    "codSiorgOrgao",
    "codUnidadeSiafi",
    "codUorg",
    "codUorgPagadora",
    "codUorgPai",
    "codUorgPessoal",
    "dataCriacaoUorg",
    "diplomaLegalCriacaoUorg",
    "identificacaoAntecedentesUorg",
    "indicadorUorgAdministrativa",
    "indicadorUorgDestIntegracao",
    "indicadorUorgPessoal",
    "indicadorUorgRegimenta",
    "indicadorUorgUpag",
    "nomeAreaAtuaUorg",
    "nomeExtendido",
    "nomeMunicipio",
    "nomeUorg",
    "nomeUorgMaiusculo",
    "siglaOrgao",
    "siglaUorg"
})
public class UorgDados {

    @XmlElementRef(name = "cnpjLocalizador", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cnpjLocalizador;
    @XmlElementRef(name = "cnpjUpag", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cnpjUpag;
    @XmlElementRef(name = "codAreaAtuaUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codAreaAtuaUorg;
    @XmlElementRef(name = "codMunicipio", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codMunicipio;
    @XmlElementRef(name = "codOrgao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "codSiorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codSiorg;
    @XmlElementRef(name = "codSiorgOrgao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codSiorgOrgao;
    @XmlElementRef(name = "codUnidadeSiafi", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUnidadeSiafi;
    @XmlElementRef(name = "codUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorg;
    @XmlElementRef(name = "codUorgPagadora", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorgPagadora;
    @XmlElementRef(name = "codUorgPai", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorgPai;
    @XmlElementRef(name = "codUorgPessoal", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorgPessoal;
    @XmlElementRef(name = "dataCriacaoUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataCriacaoUorg;
    @XmlElementRef(name = "diplomaLegalCriacaoUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> diplomaLegalCriacaoUorg;
    @XmlElementRef(name = "identificacaoAntecedentesUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identificacaoAntecedentesUorg;
    @XmlElementRef(name = "indicadorUorgAdministrativa", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorUorgAdministrativa;
    @XmlElementRef(name = "indicadorUorgDestIntegracao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorUorgDestIntegracao;
    @XmlElementRef(name = "indicadorUorgPessoal", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorUorgPessoal;
    @XmlElementRef(name = "indicadorUorgRegimenta", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorUorgRegimenta;
    @XmlElementRef(name = "indicadorUorgUpag", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> indicadorUorgUpag;
    @XmlElementRef(name = "nomeAreaAtuaUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeAreaAtuaUorg;
    @XmlElementRef(name = "nomeExtendido", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeExtendido;
    @XmlElementRef(name = "nomeMunicipio", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeMunicipio;
    @XmlElementRef(name = "nomeUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUorg;
    @XmlElementRef(name = "nomeUorgMaiusculo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUorgMaiusculo;
    @XmlElementRef(name = "siglaOrgao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaOrgao;
    @XmlElementRef(name = "siglaUorg", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaUorg;

    /**
     * Gets the value of the cnpjLocalizador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjLocalizador() {
        return cnpjLocalizador;
    }

    /**
     * Sets the value of the cnpjLocalizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjLocalizador(JAXBElement<String> value) {
        this.cnpjLocalizador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cnpjUpag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjUpag() {
        return cnpjUpag;
    }

    /**
     * Sets the value of the cnpjUpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjUpag(JAXBElement<String> value) {
        this.cnpjUpag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codAreaAtuaUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAreaAtuaUorg() {
        return codAreaAtuaUorg;
    }

    /**
     * Sets the value of the codAreaAtuaUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAreaAtuaUorg(JAXBElement<String> value) {
        this.codAreaAtuaUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Sets the value of the codMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMunicipio(JAXBElement<String> value) {
        this.codMunicipio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOrgao() {
        return codOrgao;
    }

    /**
     * Sets the value of the codOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOrgao(JAXBElement<String> value) {
        this.codOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codSiorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSiorg() {
        return codSiorg;
    }

    /**
     * Sets the value of the codSiorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSiorg(JAXBElement<String> value) {
        this.codSiorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codSiorgOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSiorgOrgao() {
        return codSiorgOrgao;
    }

    /**
     * Sets the value of the codSiorgOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSiorgOrgao(JAXBElement<String> value) {
        this.codSiorgOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUnidadeSiafi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUnidadeSiafi() {
        return codUnidadeSiafi;
    }

    /**
     * Sets the value of the codUnidadeSiafi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUnidadeSiafi(JAXBElement<String> value) {
        this.codUnidadeSiafi = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorg() {
        return codUorg;
    }

    /**
     * Sets the value of the codUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorg(JAXBElement<String> value) {
        this.codUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorgPagadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorgPagadora() {
        return codUorgPagadora;
    }

    /**
     * Sets the value of the codUorgPagadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorgPagadora(JAXBElement<String> value) {
        this.codUorgPagadora = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorgPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorgPai() {
        return codUorgPai;
    }

    /**
     * Sets the value of the codUorgPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorgPai(JAXBElement<String> value) {
        this.codUorgPai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorgPessoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorgPessoal() {
        return codUorgPessoal;
    }

    /**
     * Sets the value of the codUorgPessoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorgPessoal(JAXBElement<String> value) {
        this.codUorgPessoal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataCriacaoUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCriacaoUorg() {
        return dataCriacaoUorg;
    }

    /**
     * Sets the value of the dataCriacaoUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCriacaoUorg(JAXBElement<String> value) {
        this.dataCriacaoUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the diplomaLegalCriacaoUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiplomaLegalCriacaoUorg() {
        return diplomaLegalCriacaoUorg;
    }

    /**
     * Sets the value of the diplomaLegalCriacaoUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiplomaLegalCriacaoUorg(JAXBElement<String> value) {
        this.diplomaLegalCriacaoUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identificacaoAntecedentesUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacaoAntecedentesUorg() {
        return identificacaoAntecedentesUorg;
    }

    /**
     * Sets the value of the identificacaoAntecedentesUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacaoAntecedentesUorg(JAXBElement<String> value) {
        this.identificacaoAntecedentesUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorUorgAdministrativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorUorgAdministrativa() {
        return indicadorUorgAdministrativa;
    }

    /**
     * Sets the value of the indicadorUorgAdministrativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorUorgAdministrativa(JAXBElement<String> value) {
        this.indicadorUorgAdministrativa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorUorgDestIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorUorgDestIntegracao() {
        return indicadorUorgDestIntegracao;
    }

    /**
     * Sets the value of the indicadorUorgDestIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorUorgDestIntegracao(JAXBElement<String> value) {
        this.indicadorUorgDestIntegracao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorUorgPessoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorUorgPessoal() {
        return indicadorUorgPessoal;
    }

    /**
     * Sets the value of the indicadorUorgPessoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorUorgPessoal(JAXBElement<String> value) {
        this.indicadorUorgPessoal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorUorgRegimenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorUorgRegimenta() {
        return indicadorUorgRegimenta;
    }

    /**
     * Sets the value of the indicadorUorgRegimenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorUorgRegimenta(JAXBElement<String> value) {
        this.indicadorUorgRegimenta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indicadorUorgUpag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorUorgUpag() {
        return indicadorUorgUpag;
    }

    /**
     * Sets the value of the indicadorUorgUpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorUorgUpag(JAXBElement<String> value) {
        this.indicadorUorgUpag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeAreaAtuaUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAreaAtuaUorg() {
        return nomeAreaAtuaUorg;
    }

    /**
     * Sets the value of the nomeAreaAtuaUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAreaAtuaUorg(JAXBElement<String> value) {
        this.nomeAreaAtuaUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeExtendido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeExtendido() {
        return nomeExtendido;
    }

    /**
     * Sets the value of the nomeExtendido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeExtendido(JAXBElement<String> value) {
        this.nomeExtendido = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMunicipio() {
        return nomeMunicipio;
    }

    /**
     * Sets the value of the nomeMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMunicipio(JAXBElement<String> value) {
        this.nomeMunicipio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUorg() {
        return nomeUorg;
    }

    /**
     * Sets the value of the nomeUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUorg(JAXBElement<String> value) {
        this.nomeUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUorgMaiusculo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUorgMaiusculo() {
        return nomeUorgMaiusculo;
    }

    /**
     * Sets the value of the nomeUorgMaiusculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUorgMaiusculo(JAXBElement<String> value) {
        this.nomeUorgMaiusculo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaOrgao() {
        return siglaOrgao;
    }

    /**
     * Sets the value of the siglaOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaOrgao(JAXBElement<String> value) {
        this.siglaOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaUorg() {
        return siglaUorg;
    }

    /**
     * Sets the value of the siglaUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaUorg(JAXBElement<String> value) {
        this.siglaUorg = ((JAXBElement<String> ) value);
    }

}
