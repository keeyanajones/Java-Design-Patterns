/*
 

 
 */
package j2ee.businessdelegate;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class EJBService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }
}