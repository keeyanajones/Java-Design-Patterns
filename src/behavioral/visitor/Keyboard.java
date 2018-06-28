/*
 

 
 */
package behavioral.visitor;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Keyboard implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}