
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUorg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uorg" type="{http://entidade.wssiapenet}Uorg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUorg", namespace = "http://entidade.wssiapenet", propOrder = {
    "uorg"
})
public class ArrayOfUorg {

    @XmlElement(name = "Uorg", nillable = true)
    protected List<Uorg> uorg;

    /**
     * Gets the value of the uorg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uorg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUorg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uorg }
     * 
     * 
     */
    public List<Uorg> getUorg() {
        if (uorg == null) {
            uorg = new ArrayList<Uorg>();
        }
        return this.uorg;
    }

}
