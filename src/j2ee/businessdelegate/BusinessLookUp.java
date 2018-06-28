/*
 

 
 */
package j2ee.businessdelegate;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class BusinessLookUp {
   public BusinessService getBusinessService(String serviceType){
   
      if(serviceType.equalsIgnoreCase("EJB")){
         return new EJBService();
      }
      else {
         return new JMSService();
      }
   }
}
