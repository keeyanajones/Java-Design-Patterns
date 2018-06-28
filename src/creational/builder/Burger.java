/*
 

 
 */
package creational.builder;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public abstract class Burger implements Item {
   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}
