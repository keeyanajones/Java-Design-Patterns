/*
 

 
 */
package behavioral.strategy;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
public class OperationSubstract implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
