/*
 

 
 */
package structural.proxy;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class ProxyPattern {
	
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display(); 	
   }
}
