//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContributionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Make"/>
 *     &lt;enumeration value="Help"/>
 *     &lt;enumeration value="SomePositive"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="SomeNegative"/>
 *     &lt;enumeration value="Hurt"/>
 *     &lt;enumeration value="Break"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContributionType")
@XmlEnum
public enum ContributionType {

    @XmlEnumValue("Make")
    MAKE("Make"),
    @XmlEnumValue("Help")
    HELP("Help"),
    @XmlEnumValue("SomePositive")
    SOME_POSITIVE("SomePositive"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("SomeNegative")
    SOME_NEGATIVE("SomeNegative"),
    @XmlEnumValue("Hurt")
    HURT("Hurt"),
    @XmlEnumValue("Break")
    BREAK("Break");
    private final String value;

    ContributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContributionType fromValue(String v) {
        for (ContributionType c: ContributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
