//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{}PathNode">
 *       &lt;sequence>
 *         &lt;element name="workload" type="{}Workload" minOccurs="0"/>
 *         &lt;element name="inBindings" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="precondition" type="{}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartPoint", propOrder = {
    "workload",
    "inBindings",
    "precondition"
})
public class StartPoint
    extends PathNode
{

    protected Workload workload;
    @XmlElementRef(name = "inBindings", type = JAXBElement.class)
    protected List<JAXBElement<Object>> inBindings;
    protected Condition precondition;

    /**
     * Gets the value of the workload property.
     * 
     * @return
     *     possible object is
     *     {@link Workload }
     *     
     */
    public Workload getWorkload() {
        return workload;
    }

    /**
     * Sets the value of the workload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workload }
     *     
     */
    public void setWorkload(Workload value) {
        this.workload = value;
    }

    /**
     * Gets the value of the inBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getInBindings() {
        if (inBindings == null) {
            inBindings = new ArrayList<JAXBElement<Object>>();
        }
        return this.inBindings;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getPrecondition() {
        return precondition;
    }

    /**
     * Sets the value of the precondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setPrecondition(Condition value) {
        this.precondition = value;
    }

}
