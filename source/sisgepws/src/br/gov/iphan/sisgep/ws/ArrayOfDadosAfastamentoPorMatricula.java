
package br.gov.iphan.sisgep.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDadosAfastamentoPorMatricula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosAfastamentoPorMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosAfastamentoPorMatricula" type="{http://tipo.servico.wssiapenet}DadosAfastamentoPorMatricula" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosAfastamentoPorMatricula", propOrder = {
    "dadosAfastamentoPorMatricula"
})
public class ArrayOfDadosAfastamentoPorMatricula {

    @XmlElement(name = "DadosAfastamentoPorMatricula", nillable = true)
    protected List<DadosAfastamentoPorMatricula> dadosAfastamentoPorMatricula;

    /**
     * Gets the value of the dadosAfastamentoPorMatricula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosAfastamentoPorMatricula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosAfastamentoPorMatricula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosAfastamentoPorMatricula }
     * 
     * 
     */
    public List<DadosAfastamentoPorMatricula> getDadosAfastamentoPorMatricula() {
        if (dadosAfastamentoPorMatricula == null) {
            dadosAfastamentoPorMatricula = new ArrayList<DadosAfastamentoPorMatricula>();
        }
        return this.dadosAfastamentoPorMatricula;
    }

}
