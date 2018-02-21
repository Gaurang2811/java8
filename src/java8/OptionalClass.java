package java8;

import java.util.Optional;

/**
 * <p>
 * Optional is a container object used to contain not-null objects. Optional
 * object is used to represent null with absent value. This class has various
 * utility methods to facilitate code to handle values as ‘available’ or ‘not
 * available’ instead of checking null values. It is introduced in Java 8 and is
 * similar to what Optional is in Guava.
 * </p>
 * 
 * <h2>Class Declaration</h2>
 * <h2>Following is the declaration for <i>java.util.Optional<<T>></i> class −
 * <h2>
 * 
 * <p>
 * public final class Optional<T> extends Object
 * </p>
 * 
 * @One-Simple-Examples
 * 
 * @author ga.omar
 *
 */
public class OptionalClass {

	public static void main(String[] args) {
		Integer first = null;
		Integer second = new Integer(10);

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> firstOpt = Optional.ofNullable(first);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> secondOpt = Optional.of(second);

		System.out.println(sum(firstOpt, secondOpt));
	}

	public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not

		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();
		return value1 + value2;
	}
}
