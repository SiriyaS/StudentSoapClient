
package serviceclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @return
     *     returns java.util.List<serviceclient.Student>
     */
    @WebMethod(operationName = "FindAllStudent")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FindAllStudent", targetNamespace = "http://services/", className = "serviceclient.FindAllStudent")
    @ResponseWrapper(localName = "FindAllStudentResponse", targetNamespace = "http://services/", className = "serviceclient.FindAllStudentResponse")
    @Action(input = "http://services/StudentWebService/FindAllStudentRequest", output = "http://services/StudentWebService/FindAllStudentResponse")
    public List<Student> findAllStudent();

    /**
     * 
     * @param id
     * @return
     *     returns serviceclient.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentById", targetNamespace = "http://services/", className = "serviceclient.FindStudentById")
    @ResponseWrapper(localName = "findStudentByIdResponse", targetNamespace = "http://services/", className = "serviceclient.FindStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/findStudentByIdRequest", output = "http://services/StudentWebService/findStudentByIdResponse")
    public Student findStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<serviceclient.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentByName", targetNamespace = "http://services/", className = "serviceclient.FindStudentByName")
    @ResponseWrapper(localName = "findStudentByNameResponse", targetNamespace = "http://services/", className = "serviceclient.FindStudentByNameResponse")
    @Action(input = "http://services/StudentWebService/findStudentByNameRequest", output = "http://services/StudentWebService/findStudentByNameResponse")
    public List<Student> findStudentByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param gpa
     * @return
     *     returns java.util.List<serviceclient.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentByGPA", targetNamespace = "http://services/", className = "serviceclient.FindStudentByGPA")
    @ResponseWrapper(localName = "findStudentByGPAResponse", targetNamespace = "http://services/", className = "serviceclient.FindStudentByGPAResponse")
    @Action(input = "http://services/StudentWebService/findStudentByGPARequest", output = "http://services/StudentWebService/findStudentByGPAResponse")
    public List<Student> findStudentByGPA(
        @WebParam(name = "gpa", targetNamespace = "")
        Double gpa);

    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertStudent", targetNamespace = "http://services/", className = "serviceclient.InsertStudent")
    @ResponseWrapper(localName = "insertStudentResponse", targetNamespace = "http://services/", className = "serviceclient.InsertStudentResponse")
    @Action(input = "http://services/StudentWebService/insertStudentRequest", output = "http://services/StudentWebService/insertStudentResponse")
    public String insertStudent(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        Double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteStudentById", targetNamespace = "http://services/", className = "serviceclient.DeleteStudentById")
    @ResponseWrapper(localName = "deleteStudentByIdResponse", targetNamespace = "http://services/", className = "serviceclient.DeleteStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/deleteStudentByIdRequest", output = "http://services/StudentWebService/deleteStudentByIdResponse")
    public String deleteStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudentById", targetNamespace = "http://services/", className = "serviceclient.UpdateStudentById")
    @ResponseWrapper(localName = "updateStudentByIdResponse", targetNamespace = "http://services/", className = "serviceclient.UpdateStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/updateStudentByIdRequest", output = "http://services/StudentWebService/updateStudentByIdResponse")
    public String updateStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        Double gpa);

}
