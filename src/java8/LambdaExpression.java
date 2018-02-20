package java8;

/**
 * <h3>Syntax</h3>
 * 
 * <pre>
 * parameter -> expression body
 * </pre>
 * 
 * <ul>
 * <li>
 * <p>
 * <b>Optional type declaration</b> − No need to declare the type of a
 * parameter. The compiler can inference the same from the value of the
 * parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Optional parenthesis around parameter</b> − No need to declare a single
 * parameter in parenthesis. For multiple parameters, parentheses are required.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Optional curly braces</b> − No need to use curly braces in expression body
 * if the body contains a single statement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Optional return keyword</b> − The compiler automatically returns the value
 * if the body has a single expression to return the value. Curly braces are
 * required to indicate that expression returns a value.
 * </p>
 * </li> </u l>
 * 
 * @author ga.omar
 *
 */
public class LambdaExpression {
	public static void main(String[] args) {
		LambdaExpression lamExp = new LambdaExpression();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		;

		System.out.println("10 + 5 = " + lamExp.operate(10, 5, addition));
		System.out.println("10 - 5 = " + lamExp.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + lamExp.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + lamExp.operate(10, 5, division));

		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		// GreetingService greetService1 = System.out::println;

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
