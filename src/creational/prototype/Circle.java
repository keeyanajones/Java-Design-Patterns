/*
 

 
 */
package creational.prototype;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Circle extends Shape {
   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}