//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntentionalElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntentionalElement">
 *   &lt;complexContent>
 *     &lt;extension base="{}GRLLinkableElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{}IntentionalElementType"/>
 *         &lt;element name="decompositionType" type="{}DecompositionType"/>
 *         &lt;element name="importance" type="{}ImportanceType"/>
 *         &lt;element name="importanceQuantitative" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="refs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="style" type="{}ConcreteStyle" minOccurs="0"/>
 *         &lt;element name="actor" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntentionalElement", propOrder = {
    "type",
    "decompositionType",
    "importance",
    "importanceQuantitative",
    "refs",
    "style",
    "actor"
})
public class IntentionalElement
    extends GRLLinkableElement
{

    @XmlElement(required = true)
    protected IntentionalElementType type;
    @XmlElement(required = true, defaultValue = "AND")
    protected DecompositionType decompositionType;
    @XmlElement(required = true, defaultValue = "None")
    protected ImportanceType importance;
    @XmlElement(required = true)
    protected BigInteger importanceQuantitative;
    @XmlElementRef(name = "refs", type = JAXBElement.class)
    protected List<JAXBElement<Object>> refs;
    protected ConcreteStyle style;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object actor;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link IntentionalElementType }
     *     
     */
    public IntentionalElementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentionalElementType }
     *     
     */
    public void setType(IntentionalElementType value) {
        this.type = value;
    }

    /**
     * Gets the value of the decompositionType property.
     * 
     * @return
     *     possible object is
     *     {@link DecompositionType }
     *     
     */
    public DecompositionType getDecompositionType() {
        return decompositionType;
    }

    /**
     * Sets the value of the decompositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecompositionType }
     *     
     */
    public void setDecompositionType(DecompositionType value) {
        this.decompositionType = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceType }
     *     
     */
    public ImportanceType getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceType }
     *     
     */
    public void setImportance(ImportanceType value) {
        this.importance = value;
    }

    /**
     * Gets the value of the importanceQuantitative property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImportanceQuantitative() {
        return importanceQuantitative;
    }

    /**
     * Sets the value of the importanceQuantitative property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImportanceQuantitative(BigInteger value) {
        this.importanceQuantitative = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRefs() {
        if (refs == null) {
            refs = new ArrayList<JAXBElement<Object>>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link ConcreteStyle }
     *     
     */
    public ConcreteStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcreteStyle }
     *     
     */
    public void setStyle(ConcreteStyle value) {
        this.style = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActor(Object value) {
        this.actor = value;
    }

}
