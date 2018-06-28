/*
 

 
 */
package j2ee.servicelocator;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Service2 implements Service {
   public void execute(){
      System.out.println("Executing Service2");
   }

   @Override
   public String getName() {
      return "Service2";
   }
}