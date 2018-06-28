/*
 

 
 */
package behavioral.command;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}