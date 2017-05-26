
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosLpa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosLpa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosLpa" type="{http://tipo.servico.wssiapenet}DadosLpa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosLpa", propOrder = {
    "dadosLpa"
})
public class ArrayOfDadosLpa {

    @XmlElement(name = "DadosLpa", nillable = true)
    protected List<DadosLpa> dadosLpa;

    /**
     * Gets the value of the dadosLpa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosLpa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosLpa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosLpa }
     * 
     * 
     */
    public List<DadosLpa> getDadosLpa() {
        if (dadosLpa == null) {
            dadosLpa = new ArrayList<DadosLpa>();
        }
        return this.dadosLpa;
    }

}
