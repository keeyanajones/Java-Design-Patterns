/*
 

 
 */
package behavioral.state;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);	
   }

   public String toString(){
      return "Stop State";
   }
}
