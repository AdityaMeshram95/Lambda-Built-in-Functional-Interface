package LambdaBuildInFunctionalInterface;

//First we have to create a class on which we are going to apply builder pattern.
public class Employee { // Base class
	//instance variable
	private int id;
	private String ssn;
	private String name;
	private double salary;
	private Gender gender;
	
	// Setter getter method.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ssn=" + ssn + ", name=" + name + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	
	public void printSummary() {
		System.out.println("BuilderPatternExample [id=" + id + ", ssn=" + ssn + ", name=" + name + ", salary=" + salary
				+ ", gender=" + gender + "]");
	}
	
	
}
