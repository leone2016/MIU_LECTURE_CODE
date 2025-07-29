package FPP.lectureCode.lesson8.consisequals_contains;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee("Joe", 1999, 10, 2);
		Employee e4 = new Employee("Joe", 1999, 10, 2);


		List<Employee> list = new ArrayList<>();
		list.add(e1);
		System.out.println("Does e2 belong to the list? " + list.contains(e4));

	}

}
