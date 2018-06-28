/*
 

 
 */
package j2ee.interceptingfilter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Client {
   FilterManager filterManager;

   public void setFilterManager(FilterManager filterManager){
      this.filterManager = filterManager;
   }

   public void sendRequest(String request){
      filterManager.filterRequest(request);
   }
}
