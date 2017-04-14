
/**@Application having a Generic HashMap with
 * Employee code as a key and Employee Name as a value*/

/**@Importing the util package*/
import java.util.*;

/** @Defining the class Employee */
public class GenericHashmap {
	/** @Main method */
	public static void main(String args[]) {
		/** @Using hash map function */
		/** @Integer = key and String =value */
		HashMap<Integer, String> n = new HashMap<Integer, String>();
		/** @Putting the value */
		n.put(101, "Saquib");
		n.put(103, "Tarique");
		n.put(105, "Al Badar");
		n.put(102, "Huzaifa");
		n.put(104, "Sharique");
		n.put(100, "Osama");
		/** @Mapping key with the value */
		for (Map.Entry m : n.entrySet()) {
			/** @Printing hte value */
			System.out.println(m.getValue());
		}
	}
}