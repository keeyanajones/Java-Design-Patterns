/*
 

 
 */
package j2ee.interceptingfilter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class DebugFilter implements Filter {
   public void execute(String request){
      System.out.println("request log: " + request);
   }
}
