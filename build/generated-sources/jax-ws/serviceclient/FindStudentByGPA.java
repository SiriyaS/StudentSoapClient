
package serviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findStudentByGPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findStudentByGPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findStudentByGPA", propOrder = {
    "gpa"
})
public class FindStudentByGPA {

    protected Double gpa;

    /**
     * Gets the value of the gpa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGpa() {
        return gpa;
    }

    /**
     * Sets the value of the gpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGpa(Double value) {
        this.gpa = value;
    }

}
