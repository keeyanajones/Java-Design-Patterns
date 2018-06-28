/*
 

 
 */
package behavioral.template;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class TemplatePattern {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();		
   }
}