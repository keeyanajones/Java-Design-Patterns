/*
 

 
 */
package behavioral.state;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class StartState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   public String toString(){
      return "Start State";
   }
}