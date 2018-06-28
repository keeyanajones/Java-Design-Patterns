/*
 

 
 */
package behavioral.mediator;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class MediatorPattern {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
