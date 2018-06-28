/*
 

 
 */
package behavioral.visitor;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
