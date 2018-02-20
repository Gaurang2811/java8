package java8;

import java.util.Arrays;
import java.util.EventListener;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * <p>
 * Functional interfaces have a single functionality to exhibit. For example, a
 * Comparable interface with a single method ‘compareTo’ is used for comparison
 * purpose. Java 8 has defined a lot of functional interfaces to be used
 * extensively in lambda expressions.
 * </p>
 * 
 * @author ga.omar
 *
 */
public class FunctionalInterface {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// remember from the overview section
		// the above list will not return Arraylist object. You cannot add or
		// remove
		// elements into this list
		// try adding element;
		// list.add(10);

		Predicate<Integer> predicate = n -> n % 2 == 0;
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n%2 comes to be zero

		Predicate<Integer> predicate2 = n -> n > 3;
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n is greater than 3.

		System.out.println("Print all numbers: ");
		eval(list, n -> true);

		System.out.println("\n\nPrint even numbers: ");
		eval(list, predicate);

		System.out.println("\n\nPrint numbers greater than three: ");
		eval(list, predicate2);

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer integer : list)
			if (predicate.test(integer))
				System.out.print(integer + ", ");
	}

}
