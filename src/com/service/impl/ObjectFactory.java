
package com.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.service.exception.LibraryServiceException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.impl package. 
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

    private final static QName _Fault_QNAME = new QName("http://impl.service.com", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetails }
     * 
     */
    public GetUserDetails createGetUserDetails() {
        return new GetUserDetails();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link IsValidUserResponse }
     * 
     */
    public IsValidUserResponse createIsValidUserResponse() {
        return new IsValidUserResponse();
    }

    /**
     * Create an instance of {@link IsValidUser }
     * 
     */
    public IsValidUser createIsValidUser() {
        return new IsValidUser();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTns3BookDAO }
     * 
     */
    public ArrayOfTns3BookDAO createArrayOfTns3BookDAO() {
        return new ArrayOfTns3BookDAO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.com", name = "fault")
    public JAXBElement<LibraryServiceException> createFault(LibraryServiceException value) {
        return new JAXBElement<LibraryServiceException>(_Fault_QNAME, LibraryServiceException.class, null, value);
    }

}
