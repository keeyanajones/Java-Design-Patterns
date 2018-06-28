/*
 

 
 */
package j2ee.frontcontroller;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class FrontControllerPattern {
   public static void main(String[] args) {
   
      FrontController frontController = new FrontController();
      frontController.dispatchRequest("HOME");
      frontController.dispatchRequest("STUDENT");
   }
}