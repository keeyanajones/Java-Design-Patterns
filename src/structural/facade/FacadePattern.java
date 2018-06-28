/*
 

 
 */
package structural.facade;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class FacadePattern {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
}
