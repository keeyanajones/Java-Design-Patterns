/*
 

 
 */
package creational.prototype;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class Rectangle extends Shape {
   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}