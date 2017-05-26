
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosRepresentanteLegal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosRepresentanteLegal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosRepresentanteLegal" type="{http://tipo.servico.wssiapenet}DadosRepresentanteLegal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosRepresentanteLegal", propOrder = {
    "dadosRepresentanteLegal"
})
public class ArrayOfDadosRepresentanteLegal {

    @XmlElement(name = "DadosRepresentanteLegal", nillable = true)
    protected List<DadosRepresentanteLegal> dadosRepresentanteLegal;

    /**
     * Gets the value of the dadosRepresentanteLegal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosRepresentanteLegal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosRepresentanteLegal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosRepresentanteLegal }
     * 
     * 
     */
    public List<DadosRepresentanteLegal> getDadosRepresentanteLegal() {
        if (dadosRepresentanteLegal == null) {
            dadosRepresentanteLegal = new ArrayList<DadosRepresentanteLegal>();
        }
        return this.dadosRepresentanteLegal;
    }

}
