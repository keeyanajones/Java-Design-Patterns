/*
 

 
 */
package behavioral.visitor;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Mouse implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}