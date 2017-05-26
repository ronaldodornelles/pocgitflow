
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFichaFinaceiraBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFichaFinaceiraBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FichaFinaceiraBeneficiario" type="{http://tipo.servico.wssiapenet}FichaFinaceiraBeneficiario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFichaFinaceiraBeneficiario", propOrder = {
    "fichaFinaceiraBeneficiario"
})
public class ArrayOfFichaFinaceiraBeneficiario {

    @XmlElement(name = "FichaFinaceiraBeneficiario", nillable = true)
    protected List<FichaFinaceiraBeneficiario> fichaFinaceiraBeneficiario;

    /**
     * Gets the value of the fichaFinaceiraBeneficiario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fichaFinaceiraBeneficiario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFichaFinaceiraBeneficiario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FichaFinaceiraBeneficiario }
     * 
     * 
     */
    public List<FichaFinaceiraBeneficiario> getFichaFinaceiraBeneficiario() {
        if (fichaFinaceiraBeneficiario == null) {
            fichaFinaceiraBeneficiario = new ArrayList<FichaFinaceiraBeneficiario>();
        }
        return this.fichaFinaceiraBeneficiario;
    }

}
