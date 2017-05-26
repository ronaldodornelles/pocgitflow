
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosFuncionais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosFuncionais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAtivFun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codClasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codJornada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codNovaFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrAposentadoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrExclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrIngressoOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrIngressoServPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrIsencaoIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOcorrPSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPadrao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSitFuncional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorgExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUorgLotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codValeTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfChefiaImediata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFimOcorrIsencaoIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFimOcorrPSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFimValeAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIngressoFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIngressoNovaFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIniOcorrIsencaoIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIniOcorrPSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIniValeAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrAposentadoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrExclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrIngressoOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataOcorrIngressoServPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailChefiaImediata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailServidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaSiape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAtivFun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeChefeUorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeClasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeJornada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeNovaFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrAposentadoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrExclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrIngressoOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrIngressoServPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrIsencaoIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOcorrPSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRegimeJuridico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeSitFuncional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUorgExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUorgLotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentualTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontuacaoDesempenho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaRegimeJuridico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUorgExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUorgLotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaUpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoValeAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorValeTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosFuncionais", propOrder = {
    "codAtivFun",
    "codCargo",
    "codClasse",
    "codFuncao",
    "codJornada",
    "codNovaFuncao",
    "codOcorrAposentadoria",
    "codOcorrExclusao",
    "codOcorrIngressoOrgao",
    "codOcorrIngressoServPublico",
    "codOcorrIsencaoIR",
    "codOcorrPSS",
    "codOrgao",
    "codPadrao",
    "codSitFuncional",
    "codUorgExercicio",
    "codUorgLotacao",
    "codUpag",
    "codValeTransporte",
    "cpfChefiaImediata",
    "dataFimOcorrIsencaoIR",
    "dataFimOcorrPSS",
    "dataFimValeAR",
    "dataIngressoFuncao",
    "dataIngressoNovaFuncao",
    "dataIniOcorrIsencaoIR",
    "dataIniOcorrPSS",
    "dataIniValeAR",
    "dataOcorrAposentadoria",
    "dataOcorrExclusao",
    "dataOcorrIngressoOrgao",
    "dataOcorrIngressoServPublico",
    "emailChefiaImediata",
    "emailServidor",
    "identUnica",
    "matriculaSiape",
    "nomeAtivFun",
    "nomeCargo",
    "nomeChefeUorg",
    "nomeClasse",
    "nomeFuncao",
    "nomeJornada",
    "nomeNovaFuncao",
    "nomeOcorrAposentadoria",
    "nomeOcorrExclusao",
    "nomeOcorrIngressoOrgao",
    "nomeOcorrIngressoServPublico",
    "nomeOcorrIsencaoIR",
    "nomeOcorrPSS",
    "nomeOrgao",
    "nomeRegimeJuridico",
    "nomeSitFuncional",
    "nomeUorgExercicio",
    "nomeUorgLotacao",
    "nomeUpag",
    "percentualTS",
    "pontuacaoDesempenho",
    "siglaOrgao",
    "siglaRegimeJuridico",
    "siglaUorgExercicio",
    "siglaUorgLotacao",
    "siglaUpag",
    "tipoValeAR",
    "valorValeTransporte"
})
public class DadosFuncionais {

