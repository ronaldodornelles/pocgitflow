
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCurriculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCurriculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificUnica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listaCurso" type="{http://entidade.wssiapenet}ArrayOfCurso" minOccurs="0"/>
 *         &lt;element name="listaExperienciaProfissional" type="{http://entidade.wssiapenet}ArrayOfExperienciaProfissional" minOccurs="0"/>
 *         &lt;element name="listaFormacaoAcademica" type="{http://entidade.wssiapenet}ArrayOfFormacaoAcademica" minOccurs="0"/>
 *         &lt;element name="listaIdiomas" type="{http://entidade.wssiapenet}ArrayOfIdiomas" minOccurs="0"/>
 *         &lt;element name="listaParticipacaoComissoes" type="{http://entidade.wssiapenet}ArrayOfParticipacaoComissoes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCurriculo", namespace = "http://entidade.wssiapenet", propOrder = {
    "cpf",
    "identificUnica",
    "listaCurso",
    "listaExperienciaProfissional",
    "listaFormacaoAcademica",
    "listaIdiomas",
    "listaParticipacaoComissoes"
})
public class DadosCurriculo {

    @XmlElementRef(name = "cpf", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "identificUnica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<Integer> identificUnica;
    @XmlElementRef(name = "listaCurso", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCurso> listaCurso;
    @XmlElementRef(name = "listaExperienciaProfissional", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfExperienciaProfissional> listaExperienciaProfissional;
    @XmlElementRef(name = "listaFormacaoAcademica", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFormacaoAcademica> listaFormacaoAcademica;
    @XmlElementRef(name = "listaIdiomas", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIdiomas> listaIdiomas;
    @XmlElementRef(name = "listaParticipacaoComissoes", namespace = "http://entidade.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfParticipacaoComissoes> listaParticipacaoComissoes;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpf(JAXBElement<String> value) {
        this.cpf = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identificUnica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdentificUnica() {
        return identificUnica;
    }

    /**
     * Sets the value of the identificUnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdentificUnica(JAXBElement<Integer> value) {
        this.identificUnica = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the listaCurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurso }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCurso> getListaCurso() {
        return listaCurso;
    }

    /**
     * Sets the value of the listaCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurso }{@code >}
     *     
     */
    public void setListaCurso(JAXBElement<ArrayOfCurso> value) {
        this.listaCurso = ((JAXBElement<ArrayOfCurso> ) value);
    }

    /**
     * Gets the value of the listaExperienciaProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExperienciaProfissional }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExperienciaProfissional> getListaExperienciaProfissional() {
        return listaExperienciaProfissional;
    }

    /**
     * Sets the value of the listaExperienciaProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExperienciaProfissional }{@code >}
     *     
     */
    public void setListaExperienciaProfissional(JAXBElement<ArrayOfExperienciaProfissional> value) {
        this.listaExperienciaProfissional = ((JAXBElement<ArrayOfExperienciaProfissional> ) value);
    }

    /**
     * Gets the value of the listaFormacaoAcademica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormacaoAcademica }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFormacaoAcademica> getListaFormacaoAcademica() {
        return listaFormacaoAcademica;
    }

    /**
     * Sets the value of the listaFormacaoAcademica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormacaoAcademica }{@code >}
     *     
     */
    public void setListaFormacaoAcademica(JAXBElement<ArrayOfFormacaoAcademica> value) {
        this.listaFormacaoAcademica = ((JAXBElement<ArrayOfFormacaoAcademica> ) value);
    }

    /**
     * Gets the value of the listaIdiomas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdiomas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIdiomas> getListaIdiomas() {
        return listaIdiomas;
    }

    /**
     * Sets the value of the listaIdiomas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdiomas }{@code >}
     *     
     */
    public void setListaIdiomas(JAXBElement<ArrayOfIdiomas> value) {
        this.listaIdiomas = ((JAXBElement<ArrayOfIdiomas> ) value);
    }

    /**
     * Gets the value of the listaParticipacaoComissoes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipacaoComissoes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParticipacaoComissoes> getListaParticipacaoComissoes() {
        return listaParticipacaoComissoes;
    }

    /**
     * Sets the value of the listaParticipacaoComissoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipacaoComissoes }{@code >}
     *     
     */
    public void setListaParticipacaoComissoes(JAXBElement<ArrayOfParticipacaoComissoes> value) {
        this.listaParticipacaoComissoes = ((JAXBElement<ArrayOfParticipacaoComissoes> ) value);
    }

}
