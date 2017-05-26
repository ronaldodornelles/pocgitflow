
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExperienciaProfissional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExperienciaProfissional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperienciaProfissional" type="{http://entidade.wssiapenet}ExperienciaProfissional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExperienciaProfissional", namespace = "http://entidade.wssiapenet", propOrder = {
    "experienciaProfissional"
})
public class ArrayOfExperienciaProfissional {

    @XmlElement(name = "ExperienciaProfissional", nillable = true)
    protected List<ExperienciaProfissional> experienciaProfissional;

    /**
     * Gets the value of the experienciaProfissional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experienciaProfissional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperienciaProfissional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperienciaProfissional }
     * 
     * 
     */
    public List<ExperienciaProfissional> getExperienciaProfissional() {
        if (experienciaProfissional == null) {
            experienciaProfissional = new ArrayList<ExperienciaProfissional>();
        }
        return this.experienciaProfissional;
    }

}
