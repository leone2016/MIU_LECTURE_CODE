package FPP.lectureCode.lesson5_innersort1;


public class Person{
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
//	@Override
//	public int compareTo(Person o) {
//		
//		return getName().compareTo(o.getName());
//	}
	
	
	
}
