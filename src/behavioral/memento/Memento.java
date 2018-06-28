/*
 

 
 */
package behavioral.memento;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }	
}

