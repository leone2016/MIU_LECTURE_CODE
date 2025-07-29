package FPP.lectureCode.lesson4.comparable;

import java.time.LocalDate;
import java.util.Arrays;


class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	private LocalDate hireDay;
	// constructor
	Employee(String aName, int aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear,  aMonth, aDay);
	}
	Employee(String aName, int aSalary, LocalDate d) {
		name = aName;
		salary = aSalary;
		hireDay = d;
	}

	// instance methods
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += Math.round(raise);
	}
	
	@Override
	public String toString() {
		return name + " " + salary  + " " + hireDay.getYear() + " "+hireDay.getMonth();
	}

	@Override
	public int compareTo(Employee e) {
//		if(getSalary() > e.getSalary()) return 1;
//		else if(getSalary() < e.getSalary()) return -1;
//		else { //getSalary() == e.getSalary()
//			return 0;
//		}
		//return this.getHireDay().getYear()-e.getHireDay().getYear();
		if(this.getHireDay().getYear()>e.getHireDay().getYear()) return 1;
		else if(this.getHireDay().getYear()< e.getHireDay().getYear())return -1;
		else {
			if(this.getHireDay().getMonthValue() > e.getHireDay().getMonthValue())
				return 1;
			else if(this.getHireDay().getMonthValue() < e.getHireDay().getMonthValue())
				return -1;
			else 
				return 0;
		}
	}
	
	public static void main(String[] args) {
		Employee[] empArray = {new Employee("Bob", 200000, LocalDate.of(2009, 5, 5)),
				new Employee("Dave", 100000, 2011, 6, 5),
				new Employee("Tim", 150000, 2011, 5, 7) 
		};
//		Comparator<Employee> comp= (a,b)->{return a.name.compareTo(b.name);};
//		System.out.println(comp);
		Arrays.sort(empArray);
		
		System.out.println(Arrays.toString(empArray));
		Employee e = new Employee("Dave", 100000, 2011, 6, 5);
		System.out.println(Arrays.toString(empArray));
	}

}
	
	
	

