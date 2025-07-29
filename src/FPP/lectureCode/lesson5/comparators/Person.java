package FPP.lectureCode.lesson5.comparators;

import java.util.Arrays;

public class Person implements Comparable<Person> {
	private String name;

	public Person(String n) {
		name = n;
	}
	public String getName() {
			return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		Person p1 =new Person("Bob");
		Person p2 =new Person("Smith");
		Person p3 =new Person("John");
		
		Person arr[] = new Person[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		//int intArr[] = {4,0,5} ;
		//Arrays.sort(intArr);
		//System.out.println(Arrays.toString(intArr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	@Override
	public int compareTo(Person o) {		
		return this.getName().compareTo(o.getName());
	}
}
