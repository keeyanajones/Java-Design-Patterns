/*
 

 
 */
package j2ee.interceptingfilter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class AuthenticationFilter implements Filter {
   public void execute(String request){
      System.out.println("Authenticating request: " + request);
   }
}
