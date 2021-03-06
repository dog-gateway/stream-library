//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.08 at 04:48:15 PM CET 
//


package it.polito.elite.dog.core.library.stream.source.mapping.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sensorURI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sensorQFunctionality" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sensorQFParams" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pollingTimeMillis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensorData")
public class SensorData {

    @XmlAttribute(name = "sensorURI", required = true)
    protected String sensorURI;
    @XmlAttribute(name = "sensorQFunctionality", required = true)
    protected String sensorQFunctionality;
    @XmlAttribute(name = "sensorQFParams", required = true)
    protected String sensorQFParams;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "pollingTimeMillis")
    protected String pollingTimeMillis;

    /**
     * Gets the value of the sensorURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorURI() {
        return sensorURI;
    }

    /**
     * Sets the value of the sensorURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorURI(String value) {
        this.sensorURI = value;
    }

    /**
     * Gets the value of the sensorQFunctionality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorQFunctionality() {
        return sensorQFunctionality;
    }

    /**
     * Sets the value of the sensorQFunctionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorQFunctionality(String value) {
        this.sensorQFunctionality = value;
    }

    /**
     * Gets the value of the sensorQFParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorQFParams() {
        return sensorQFParams;
    }

    /**
     * Sets the value of the sensorQFParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorQFParams(String value) {
        this.sensorQFParams = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the pollingTimeMillis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollingTimeMillis() {
        return pollingTimeMillis;
    }

    /**
     * Sets the value of the pollingTimeMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollingTimeMillis(String value) {
        this.pollingTimeMillis = value;
    }

}
