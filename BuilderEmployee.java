package LambdaBuildInFunctionalInterface;

public class BuilderEmployee { // Builder class
	// create an instance variable of Employee
	/* If we have'nt created Employee class instance variable here then we have to create all the instance
	 * variable same as Employee class again.*/
	private Employee e;
	
	// Constructor
	public BuilderEmployee(Employee e) {
		this.e = e;
	}
	
	// Create a static method which will always return object of class Employee
	// Either create the whole class as static of create a method as static.
	public static BuilderEmployee createObject() {
		return new BuilderEmployee(new Employee());
	}
	
	// method which will return current instance.
	/*Here we are creating a simple method with argument with return whose having a return class return type
	 * inside this method we will call the set method of base class and pass the instance variable 
	 * then we will return "this" which will carry the current instance.*/
	public BuilderEmployee setId(int id) {
		e.setId(id); // we set the parameter here
		return this; // return current instance as well
	}
	
	public BuilderEmployee setName(String name) {
		e.setName(name);
		return this;
	}
	
	public BuilderEmployee setSsn(String ssn) {
		e.setSsn(ssn);
		return this;
	}
	
	public BuilderEmployee setSalary(double salary) {
		e.setSalary(salary);
		return this;
	}
	
	public BuilderEmployee setGender(Gender gender) {
		e.setGender(gender);
		return this;
	}
	
	// Build method is created to return the object which is carrying the data of id, name  etc.
	/*we cannot return Base class's reference variable every time in above step so we created a build method
	   which will return that reference variable only once. */
	public Employee build() {
		return e;
	}
}
