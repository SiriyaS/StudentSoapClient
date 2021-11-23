
package serviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceclient package. 
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

    private final static QName _FindStudentByName_QNAME = new QName("http://services/", "findStudentByName");
    private final static QName _UpdateStudentById_QNAME = new QName("http://services/", "updateStudentById");
    private final static QName _FindAllStudent_QNAME = new QName("http://services/", "FindAllStudent");
    private final static QName _FindStudentById_QNAME = new QName("http://services/", "findStudentById");
    private final static QName _FindAllStudentResponse_QNAME = new QName("http://services/", "FindAllStudentResponse");
    private final static QName _FindStudentByGPA_QNAME = new QName("http://services/", "findStudentByGPA");
    private final static QName _FindStudentByIdResponse_QNAME = new QName("http://services/", "findStudentByIdResponse");
    private final static QName _FindStudentByNameResponse_QNAME = new QName("http://services/", "findStudentByNameResponse");
    private final static QName _DeleteStudentByIdResponse_QNAME = new QName("http://services/", "deleteStudentByIdResponse");
    private final static QName _UpdateStudentByIdResponse_QNAME = new QName("http://services/", "updateStudentByIdResponse");
    private final static QName _InsertStudent_QNAME = new QName("http://services/", "insertStudent");
    private final static QName _InsertStudentResponse_QNAME = new QName("http://services/", "insertStudentResponse");
    private final static QName _DeleteStudentById_QNAME = new QName("http://services/", "deleteStudentById");
    private final static QName _FindStudentByGPAResponse_QNAME = new QName("http://services/", "findStudentByGPAResponse");
    private final static QName _Student_QNAME = new QName("http://services/", "student");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertStudentResponse }
     * 
     */
    public InsertStudentResponse createInsertStudentResponse() {
        return new InsertStudentResponse();
    }

    /**
     * Create an instance of {@link InsertStudent }
     * 
     */
    public InsertStudent createInsertStudent() {
        return new InsertStudent();
    }

    /**
     * Create an instance of {@link FindStudentByGPAResponse }
     * 
     */
    public FindStudentByGPAResponse createFindStudentByGPAResponse() {
        return new FindStudentByGPAResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link DeleteStudentById }
     * 
     */
    public DeleteStudentById createDeleteStudentById() {
        return new DeleteStudentById();
    }

    /**
     * Create an instance of {@link FindStudentByNameResponse }
     * 
     */
    public FindStudentByNameResponse createFindStudentByNameResponse() {
        return new FindStudentByNameResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentByIdResponse }
     * 
     */
    public DeleteStudentByIdResponse createDeleteStudentByIdResponse() {
        return new DeleteStudentByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentByIdResponse }
     * 
     */
    public UpdateStudentByIdResponse createUpdateStudentByIdResponse() {
        return new UpdateStudentByIdResponse();
    }

    /**
     * Create an instance of {@link FindStudentByGPA }
     * 
     */
    public FindStudentByGPA createFindStudentByGPA() {
        return new FindStudentByGPA();
    }

    /**
     * Create an instance of {@link FindStudentByIdResponse }
     * 
     */
    public FindStudentByIdResponse createFindStudentByIdResponse() {
        return new FindStudentByIdResponse();
    }

    /**
     * Create an instance of {@link FindStudentByName }
     * 
     */
    public FindStudentByName createFindStudentByName() {
        return new FindStudentByName();
    }

    /**
     * Create an instance of {@link UpdateStudentById }
     * 
     */
    public UpdateStudentById createUpdateStudentById() {
        return new UpdateStudentById();
    }

    /**
     * Create an instance of {@link FindAllStudent }
     * 
     */
    public FindAllStudent createFindAllStudent() {
        return new FindAllStudent();
    }

    /**
     * Create an instance of {@link FindAllStudentResponse }
     * 
     */
    public FindAllStudentResponse createFindAllStudentResponse() {
        return new FindAllStudentResponse();
    }

    /**
     * Create an instance of {@link FindStudentById }
     * 
     */
    public FindStudentById createFindStudentById() {
        return new FindStudentById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByName")
    public JAXBElement<FindStudentByName> createFindStudentByName(FindStudentByName value) {
        return new JAXBElement<FindStudentByName>(_FindStudentByName_QNAME, FindStudentByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentById")
    public JAXBElement<UpdateStudentById> createUpdateStudentById(UpdateStudentById value) {
        return new JAXBElement<UpdateStudentById>(_UpdateStudentById_QNAME, UpdateStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "FindAllStudent")
    public JAXBElement<FindAllStudent> createFindAllStudent(FindAllStudent value) {
        return new JAXBElement<FindAllStudent>(_FindAllStudent_QNAME, FindAllStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentById")
    public JAXBElement<FindStudentById> createFindStudentById(FindStudentById value) {
        return new JAXBElement<FindStudentById>(_FindStudentById_QNAME, FindStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "FindAllStudentResponse")
    public JAXBElement<FindAllStudentResponse> createFindAllStudentResponse(FindAllStudentResponse value) {
        return new JAXBElement<FindAllStudentResponse>(_FindAllStudentResponse_QNAME, FindAllStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByGPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByGPA")
    public JAXBElement<FindStudentByGPA> createFindStudentByGPA(FindStudentByGPA value) {
        return new JAXBElement<FindStudentByGPA>(_FindStudentByGPA_QNAME, FindStudentByGPA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIdResponse")
    public JAXBElement<FindStudentByIdResponse> createFindStudentByIdResponse(FindStudentByIdResponse value) {
        return new JAXBElement<FindStudentByIdResponse>(_FindStudentByIdResponse_QNAME, FindStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByNameResponse")
    public JAXBElement<FindStudentByNameResponse> createFindStudentByNameResponse(FindStudentByNameResponse value) {
        return new JAXBElement<FindStudentByNameResponse>(_FindStudentByNameResponse_QNAME, FindStudentByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteStudentByIdResponse")
    public JAXBElement<DeleteStudentByIdResponse> createDeleteStudentByIdResponse(DeleteStudentByIdResponse value) {
        return new JAXBElement<DeleteStudentByIdResponse>(_DeleteStudentByIdResponse_QNAME, DeleteStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentByIdResponse")
    public JAXBElement<UpdateStudentByIdResponse> createUpdateStudentByIdResponse(UpdateStudentByIdResponse value) {
        return new JAXBElement<UpdateStudentByIdResponse>(_UpdateStudentByIdResponse_QNAME, UpdateStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudent")
    public JAXBElement<InsertStudent> createInsertStudent(InsertStudent value) {
        return new JAXBElement<InsertStudent>(_InsertStudent_QNAME, InsertStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudentResponse")
    public JAXBElement<InsertStudentResponse> createInsertStudentResponse(InsertStudentResponse value) {
        return new JAXBElement<InsertStudentResponse>(_InsertStudentResponse_QNAME, InsertStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteStudentById")
    public JAXBElement<DeleteStudentById> createDeleteStudentById(DeleteStudentById value) {
        return new JAXBElement<DeleteStudentById>(_DeleteStudentById_QNAME, DeleteStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByGPAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByGPAResponse")
    public JAXBElement<FindStudentByGPAResponse> createFindStudentByGPAResponse(FindStudentByGPAResponse value) {
        return new JAXBElement<FindStudentByGPAResponse>(_FindStudentByGPAResponse_QNAME, FindStudentByGPAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

}
