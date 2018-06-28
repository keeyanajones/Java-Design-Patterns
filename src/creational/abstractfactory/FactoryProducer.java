/*
 

 
 */
package creational.abstractfactory;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
         
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      
      return null;
   }
}
