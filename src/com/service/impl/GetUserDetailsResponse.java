
package com.service.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.service.bo.UserInfoBO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUserDetailsReturn" type="{http://bo.service.com}UserInfoBO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUserDetailsReturn"
})
@XmlRootElement(name = "getUserDetailsResponse")
public class GetUserDetailsResponse {

    @XmlElement(required = true)
    protected UserInfoBO getUserDetailsReturn;

    /**
     * Gets the value of the getUserDetailsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoBO }
     *     
     */
    public UserInfoBO getGetUserDetailsReturn() {
        return getUserDetailsReturn;
    }

    /**
     * Sets the value of the getUserDetailsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoBO }
     *     
     */
    public void setGetUserDetailsReturn(UserInfoBO value) {
        this.getUserDetailsReturn = value;
    }

}
