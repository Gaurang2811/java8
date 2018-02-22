package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <h1>Initial version released on 18 March 2014.
 * <h1>
 * 
 * <ul>
 * New Features
 * <li>Lambda expression − Adds functional processing capability to Java.</li>
 * 
 * <li>Method references − Referencing functions by their names instead of
 * invoking them directly. Using functions as parameter.</li>
 * 
 * <li>Default method − Interface to have default method implementation.</li>
 * 
 * <li>New tools − New compiler tools and utilities are added like ‘jdeps’ to
 * figure out dependencies.</li>
 * 
 * <li>Stream API − New stream API to facilitate pipeline processing<l/i>.
 * 
 * <li>Date Time API − Improved date time API.</li>
 * 
 * <li>Optional − Emphasis on best practices to handle null values
 * properly.</li>
 * 
 * <li>Nashorn, JavaScript Engine − A Java-based engine to execute JavaScript
 * code.</li>
 * 
 * <li>DateTime -> Zoned DateTime -> Other DateTime API</li>
 * </ul>
 * 
 * @author ga.omar
 *
 */

// Import project on IDE.
// Hover over the Class name to read the description.
public class Overview {

	// sample using java 8.
	public static void main(String[] args) {
		List<String> list1 = returnList();
		List<String> list2 = returnList();

		System.out.println("Sorting using java 7");
		sortUsingJava7(list1);
		printList(list1);

		System.out.println("Sorting using java 8");
		sortUsingJava8(list2);
		printList(list2);

	}

	public static void sortUsingJava7(List<String> listToSort) {
		Collections.sort(listToSort, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});
	}

	public static void sortUsingJava8(List<String> listToSort) {
		Collections.sort(listToSort, (arg0, arg1) -> arg0.compareTo(arg1));
	}

	public static List<String> returnList() {
		// new Arrays.asList("beta, gamma, theta, alpha, omega, mega, shi");
		// this will not return a Arraylist object. You cannot add or remove
		// elements into this list
		return new ArrayList<String>(Arrays.asList("beta", "gamma", "theta", "alpha", "omega", "mega", "shi"));
	}

	public static void printList(List<String> listToPrint) {
		for (String str : listToPrint) {
			System.out.print(str + ", ");
		}
		System.out.println("\n");
	}

}
