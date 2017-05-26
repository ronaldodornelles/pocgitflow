
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosAfastamentoPorCpf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosAfastamentoPorCpf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosAfastamentoPorCpf" type="{http://tipo.servico.wssiapenet}DadosAfastamentoPorCpf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosAfastamentoPorCpf", propOrder = {
    "dadosAfastamentoPorCpf"
})
public class ArrayOfDadosAfastamentoPorCpf {

    @XmlElement(name = "DadosAfastamentoPorCpf", nillable = true)
    protected List<DadosAfastamentoPorCpf> dadosAfastamentoPorCpf;

    /**
     * Gets the value of the dadosAfastamentoPorCpf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosAfastamentoPorCpf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosAfastamentoPorCpf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosAfastamentoPorCpf }
     * 
     * 
     */
    public List<DadosAfastamentoPorCpf> getDadosAfastamentoPorCpf() {
        if (dadosAfastamentoPorCpf == null) {
            dadosAfastamentoPorCpf = new ArrayList<DadosAfastamentoPorCpf>();
        }
        return this.dadosAfastamentoPorCpf;
    }

}
