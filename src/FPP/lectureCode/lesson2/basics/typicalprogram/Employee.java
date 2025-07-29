package FPP.lectureCode.lesson2.basics.typicalprogram;

/**
 * Represents profile information for an Employee.
 * 
 * @author pcorazza
 */
public class Employee implements Comparable<Employee> {
	static final String IMPORTANT_FIRST = "Bob";
	static final String IMPORTANT_LAST =  "Jones";
	
	private String firstName;
	private String lastName;
	private int salary;
	private int christmasBonus;
	
	private Address home;
	private Address work;
	
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		
	}
	
	public Employee() { 
		this(IMPORTANT_FIRST, IMPORTANT_LAST);
	}
	
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + " " + lastName + " "+ salary+"]";
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * Sets the annual bonus for this Employee. 
	 * This amount is added to yearly salary.
	 * 
	 * @param amount double. The amount of the bonus
	 */
	public void setChristmasBonus(int amount) {
		christmasBonus = amount;
	}
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getWork() {
		return work;
	}
	public void setWork(Address work) {
		this.work = work;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	/**
	 * Computes the total salary of this Employee,
	 * including Christmas bonus.
	 * 
	 * @return Total salary for the year.
	 */
	public double computeTotalSalary() {
		return salary + christmasBonus;
	}
	
	@Override
	public int compareTo(Employee o) {		
		return -1*(this.salary - o.salary);
	}
	
}
