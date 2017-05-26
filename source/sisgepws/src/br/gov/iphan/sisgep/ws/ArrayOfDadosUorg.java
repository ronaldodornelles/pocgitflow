
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosUorg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosUorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosUorg" type="{http://tipo.servico.wssiapenet}DadosUorg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosUorg", propOrder = {
    "dadosUorg"
})
public class ArrayOfDadosUorg {

    @XmlElement(name = "DadosUorg", nillable = true)
    protected List<DadosUorg> dadosUorg;

    /**
     * Gets the value of the dadosUorg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosUorg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosUorg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosUorg }
     * 
     * 
     */
    public List<DadosUorg> getDadosUorg() {
        if (dadosUorg == null) {
            dadosUorg = new ArrayList<DadosUorg>();
        }
        return this.dadosUorg;
    }

}
