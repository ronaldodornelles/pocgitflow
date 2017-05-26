
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVagasOrgao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVagasOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VagasOrgao" type="{http://tipo.servico.wssiapenet}VagasOrgao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVagasOrgao", propOrder = {
    "vagasOrgao"
})
public class ArrayOfVagasOrgao {

    @XmlElement(name = "VagasOrgao", nillable = true)
    protected List<VagasOrgao> vagasOrgao;

    /**
     * Gets the value of the vagasOrgao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vagasOrgao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVagasOrgao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VagasOrgao }
     * 
     * 
     */
    public List<VagasOrgao> getVagasOrgao() {
        if (vagasOrgao == null) {
            vagasOrgao = new ArrayList<VagasOrgao>();
        }
        return this.vagasOrgao;
    }

}
