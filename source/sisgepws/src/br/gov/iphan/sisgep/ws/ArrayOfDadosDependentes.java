
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosDependentes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosDependentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosDependentes" type="{http://tipo.servico.wssiapenet}DadosDependentes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosDependentes", propOrder = {
    "dadosDependentes"
})
public class ArrayOfDadosDependentes {

    @XmlElement(name = "DadosDependentes", nillable = true)
    protected List<DadosDependentes> dadosDependentes;

    /**
     * Gets the value of the dadosDependentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosDependentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosDependentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosDependentes }
     * 
     * 
     */
    public List<DadosDependentes> getDadosDependentes() {
        if (dadosDependentes == null) {
            dadosDependentes = new ArrayList<DadosDependentes>();
        }
        return this.dadosDependentes;
    }

}