    @XmlElementRef(name = "codAtivFun", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codAtivFun;
    @XmlElementRef(name = "codCargo", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codCargo;
    @XmlElementRef(name = "codClasse", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codClasse;
    @XmlElementRef(name = "codFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codFuncao;
    @XmlElementRef(name = "codJornada", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codJornada;
    @XmlElementRef(name = "codNovaFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codNovaFuncao;
    @XmlElementRef(name = "codOcorrAposentadoria", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrAposentadoria;
    @XmlElementRef(name = "codOcorrExclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrExclusao;
    @XmlElementRef(name = "codOcorrIngressoOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrIngressoOrgao;
    @XmlElementRef(name = "codOcorrIngressoServPublico", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrIngressoServPublico;
    @XmlElementRef(name = "codOcorrIsencaoIR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrIsencaoIR;
    @XmlElementRef(name = "codOcorrPSS", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOcorrPSS;
    @XmlElementRef(name = "codOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codOrgao;
    @XmlElementRef(name = "codPadrao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codPadrao;
    @XmlElementRef(name = "codSitFuncional", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codSitFuncional;
    @XmlElementRef(name = "codUorgExercicio", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorgExercicio;
    @XmlElementRef(name = "codUorgLotacao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUorgLotacao;
    @XmlElementRef(name = "codUpag", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codUpag;
    @XmlElementRef(name = "codValeTransporte", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> codValeTransporte;
    @XmlElementRef(name = "cpfChefiaImediata", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> cpfChefiaImediata;
    @XmlElementRef(name = "dataFimOcorrIsencaoIR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataFimOcorrIsencaoIR;
    @XmlElementRef(name = "dataFimOcorrPSS", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataFimOcorrPSS;
    @XmlElementRef(name = "dataFimValeAR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataFimValeAR;
    @XmlElementRef(name = "dataIngressoFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataIngressoFuncao;
    @XmlElementRef(name = "dataIngressoNovaFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataIngressoNovaFuncao;
    @XmlElementRef(name = "dataIniOcorrIsencaoIR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataIniOcorrIsencaoIR;
    @XmlElementRef(name = "dataIniOcorrPSS", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataIniOcorrPSS;
    @XmlElementRef(name = "dataIniValeAR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataIniValeAR;
    @XmlElementRef(name = "dataOcorrAposentadoria", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataOcorrAposentadoria;
    @XmlElementRef(name = "dataOcorrExclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataOcorrExclusao;
    @XmlElementRef(name = "dataOcorrIngressoOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataOcorrIngressoOrgao;
    @XmlElementRef(name = "dataOcorrIngressoServPublico", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> dataOcorrIngressoServPublico;
    @XmlElementRef(name = "emailChefiaImediata", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> emailChefiaImediata;
    @XmlElementRef(name = "emailServidor", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> emailServidor;
    @XmlElementRef(name = "identUnica", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> identUnica;
    @XmlElementRef(name = "matriculaSiape", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> matriculaSiape;
    @XmlElementRef(name = "nomeAtivFun", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeAtivFun;
    @XmlElementRef(name = "nomeCargo", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeCargo;
    @XmlElementRef(name = "nomeChefeUorg", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeChefeUorg;
    @XmlElementRef(name = "nomeClasse", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeClasse;
    @XmlElementRef(name = "nomeFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeFuncao;
    @XmlElementRef(name = "nomeJornada", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeJornada;
    @XmlElementRef(name = "nomeNovaFuncao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeNovaFuncao;
    @XmlElementRef(name = "nomeOcorrAposentadoria", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrAposentadoria;
    @XmlElementRef(name = "nomeOcorrExclusao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrExclusao;
    @XmlElementRef(name = "nomeOcorrIngressoOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrIngressoOrgao;
    @XmlElementRef(name = "nomeOcorrIngressoServPublico", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrIngressoServPublico;
    @XmlElementRef(name = "nomeOcorrIsencaoIR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrIsencaoIR;
    @XmlElementRef(name = "nomeOcorrPSS", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOcorrPSS;
    @XmlElementRef(name = "nomeOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeOrgao;
    @XmlElementRef(name = "nomeRegimeJuridico", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeRegimeJuridico;
    @XmlElementRef(name = "nomeSitFuncional", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeSitFuncional;
    @XmlElementRef(name = "nomeUorgExercicio", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUorgExercicio;
    @XmlElementRef(name = "nomeUorgLotacao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUorgLotacao;
    @XmlElementRef(name = "nomeUpag", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> nomeUpag;
    @XmlElementRef(name = "percentualTS", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> percentualTS;
    @XmlElementRef(name = "pontuacaoDesempenho", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> pontuacaoDesempenho;
    @XmlElementRef(name = "siglaOrgao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaOrgao;
    @XmlElementRef(name = "siglaRegimeJuridico", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaRegimeJuridico;
    @XmlElementRef(name = "siglaUorgExercicio", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaUorgExercicio;
    @XmlElementRef(name = "siglaUorgLotacao", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaUorgLotacao;
    @XmlElementRef(name = "siglaUpag", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> siglaUpag;
    @XmlElementRef(name = "tipoValeAR", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> tipoValeAR;
    @XmlElementRef(name = "valorValeTransporte", namespace = "http://tipo.servico.wssiapenet", type = JAXBElement.class)
    protected JAXBElement<String> valorValeTransporte;

    /**
     * Gets the value of the codAtivFun property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAtivFun() {
        return codAtivFun;
    }

    /**
     * Sets the value of the codAtivFun property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAtivFun(JAXBElement<String> value) {
        this.codAtivFun = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCargo() {
        return codCargo;
    }

    /**
     * Sets the value of the codCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCargo(JAXBElement<String> value) {
        this.codCargo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codClasse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodClasse() {
        return codClasse;
    }

    /**
     * Sets the value of the codClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodClasse(JAXBElement<String> value) {
        this.codClasse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFuncao() {
        return codFuncao;
    }

    /**
     * Sets the value of the codFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFuncao(JAXBElement<String> value) {
        this.codFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codJornada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodJornada() {
        return codJornada;
    }

    /**
     * Sets the value of the codJornada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodJornada(JAXBElement<String> value) {
        this.codJornada = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codNovaFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodNovaFuncao() {
        return codNovaFuncao;
    }

    /**
     * Sets the value of the codNovaFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodNovaFuncao(JAXBElement<String> value) {
        this.codNovaFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrAposentadoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrAposentadoria() {
        return codOcorrAposentadoria;
    }

    /**
     * Sets the value of the codOcorrAposentadoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrAposentadoria(JAXBElement<String> value) {
        this.codOcorrAposentadoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrExclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrExclusao() {
        return codOcorrExclusao;
    }

    /**
     * Sets the value of the codOcorrExclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrExclusao(JAXBElement<String> value) {
        this.codOcorrExclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrIngressoOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrIngressoOrgao() {
        return codOcorrIngressoOrgao;
    }

    /**
     * Sets the value of the codOcorrIngressoOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrIngressoOrgao(JAXBElement<String> value) {
        this.codOcorrIngressoOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrIngressoServPublico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrIngressoServPublico() {
        return codOcorrIngressoServPublico;
    }

    /**
     * Sets the value of the codOcorrIngressoServPublico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrIngressoServPublico(JAXBElement<String> value) {
        this.codOcorrIngressoServPublico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrIsencaoIR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrIsencaoIR() {
        return codOcorrIsencaoIR;
    }

    /**
     * Sets the value of the codOcorrIsencaoIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrIsencaoIR(JAXBElement<String> value) {
        this.codOcorrIsencaoIR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codOcorrPSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOcorrPSS() {
        return codOcorrPSS;
    }

    /**
     * Sets the value of the codOcorrPSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOcorrPSS(JAXBElement<String> value) {
        this.codOcorrPSS = ((JAXBElement<String> ) value);
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
     * Gets the value of the codPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPadrao() {
        return codPadrao;
    }

    /**
     * Sets the value of the codPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPadrao(JAXBElement<String> value) {
        this.codPadrao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codSitFuncional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSitFuncional() {
        return codSitFuncional;
    }

    /**
     * Sets the value of the codSitFuncional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSitFuncional(JAXBElement<String> value) {
        this.codSitFuncional = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorgExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorgExercicio() {
        return codUorgExercicio;
    }

    /**
     * Sets the value of the codUorgExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorgExercicio(JAXBElement<String> value) {
        this.codUorgExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUorgLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUorgLotacao() {
        return codUorgLotacao;
    }

    /**
     * Sets the value of the codUorgLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUorgLotacao(JAXBElement<String> value) {
        this.codUorgLotacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codUpag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodUpag() {
        return codUpag;
    }

    /**
     * Sets the value of the codUpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodUpag(JAXBElement<String> value) {
        this.codUpag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codValeTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodValeTransporte() {
        return codValeTransporte;
    }

    /**
     * Sets the value of the codValeTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodValeTransporte(JAXBElement<String> value) {
        this.codValeTransporte = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpfChefiaImediata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfChefiaImediata() {
        return cpfChefiaImediata;
    }

    /**
     * Sets the value of the cpfChefiaImediata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfChefiaImediata(JAXBElement<String> value) {
        this.cpfChefiaImediata = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataFimOcorrIsencaoIR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFimOcorrIsencaoIR() {
        return dataFimOcorrIsencaoIR;
    }

    /**
     * Sets the value of the dataFimOcorrIsencaoIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFimOcorrIsencaoIR(JAXBElement<String> value) {
        this.dataFimOcorrIsencaoIR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataFimOcorrPSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFimOcorrPSS() {
        return dataFimOcorrPSS;
    }

    /**
     * Sets the value of the dataFimOcorrPSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFimOcorrPSS(JAXBElement<String> value) {
        this.dataFimOcorrPSS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataFimValeAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFimValeAR() {
        return dataFimValeAR;
    }

    /**
     * Sets the value of the dataFimValeAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFimValeAR(JAXBElement<String> value) {
        this.dataFimValeAR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataIngressoFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIngressoFuncao() {
        return dataIngressoFuncao;
    }

    /**
     * Sets the value of the dataIngressoFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIngressoFuncao(JAXBElement<String> value) {
        this.dataIngressoFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataIngressoNovaFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIngressoNovaFuncao() {
        return dataIngressoNovaFuncao;
    }

    /**
     * Sets the value of the dataIngressoNovaFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIngressoNovaFuncao(JAXBElement<String> value) {
        this.dataIngressoNovaFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataIniOcorrIsencaoIR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIniOcorrIsencaoIR() {
        return dataIniOcorrIsencaoIR;
    }

    /**
     * Sets the value of the dataIniOcorrIsencaoIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIniOcorrIsencaoIR(JAXBElement<String> value) {
        this.dataIniOcorrIsencaoIR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataIniOcorrPSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIniOcorrPSS() {
        return dataIniOcorrPSS;
    }

    /**
     * Sets the value of the dataIniOcorrPSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIniOcorrPSS(JAXBElement<String> value) {
        this.dataIniOcorrPSS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataIniValeAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIniValeAR() {
        return dataIniValeAR;
    }

    /**
     * Sets the value of the dataIniValeAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIniValeAR(JAXBElement<String> value) {
        this.dataIniValeAR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataOcorrAposentadoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOcorrAposentadoria() {
        return dataOcorrAposentadoria;
    }

    /**
     * Sets the value of the dataOcorrAposentadoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOcorrAposentadoria(JAXBElement<String> value) {
        this.dataOcorrAposentadoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataOcorrExclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOcorrExclusao() {
        return dataOcorrExclusao;
    }

    /**
     * Sets the value of the dataOcorrExclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOcorrExclusao(JAXBElement<String> value) {
        this.dataOcorrExclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataOcorrIngressoOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOcorrIngressoOrgao() {
        return dataOcorrIngressoOrgao;
    }

    /**
     * Sets the value of the dataOcorrIngressoOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOcorrIngressoOrgao(JAXBElement<String> value) {
        this.dataOcorrIngressoOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataOcorrIngressoServPublico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOcorrIngressoServPublico() {
        return dataOcorrIngressoServPublico;
    }

    /**
     * Sets the value of the dataOcorrIngressoServPublico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOcorrIngressoServPublico(JAXBElement<String> value) {
        this.dataOcorrIngressoServPublico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailChefiaImediata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailChefiaImediata() {
        return emailChefiaImediata;
    }

    /**
     * Sets the value of the emailChefiaImediata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailChefiaImediata(JAXBElement<String> value) {
        this.emailChefiaImediata = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailServidor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailServidor() {
        return emailServidor;
    }

    /**
     * Sets the value of the emailServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailServidor(JAXBElement<String> value) {
        this.emailServidor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identUnica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentUnica() {
        return identUnica;
    }

    /**
     * Sets the value of the identUnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentUnica(JAXBElement<String> value) {
        this.identUnica = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matriculaSiape property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatriculaSiape() {
        return matriculaSiape;
    }

    /**
     * Sets the value of the matriculaSiape property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatriculaSiape(JAXBElement<String> value) {
        this.matriculaSiape = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeAtivFun property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAtivFun() {
        return nomeAtivFun;
    }

    /**
     * Sets the value of the nomeAtivFun property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAtivFun(JAXBElement<String> value) {
        this.nomeAtivFun = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCargo() {
        return nomeCargo;
    }

    /**
     * Sets the value of the nomeCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCargo(JAXBElement<String> value) {
        this.nomeCargo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeChefeUorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeChefeUorg() {
        return nomeChefeUorg;
    }

    /**
     * Sets the value of the nomeChefeUorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeChefeUorg(JAXBElement<String> value) {
        this.nomeChefeUorg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeClasse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeClasse() {
        return nomeClasse;
    }

    /**
     * Sets the value of the nomeClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeClasse(JAXBElement<String> value) {
        this.nomeClasse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeFuncao() {
        return nomeFuncao;
    }

    /**
     * Sets the value of the nomeFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeFuncao(JAXBElement<String> value) {
        this.nomeFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeJornada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeJornada() {
        return nomeJornada;
    }

    /**
     * Sets the value of the nomeJornada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeJornada(JAXBElement<String> value) {
        this.nomeJornada = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeNovaFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeNovaFuncao() {
        return nomeNovaFuncao;
    }

    /**
     * Sets the value of the nomeNovaFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeNovaFuncao(JAXBElement<String> value) {
        this.nomeNovaFuncao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrAposentadoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrAposentadoria() {
        return nomeOcorrAposentadoria;
    }

    /**
     * Sets the value of the nomeOcorrAposentadoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrAposentadoria(JAXBElement<String> value) {
        this.nomeOcorrAposentadoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrExclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrExclusao() {
        return nomeOcorrExclusao;
    }

    /**
     * Sets the value of the nomeOcorrExclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrExclusao(JAXBElement<String> value) {
        this.nomeOcorrExclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrIngressoOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrIngressoOrgao() {
        return nomeOcorrIngressoOrgao;
    }

    /**
     * Sets the value of the nomeOcorrIngressoOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrIngressoOrgao(JAXBElement<String> value) {
        this.nomeOcorrIngressoOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrIngressoServPublico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrIngressoServPublico() {
        return nomeOcorrIngressoServPublico;
    }

    /**
     * Sets the value of the nomeOcorrIngressoServPublico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrIngressoServPublico(JAXBElement<String> value) {
        this.nomeOcorrIngressoServPublico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrIsencaoIR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrIsencaoIR() {
        return nomeOcorrIsencaoIR;
    }

    /**
     * Sets the value of the nomeOcorrIsencaoIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrIsencaoIR(JAXBElement<String> value) {
        this.nomeOcorrIsencaoIR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOcorrPSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOcorrPSS() {
        return nomeOcorrPSS;
    }

    /**
     * Sets the value of the nomeOcorrPSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOcorrPSS(JAXBElement<String> value) {
        this.nomeOcorrPSS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeOrgao() {
        return nomeOrgao;
    }

    /**
     * Sets the value of the nomeOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeOrgao(JAXBElement<String> value) {
        this.nomeOrgao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeRegimeJuridico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeRegimeJuridico() {
        return nomeRegimeJuridico;
    }

    /**
     * Sets the value of the nomeRegimeJuridico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeRegimeJuridico(JAXBElement<String> value) {
        this.nomeRegimeJuridico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeSitFuncional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeSitFuncional() {
        return nomeSitFuncional;
    }

    /**
     * Sets the value of the nomeSitFuncional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeSitFuncional(JAXBElement<String> value) {
        this.nomeSitFuncional = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUorgExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUorgExercicio() {
        return nomeUorgExercicio;
    }

    /**
     * Sets the value of the nomeUorgExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUorgExercicio(JAXBElement<String> value) {
        this.nomeUorgExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUorgLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUorgLotacao() {
        return nomeUorgLotacao;
    }

    /**
     * Sets the value of the nomeUorgLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUorgLotacao(JAXBElement<String> value) {
        this.nomeUorgLotacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeUpag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeUpag() {
        return nomeUpag;
    }

    /**
     * Sets the value of the nomeUpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeUpag(JAXBElement<String> value) {
        this.nomeUpag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the percentualTS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPercentualTS() {
        return percentualTS;
    }

    /**
     * Sets the value of the percentualTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPercentualTS(JAXBElement<String> value) {
        this.percentualTS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pontuacaoDesempenho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPontuacaoDesempenho() {
        return pontuacaoDesempenho;
    }

    /**
     * Sets the value of the pontuacaoDesempenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPontuacaoDesempenho(JAXBElement<String> value) {
        this.pontuacaoDesempenho = ((JAXBElement<String> ) value);
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
     * Gets the value of the siglaRegimeJuridico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaRegimeJuridico() {
        return siglaRegimeJuridico;
    }

    /**
     * Sets the value of the siglaRegimeJuridico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaRegimeJuridico(JAXBElement<String> value) {
        this.siglaRegimeJuridico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaUorgExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaUorgExercicio() {
        return siglaUorgExercicio;
    }

    /**
     * Sets the value of the siglaUorgExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaUorgExercicio(JAXBElement<String> value) {
        this.siglaUorgExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaUorgLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaUorgLotacao() {
        return siglaUorgLotacao;
    }

    /**
     * Sets the value of the siglaUorgLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaUorgLotacao(JAXBElement<String> value) {
        this.siglaUorgLotacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siglaUpag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaUpag() {
        return siglaUpag;
    }

    /**
     * Sets the value of the siglaUpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaUpag(JAXBElement<String> value) {
        this.siglaUpag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoValeAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoValeAR() {
        return tipoValeAR;
    }

    /**
     * Sets the value of the tipoValeAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoValeAR(JAXBElement<String> value) {
        this.tipoValeAR = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the valorValeTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValorValeTransporte() {
        return valorValeTransporte;
    }

    /**
     * Sets the value of the valorValeTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValorValeTransporte(JAXBElement<String> value) {
        this.valorValeTransporte = ((JAXBElement<String> ) value);
    }

}
