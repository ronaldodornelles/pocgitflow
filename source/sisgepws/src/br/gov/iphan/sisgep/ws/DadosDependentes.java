
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosDependentes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosDependentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayBeneficios" type="{http://tipo.servico.wssiapenet}ArrayOfBeneficio" minOccurs="0"/>
 *         &lt;element name="codCondicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codGrauParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCondicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeGrauParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDependentes", propOrder = {
    "arrayBeneficios",
    "codCondicao",
    "codGrauParentesco",
    "codOrgao",
    "cpf",
    "matricula",
    "nome",
    "nomeCondicao",
    "nomeGrauParentesco"
})
public class DadosDependentes {

    @XmlElementRef(name = "arrayBeneficios", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBeneficio> arrayBeneficios;
    @XmlElementRef(name = "codCondicao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codCondicao;
    @XmlElementRef(name = "codGrauParentesco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codGrauParentesco;
    @XmlElementRef(name = "codOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "cpf", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "matricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "nome", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "nomeCondicao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeCondicao;
    @XmlElementRef(name = "nomeGrauParentesco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeGrauParentesco;

    /**
     * Gets the value of the arrayBeneficios property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBeneficio }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBeneficio> getArrayBeneficios() {
        return arrayBeneficios;
    }

    /**
     * Sets the value of the arrayBeneficios property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBeneficio }{@code >}
     *     
     */
    public void setArrayBeneficios(JAXBElement<ArrayOfBeneficio> value) {
        this.arrayBeneficios = ((JAXBElement<ArrayOfBeneficio> ) value);
    }

    /**
     * Gets the value of the codCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCondicao() {
        return codCondicao;
    }

    /**
     * Sets the value of the codCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCondicao(JAXBElement<String> value) {
        this.codCondicao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codGrauParentesco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodGrauParentesco() {
        return codGrauParentesco;
    }

    /**
     * Sets the value of the codGrauParentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodGrauParentesco(JAXBElement<String> value) {
        this.codGrauParentesco = ((JAXBElement<String> ) value);
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
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatricula(JAXBElement<String> value) {
        this.matricula = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCondicao() {
        return nomeCondicao;
    }

    /**
     * Sets the value of the nomeCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCondicao(JAXBElement<String> value) {
        this.nomeCondicao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeGrauParentesco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeGrauParentesco() {
        return nomeGrauParentesco;
    }

    /**
     * Sets the value of the nomeGrauParentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeGrauParentesco(JAXBElement<String> value) {
        this.nomeGrauParentesco = ((JAXBElement<String> ) value);
    }

}
