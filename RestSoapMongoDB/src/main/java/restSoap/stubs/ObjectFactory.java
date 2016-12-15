
package restSoap.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the restSoap.stubs package. 
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

    private final static QName _ValidateUserAndPass_QNAME = new QName("http://javatpoint.com/", "validateUserAndPass");
    private final static QName _ValidateUserAndPassResponse_QNAME = new QName("http://javatpoint.com/", "validateUserAndPassResponse");
    private final static QName _AddUser_QNAME = new QName("http://javatpoint.com/", "addUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://javatpoint.com/", "addUserResponse");
    private final static QName _Username_QNAME = new QName("http://javatpoint.com/", "username");
    private final static QName _Password_QNAME = new QName("http://javatpoint.com/", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: restSoap.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserRequest }
     * 
     */
    public UserRequest createUserRequest() {
        return new UserRequest();
    }

    /**
     * Create an instance of {@link ValidateUserAndPassResponse }
     * 
     */
    public ValidateUserAndPassResponse createValidateUserAndPassResponse() {
        return new ValidateUserAndPassResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "validateUserAndPass")
    public JAXBElement<UserRequest> createValidateUserAndPass(UserRequest value) {
        return new JAXBElement<UserRequest>(_ValidateUserAndPass_QNAME, UserRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserAndPassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "validateUserAndPassResponse")
    public JAXBElement<ValidateUserAndPassResponse> createValidateUserAndPassResponse(ValidateUserAndPassResponse value) {
        return new JAXBElement<ValidateUserAndPassResponse>(_ValidateUserAndPassResponse_QNAME, ValidateUserAndPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "addUser")
    public JAXBElement<User> createAddUser(User value) {
        return new JAXBElement<User>(_AddUser_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javatpoint.com/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}
