/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsoapclient;

import java.math.BigDecimal;
import java.util.List;
import serviceclient.Student;

/**
 *
 * @author siriya_s
 */
public class StudentSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // findAll
        List<Student> studs = findAllStudent();
        printAllStudent(studs);
        
        // findByID
        Student stud = findStudentById(1);
        System.out.printf("%d\t%s\t%.2f\n", stud.getId(), stud.getName(), stud.getGPA());
        
        // findByName
        studs = findStudentByName("Phil");
        printAllStudent(studs);
        
        // findByGPA
        studs = findStudentByGPA(3.76);
        printAllStudent(studs);
        
        // insert Student
        String res = insertStudent(12, "Ryu", 3.88);
        System.out.println(res);
        stud = findStudentById(12);
        System.out.printf("%d\t%s\t%.2f\n", stud.getId(), stud.getName(), stud.getGPA());
        
        // update Student
        res = updateStudentById(9, "Ryu", 3.88);
        System.out.println(res);
        stud = findStudentById(9);
        System.out.printf("%d\t%s\t%.2f\n", stud.getId(), stud.getName(), stud.getGPA());
        
        // delete Student
        res = deleteStudentById(10);
        System.out.println(res);
    }

    private static java.util.List<serviceclient.Student> findAllStudent() {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.findAllStudent();
    }

    private static String deleteStudentById(int id) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.deleteStudentById(id);
    }

    private static java.util.List<serviceclient.Student> findStudentByGPA(Double gpa) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentByGPA(gpa);
    }

    private static Student findStudentById(int id) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }

    private static java.util.List<serviceclient.Student> findStudentByName(java.lang.String name) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentByName(name);
    }

    private static String insertStudent(int id, java.lang.String name, Double gpa) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.insertStudent(id, name, gpa);
    }

    private static String updateStudentById(int id, java.lang.String name, Double gpa) {
        serviceclient.StudentWebService_Service service = new serviceclient.StudentWebService_Service();
        serviceclient.StudentWebService port = service.getStudentWebServicePort();
        return port.updateStudentById(id, name, gpa);
    }
    
    public static void printAllStudent(List<Student> studentList) {
        for(Student stud : studentList) {
            System.out.print(stud.getId() + " ");
            System.out.print(stud.getName() + " ");
            System.out.println(stud.getGPA() + " ");
        }
    }
}
