
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensaoRecebida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PensaoRecebida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrayFichaFinanceira" type="{http://tipo.servico.wssiapenet}ArrayFichaFinanceira" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cotaPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfIntituidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturezaPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeInstituidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeTipoPensao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PensaoRecebida", propOrder = {
    "agencia",
    "arrayFichaFinanceira",
    "banco",
    "codParentesco",
    "conta",
    "cotaPensao",
    "cpfIntituidor",
    "cpfRepresentanteLegal",
    "matricula",
    "naturezaPensao",
    "nomeInstituidor",
    "nomeParentesco",
    "nomeRepresentanteLegal",
    "nomeTipoPensao",
    "orgao",
    "tipoPensao"
})
public class PensaoRecebida {

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
    @XmlElementRef(name = "cpfIntituidor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfIntituidor;
    @XmlElementRef(name = "cpfRepresentanteLegal", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfRepresentanteLegal;
    @XmlElementRef(name = "matricula", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "naturezaPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> naturezaPensao;
    @XmlElementRef(name = "nomeInstituidor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeInstituidor;
    @XmlElementRef(name = "nomeParentesco", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeParentesco;
    @XmlElementRef(name = "nomeRepresentanteLegal", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeRepresentanteLegal;
    @XmlElementRef(name = "nomeTipoPensao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeTipoPensao;
    @XmlElementRef(name = "orgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> orgao;
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
     * Gets the value of the cpfIntituidor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfIntituidor() {
        return cpfIntituidor;
    }

    /**
     * Sets the value of the cpfIntituidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfIntituidor(JAXBElement<String> value) {
        this.cpfIntituidor = ((JAXBElement<String> ) value);
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
     * Gets the value of the nomeInstituidor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeInstituidor() {
        return nomeInstituidor;
    }

    /**
     * Sets the value of the nomeInstituidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeInstituidor(JAXBElement<String> value) {
        this.nomeInstituidor = ((JAXBElement<String> ) value);
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
     * Gets the value of the orgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgao() {
        return orgao;
    }

    /**
     * Sets the value of the orgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgao(JAXBElement<String> value) {
        this.orgao = ((JAXBElement<String> ) value);
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
