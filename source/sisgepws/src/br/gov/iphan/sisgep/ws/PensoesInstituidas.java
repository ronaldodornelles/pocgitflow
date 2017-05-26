
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensoesInstituidas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PensoesInstituidas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrayFichaFinanceira" type="{http://tipo.servico.wssiapenet}ArrayFichaFinanceira" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cotaPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfPensionista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaPensionista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturezaPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePensionista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeTipoPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgaoPensionista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PensoesInstituidas", propOrder = {
    "agencia",
    "arrayFichaFinanceira",
    "banco",
    "codParentesco",
    "conta",
    "cotaPensao",
    "cpfPensionista",
    "cpfRepresentanteLegal",
    "matriculaPensionista",
    "naturezaPensao",
    "nomeParentesco",
    "nomePensionista",
    "nomeRepresentanteLegal",
    "nomeTipoPensao",
    "orgaoPensionista",
    "tipoPensao"
})
public class PensoesInstituidas {

    @XmlElementRef(name = "agencia", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> agencia;
    @XmlElementRef(name = "arrayFichaFinanceira", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<ArrayFichaFinanceira> arrayFichaFinanceira;
    @XmlElementRef(name = "banco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> banco;
    @XmlElementRef(name = "codParentesco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codParentesco;
    @XmlElementRef(name = "conta", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> conta;
    @XmlElementRef(name = "cotaPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cotaPensao;
    @XmlElementRef(name = "cpfPensionista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfPensionista;
    @XmlElementRef(name = "cpfRepresentanteLegal", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfRepresentanteLegal;
    @XmlElementRef(name = "matriculaPensionista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matriculaPensionista;
    @XmlElementRef(name = "naturezaPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> naturezaPensao;
    @XmlElementRef(name = "nomeParentesco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeParentesco;
    @XmlElementRef(name = "nomePensionista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomePensionista;
    @XmlElementRef(name = "nomeRepresentanteLegal", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeRepresentanteLegal;
    @XmlElementRef(name = "nomeTipoPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeTipoPensao;
    @XmlElementRef(name = "orgaoPensionista", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> orgaoPensionista;
    @XmlElementRef(name = "tipoPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> tipoPensao;

    /**
     * Gets the value of the agencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencia() {
        return agencia;
    }

    /**
     * Sets the value of the agencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencia(JAXBElement<String> value) {
        this.agencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the arrayFichaFinanceira property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayFichaFinanceira }{@code >}
     *     
     */
    public JAXBElement<ArrayFichaFinanceira> getArrayFichaFinanceira() {
        return arrayFichaFinanceira;
    }

    /**
     * Sets the value of the arrayFichaFinanceira property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayFichaFinanceira }{@code >}
     *     
     */
    public void setArrayFichaFinanceira(JAXBElement<ArrayFichaFinanceira> value) {
        this.arrayFichaFinanceira = ((JAXBElement<ArrayFichaFinanceira> ) value);
    }

    /**
     * Gets the value of the banco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBanco() {
        return banco;
    }

    /**
     * Sets the value of the banco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBanco(JAXBElement<String> value) {
        this.banco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codParentesco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodParentesco() {
        return codParentesco;
    }

    /**
     * Sets the value of the codParentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodParentesco(JAXBElement<String> value) {
        this.codParentesco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConta(JAXBElement<String> value) {
        this.conta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cotaPensao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCotaPensao() {
        return cotaPensao;
    }

    /**
     * Sets the value of the cotaPensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCotaPensao(JAXBElement<String> value) {
        this.cotaPensao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpfPensionista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfPensionista() {
        return cpfPensionista;
    }

    /**
     * Sets the value of the cpfPensionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfPensionista(JAXBElement<String> value) {
        this.cpfPensionista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpfRepresentanteLegal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfRepresentanteLegal() {
        return cpfRepresentanteLegal;
    }

    /**
     * Sets the value of the cpfRepresentanteLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfRepresentanteLegal(JAXBElement<String> value) {
        this.cpfRepresentanteLegal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matriculaPensionista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatriculaPensionista() {
        return matriculaPensionista;
    }

    /**
     * Sets the value of the matriculaPensionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatriculaPensionista(JAXBElement<String> value) {
        this.matriculaPensionista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the naturezaPensao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaturezaPensao() {
        return naturezaPensao;
    }

    /**
     * Sets the value of the naturezaPensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaturezaPensao(JAXBElement<String> value) {
        this.naturezaPensao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeParentesco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeParentesco() {
        return nomeParentesco;
    }

    /**
     * Sets the value of the nomeParentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeParentesco(JAXBElement<String> value) {
        this.nomeParentesco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomePensionista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePensionista() {
        return nomePensionista;
    }

    /**
     * Sets the value of the nomePensionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePensionista(JAXBElement<String> value) {
        this.nomePensionista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeRepresentanteLegal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeRepresentanteLegal() {
        return nomeRepresentanteLegal;
    }

    /**
     * Sets the value of the nomeRepresentanteLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeRepresentanteLegal(JAXBElement<String> value) {
        this.nomeRepresentanteLegal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeTipoPensao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeTipoPensao() {
        return nomeTipoPensao;
    }

    /**
     * Sets the value of the nomeTipoPensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeTipoPensao(JAXBElement<String> value) {
        this.nomeTipoPensao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgaoPensionista property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaoPensionista() {
        return orgaoPensionista;
    }

    /**
     * Sets the value of the orgaoPensionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaoPensionista(JAXBElement<String> value) {
        this.orgaoPensionista = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoPensao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPensao() {
        return tipoPensao;
    }

    /**
     * Sets the value of the tipoPensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPensao(JAXBElement<String> value) {
        this.tipoPensao = ((JAXBElement<String> ) value);
    }

}
