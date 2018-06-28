/*
 

 
 */
package behavioral.observer;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class ObserverPattern {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}