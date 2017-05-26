
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosFinanceiros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosFinanceiros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosFinanceiros" type="{http://tipo.servico.wssiapenet}DadosFinanceiros" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosFinanceiros", propOrder = {
    "dadosFinanceiros"
})
public class ArrayOfDadosFinanceiros {

    @XmlElement(name = "DadosFinanceiros", nillable = true)
    protected List<DadosFinanceiros> dadosFinanceiros;

    /**
     * Gets the value of the dadosFinanceiros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosFinanceiros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosFinanceiros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosFinanceiros }
     * 
     * 
     */
    public List<DadosFinanceiros> getDadosFinanceiros() {
        if (dadosFinanceiros == null) {
            dadosFinanceiros = new ArrayList<DadosFinanceiros>();
        }
        return this.dadosFinanceiros;
    }

}
