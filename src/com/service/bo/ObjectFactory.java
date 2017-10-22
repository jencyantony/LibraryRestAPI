
package com.service.bo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.bo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.bo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginInfoBO }
     * 
     */
    public LoginInfoBO createLoginInfoBO() {
        return new LoginInfoBO();
    }

    /**
     * Create an instance of {@link UserInfoBO }
     * 
     */
    public UserInfoBO createUserInfoBO() {
        return new UserInfoBO();
    }

    /**
     * Create an instance of {@link UserRegistrationInfoBO }
     * 
     */
    public UserRegistrationInfoBO createUserRegistrationInfoBO() {
        return new UserRegistrationInfoBO();
    }

}
