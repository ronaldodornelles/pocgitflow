
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPensaoRecebida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPensaoRecebida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PensaoRecebida" type="{http://tipo.servico.wssiapenet}PensaoRecebida" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPensaoRecebida", propOrder = {
    "pensaoRecebida"
})
public class ArrayOfPensaoRecebida {

    @XmlElement(name = "PensaoRecebida", nillable = true)
    protected List<PensaoRecebida> pensaoRecebida;

    /**
     * Gets the value of the pensaoRecebida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pensaoRecebida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPensaoRecebida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PensaoRecebida }
     * 
     * 
     */
    public List<PensaoRecebida> getPensaoRecebida() {
        if (pensaoRecebida == null) {
            pensaoRecebida = new ArrayList<PensaoRecebida>();
        }
        return this.pensaoRecebida;
    }

}
