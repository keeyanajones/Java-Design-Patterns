/*
 

 
 */
package structural.filter;

/**
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
import java.util.List;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}

