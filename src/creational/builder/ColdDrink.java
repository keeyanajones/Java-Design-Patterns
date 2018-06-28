/*
 

 
 */
package creational.builder;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}
