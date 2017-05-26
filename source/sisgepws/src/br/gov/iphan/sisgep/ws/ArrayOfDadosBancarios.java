
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosBancarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosBancarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosBancarios" type="{http://tipo.servico.wssiapenet}DadosBancarios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosBancarios", propOrder = {
    "dadosBancarios"
})
public class ArrayOfDadosBancarios {

    @XmlElement(name = "DadosBancarios", nillable = true)
    protected List<DadosBancarios> dadosBancarios;

    /**
     * Gets the value of the dadosBancarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosBancarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosBancarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosBancarios }
     * 
     * 
     */
    public List<DadosBancarios> getDadosBancarios() {
        if (dadosBancarios == null) {
            dadosBancarios = new ArrayList<DadosBancarios>();
        }
        return this.dadosBancarios;
    }

}
