/*
 

 
 */
package creational.builder;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class VegBurger extends Burger {
   @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Veg Burger";
   }
}