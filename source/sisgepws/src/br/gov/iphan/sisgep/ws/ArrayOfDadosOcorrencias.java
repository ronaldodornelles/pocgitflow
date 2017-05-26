
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosOcorrencias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosOcorrencias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosOcorrencias" type="{http://tipo.servico.wssiapenet}DadosOcorrencias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosOcorrencias", propOrder = {
    "dadosOcorrencias"
})
public class ArrayOfDadosOcorrencias {

    @XmlElement(name = "DadosOcorrencias", nillable = true)
    protected List<DadosOcorrencias> dadosOcorrencias;

    /**
     * Gets the value of the dadosOcorrencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosOcorrencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosOcorrencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosOcorrencias }
     * 
     * 
     */
    public List<DadosOcorrencias> getDadosOcorrencias() {
        if (dadosOcorrencias == null) {
            dadosOcorrencias = new ArrayList<DadosOcorrencias>();
        }
        return this.dadosOcorrencias;
    }

}
