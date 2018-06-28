/*
 

 
 */
package creational.abstractfactory;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}