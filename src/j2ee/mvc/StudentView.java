/*
 

 
 */
package j2ee.mvc;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class StudentView {
   public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
   }
}
