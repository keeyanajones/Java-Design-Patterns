/*
 

 
 */
package j2ee.compositeentity;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class CompositeEntityPattern {
   public static void main(String[] args) {
   
       Client client = new Client();
       client.setData("Test", "Data");
       client.printData();
       client.setData("Second Test", "Data1");
       client.printData();
   }
}
