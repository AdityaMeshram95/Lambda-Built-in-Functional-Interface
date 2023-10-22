package LambdaBuildInFunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	// main method
	public static void main(String[] args) {
		// Call the static method CreateList from collection class.
		List<Employee> tList = EmployeeCollection.createList();
		
		
		// using lambda expression inside Predicate functional interface to return data using filter
		Predicate<Employee> e = t -> t.getName().startsWith("A");
		
		
		// call the summary method to print all the details of result from filtered letter 'L'.
		/*here we call the below method in the method chaining way, where we use .stream, .filter and forEach method.*/ 
		tList.stream().filter(e).forEach(t -> t.printSummary());
		
		
		//Print using in built test method
		for(Employee x : tList) {
			if(e.test(x)) {
				x.printSummary();
			}
		}
	}
}
