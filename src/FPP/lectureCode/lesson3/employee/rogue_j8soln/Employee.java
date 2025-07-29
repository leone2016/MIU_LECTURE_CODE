package FPP.lectureCode.lesson3.employee.rogue_j8soln;

import java.time.LocalDate;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;
	Employee(){}
	// constructor
	Employee(String aName, String aNickName, double aSalary, int aYear,
			int aMonth, int aDay) {
		name = aName;
		nickName = aNickName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}

	//Problem solved using a LocalDate instead of Date and GregorianCalendar
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	//From Advanced Employee example
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", nickName=" + nickName + ", salary=" + salary + ", hireDay=" + hireDay
				+ "]";
	}
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e);
	}
}
