package LambdaBuildInFunctionalInterface;

import java.util.*;

/* We are using 1 base class so we can solve that without using a collection also but when we have many
 * classes of which we have to create a builder pattern then we will be needing a collection to collect
 * and pass all values inside at once.*/
public class EmployeeCollection {
	
	// Create a static method which will return List<>
	public static List<Employee> createList(){
		
		// Declare a list using Generic 
		List<Employee> list = new ArrayList<>();
		
		/* Calling the static method from Builder class and passing the value inside Base class Employee 
		 * for each reference variable of base class.
		 * here we call all the methods after each other using (.) operator without using object still its 
		 * working because all the method inside builder class return "this" means an object/current instance
		 * so ultimately we are calling by object only.
		 */
		
		// this way of calling method in a sequence is called "Java Stream". 
		Employee e1 = BuilderEmployee.createObject().setId(1).setName("Aditya")
				.setGender(Gender.MALE).setSalary(25000).setSsn("CNCPM0274G").build();
		
		Employee e2 = BuilderEmployee.createObject().setId(2).setName("Nami")
				.setGender(Gender.FEMALE).setSalary(500).setSsn("CN52KJ").build();
		
		Employee e3 = BuilderEmployee.createObject().setId(3).setName("Robin")
				.setGender(Gender.FEMALE).setSalary(15000).setSsn("CN548G").build();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		// since our static method has a return type of list we have to return list variable.
		return list;
	}
}

