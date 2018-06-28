/*
 

 
 */
package j2ee.interceptingfilter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class InterceptingFilter {
   public static void main(String[] args) {
      FilterManager filterManager = new FilterManager(new Target());
      filterManager.setFilter(new AuthenticationFilter());
      filterManager.setFilter(new DebugFilter());

      Client client = new Client();
      client.setFilterManager(filterManager);
      client.sendRequest("HOME");
   }
}
