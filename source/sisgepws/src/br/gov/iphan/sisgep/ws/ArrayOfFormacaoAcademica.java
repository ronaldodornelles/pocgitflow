
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFormacaoAcademica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFormacaoAcademica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormacaoAcademica" type="{http://entidade.wssiapenet}FormacaoAcademica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFormacaoAcademica", namespace = "http://entidade.wssiapenet", propOrder = {
    "formacaoAcademica"
})
public class ArrayOfFormacaoAcademica {

    @XmlElement(name = "FormacaoAcademica", nillable = true)
    protected List<FormacaoAcademica> formacaoAcademica;

    /**
     * Gets the value of the formacaoAcademica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formacaoAcademica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormacaoAcademica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormacaoAcademica }
     * 
     * 
     */
    public List<FormacaoAcademica> getFormacaoAcademica() {
        if (formacaoAcademica == null) {
            formacaoAcademica = new ArrayList<FormacaoAcademica>();
        }
        return this.formacaoAcademica;
    }

}
