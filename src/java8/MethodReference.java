package java8;

import java.util.List;

/**
 * 
 * <h4>Method references help to point to methods by their names. A method
 * reference is described using "::" symbol.</h4>
 * 
 * <ul>
 * A method reference can be used to point the following types of methods −
 * <li>Static methods</li>
 * <li>Instance methods</li>
 * <li>Constructors using new operator (TreeSet::new)
 * <ul>
 * 
 * @author ga.omar
 *
 */
public class MethodReference {

	public static void main(String[] args) {
		List<String> list = Overview.returnList();

		// using lambda expression
		System.out.println("using lambda");
		list.forEach(s -> System.out.print(s));

		// using method reference
		System.out.println("\n\nusing method reference");
		list.forEach(System.out::print);
	}

}
