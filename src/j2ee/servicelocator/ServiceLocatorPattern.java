/*
 

 
 */
package j2ee.servicelocator;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class ServiceLocatorPattern {
   public static void main(String[] args) {
      Service service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();
      service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();		
   }
}

