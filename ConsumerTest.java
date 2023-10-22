package LambdaBuildInFunctionalInterface;

import java.util.function.Consumer;
import java.util.List;

public class ConsumerTest {
	// main method
	public static void main(String[] args) {
		List<Employee> tList = EmployeeCollection.createList();
		
		// Using consumer functional interface to call the data.
		Consumer<Employee> ce = t -> System.out.println("ID: "+ t.getId()+ "Name: "+ t.getName());
		
	
		tList.stream().forEach(ce); // This way we can call all the values at once.
		
		// call using accept method.
		Employee first = tList.get(1); // this method can help us to call the value using index value.
		System.out.println("First Employee");
		ce.accept(first);
	}
}
