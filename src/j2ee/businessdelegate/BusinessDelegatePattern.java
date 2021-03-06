/*
 

 
 */
package j2ee.businessdelegate;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class BusinessDelegatePattern {
	
   public static void main(String[] args) {

      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("EJB");

      Client client = new Client(businessDelegate);
      client.doTask();

      businessDelegate.setServiceType("JMS");
      client.doTask();
   }
}