
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlimentadosPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlimentadosPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlimentadosPA" type="{http://tipo.servico.wssiapenet}AlimentadosPA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlimentadosPA", propOrder = {
    "alimentadosPA"
})
public class ArrayOfAlimentadosPA {

    @XmlElement(name = "AlimentadosPA", nillable = true)
    protected List<AlimentadosPA> alimentadosPA;

    /**
     * Gets the value of the alimentadosPA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alimentadosPA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlimentadosPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlimentadosPA }
     * 
     * 
     */
    public List<AlimentadosPA> getAlimentadosPA() {
        if (alimentadosPA == null) {
            alimentadosPA = new ArrayList<AlimentadosPA>();
        }
        return this.alimentadosPA;
    }

}
