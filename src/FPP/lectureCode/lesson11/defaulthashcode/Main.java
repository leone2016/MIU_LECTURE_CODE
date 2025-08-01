package FPP.lectureCode.lesson11.defaulthashcode;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		System.out.println(p.toString());
		System.out.println(Integer.toHexString(p.hashCode()));
		System.out.println(p.hashCode());
		
		
		Person p1 = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		System.out.println(p1.toString());
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(p.equals(p1));
		
	}

}
