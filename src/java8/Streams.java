package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 
 * <p>
 * Stream is a new abstract layer introduced in Java 8. Using stream, you can
 * process data in a declarative way similar to SQL statements. For example,
 * consider the following SQL statement.
 * </p>
 * 
 * <p>
 * <code>SELECT max(salary), employee_id, employee_name FROM Employee</code>
 * </p>
 * <p>
 * The above SQL expression automatically returns the maximum salaried
 * employee's details, without doing any computation on the developer's end.
 * Using collections framework in Java, a developer has to use loops and make
 * repeated checks. Another concern is efficiency; as multi-core processors are
 * available at ease, a Java developer has to write parallel code processing
 * that can be pretty error-prone.
 * </p>
 * 
 * <p>
 * To resolve such issues, Java 8 introduced the concept of stream that lets the
 * developer to process data declaratively and leverage multicore architecture
 * without the need to write any specific code for it.
 * </p>
 * 
 * <hr>
 * 
 * <h1>What is Stream?</h1>
 * <p>
 * Stream represents a sequence of objects from a source, which supports
 * aggregate operations. Following are the characteristics of a Stream −
 * </p>
 * 
 * <ul>
 * <li><b>Sequence of elements</b> − A stream provides a set of elements of
 * specific type in a sequential manner. A stream gets/computes elements on
 * demand. It never stores the elements.</li>
 * <li><b>Source</b> − Stream takes Collections, Arrays, or I/O resources as
 * input source.</li>
 * <li><b>Aggregate operations</b> − Stream supports aggregate operations like
 * filter, map, limit, reduce, find, match, and so on.</li>
 * <li><b>Pipelining</b> − Most of the stream operations return stream itself so
 * that their result can be pipelined. These operations are called intermediate
 * operations and their function is to take input, process them, and return
 * output to the target. collect() method is a terminal operation which is
 * normally present at the end of the pipelining operation to mark the end of
 * the stream.</li>
 * <li><b>Automatic iterations</b> − Stream operations do the iterations
 * internally over the source elements provided, in contrast to Collections
 * where explicit iteration is required.</li>
 * </ul>
 * 
 * <hr>
 * <h1>GeneratingStreams</h1>
 * <p>
 * With Java 8, Collection interface has two methods to generate a Stream.
 * </p>
 * 
 * <ul>
 * <li><b>stream()</b> − Returns a sequential stream considering collection as
 * its source.</li>
 * <li><b>parallelStream()</b> − Returns a parallel Stream considering
 * collection as its source.</li>
 * </ul>
 * <p>
 * Parallel streams divide the provided task into many and run them in different
 * threads, utilizing multiple cores of the computer. On the other hand
 * sequential streams work just like for-loop using a single core.
 * </p>
 * <hr>
 * <h4>forEach</h4>
 * <p>
 * Stream has provided a new method ‘forEach’ to iterate each element of the
 * stream.
 * </p>
 * <hr>
 * <h4>map</h4>
 * <p>
 * The ‘map’ method is used to map each element to its corresponding result.
 * </p>
 * <hr>
 * <h4>filter</h4>
 * <p>
 * The ‘filter’ method is used to eliminate elements based on a criteria.
 * </p>
 * <hr>
 * <h4>limit</h4>
 * <p>
 * The ‘limit’ method is used to reduce the size of the stream.
 * </p>
 * <hr>
 * <h4>sorted</h4>
 * <p>
 * The ‘sorted’ method is used to sort the stream.
 * </p>
 * <hr>
 * <h4>Collectore</h4>
 * <p>
 * Collectors are used to combine the result of processing on the elements of a
 * stream.
 * </p>
 * <hr>
 * <h4>Statistics</h4>
 * <p>
 * With Java 8, statistics collectors are introduced to calculate all statistics
 * when stream processing is being done. stream.
 * </p>
 * 
 * 
 * @author ga.omar
 *
 */
public class Streams {

	public static void main(String[] args) {

		// using Stream
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		// using forEach
		// The following code segment shows how to print 10 random numbers using
		// forEach.
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		// using map
		// The following code segment prints unique squares of numbers using
		// map.
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		// using filter
		// The following code segment prints a count of empty strings using
		// filter.
		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();

		// using filter
		// The following code segment shows how to print 10 random numbers using
		// limit.
		random.ints().limit(10).forEach(System.out::println);

		// using sorted
		// The following code segment shows how to print 10 random numbers in a
		// sorted order.
		random.ints().limit(10).sorted().forEach(System.out::println);

		// using collectorrs
		// Collectors can be used to return a list or a string.
		List<String> filter = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filter);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		// using Statistics
		List num = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = num.stream().mapToInt(x -> (int) x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}

}
