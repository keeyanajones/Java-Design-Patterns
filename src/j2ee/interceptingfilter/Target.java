/*
 

 
 */
package j2ee.interceptingfilter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}
