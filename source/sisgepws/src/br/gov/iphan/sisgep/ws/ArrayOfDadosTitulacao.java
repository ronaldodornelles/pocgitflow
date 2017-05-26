
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosTitulacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosTitulacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosTitulacao" type="{http://tipo.servico.wssiapenet}DadosTitulacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosTitulacao", propOrder = {
    "dadosTitulacao"
})
public class ArrayOfDadosTitulacao {

    @XmlElement(name = "DadosTitulacao", nillable = true)
    protected List<DadosTitulacao> dadosTitulacao;

    /**
     * Gets the value of the dadosTitulacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosTitulacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosTitulacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosTitulacao }
     * 
     * 
     */
    public List<DadosTitulacao> getDadosTitulacao() {
        if (dadosTitulacao == null) {
            dadosTitulacao = new ArrayList<DadosTitulacao>();
        }
        return this.dadosTitulacao;
    }

}
