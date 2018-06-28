/*
 

 
 */
package structural.decorator;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}
