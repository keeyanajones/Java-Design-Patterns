/*
 

 
 */
package behavioral.visitor;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
