
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormacaoAcademica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormacaoAcademica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://entidade.wssiapenet}Curso" minOccurs="0"/>
 *         &lt;element name="dataConclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelEscolaridade" type="{http://entidade.wssiapenet}NivelEscolaridade" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://entidade.wssiapenet}Situacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormacaoAcademica", namespace = "http://entidade.wssiapenet", propOrder = {
    "codigo",
    "curso",
    "dataConclusao",
    "identificUnica",
    "instituicao",
    "nivelEscolaridade",
    "situacao"
})
public class FormacaoAcademica {

    @XmlElementRef(name = "codigo", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> codigo;
    @XmlElementRef(name = "curso", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Curso> curso;
    @XmlElementRef(name = "dataConclusao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataConclusao;
    @XmlElementRef(name = "identificUnica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identificUnica;
    @XmlElementRef(name = "instituicao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> instituicao;
    @XmlElementRef(name = "nivelEscolaridade", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<NivelEscolaridade> nivelEscolaridade;
    @XmlElementRef(name = "situacao", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Situacao> situacao;

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
     * Gets the value of the curso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Curso }{@code >}
     *     
     */
    public JAXBElement<Curso> getCurso() {
        return curso;
    }

    /**
     * Sets the value of the curso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Curso }{@code >}
     *     
     */
    public void setCurso(JAXBElement<Curso> value) {
        this.curso = ((JAXBElement<Curso> ) value);
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
     * Gets the value of the nivelEscolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NivelEscolaridade }{@code >}
     *     
     */
    public JAXBElement<NivelEscolaridade> getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    /**
     * Sets the value of the nivelEscolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NivelEscolaridade }{@code >}
     *     
     */
    public void setNivelEscolaridade(JAXBElement<NivelEscolaridade> value) {
        this.nivelEscolaridade = ((JAXBElement<NivelEscolaridade> ) value);
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Situacao }{@code >}
     *     
     */
    public JAXBElement<Situacao> getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Situacao }{@code >}
     *     
     */
    public void setSituacao(JAXBElement<Situacao> value) {
        this.situacao = ((JAXBElement<Situacao> ) value);
    }

}
