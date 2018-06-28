/*
 

 
 */
package j2ee.businessdelegate;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Client {
	
   BusinessDelegate businessService;

   public Client(BusinessDelegate businessService){
      this.businessService  = businessService;
   }

   public void doTask(){		
      businessService.doTask();
   }
}
