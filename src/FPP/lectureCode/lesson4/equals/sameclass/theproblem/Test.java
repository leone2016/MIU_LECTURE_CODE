package FPP.lectureCode.lesson4.equals.sameclass.theproblem;



public class Test {

	public static void main(String[] args) {
		PersonWithJob joe1 = new PersonWithJob("Joe", 50000);
//		PersonWithJob joe2 = new PersonWithJob("Joe", 50000);
		PersonWithJob joe2 = new PersonWithJobWithCounter("Joe", 50000);
		System.out.println(joe1.equals(joe2)); // value is false since joe2 is not of same type as joe1
		System.out.println(joe2.equals(joe1));
//		
//		Person p2 = new Person("Joe");
//		Person p1 = new Person("Joe");
//		
//		System.out.println(p1.equals(p2));
//		System.out.println(p2.equals(p1));
//		
//		System.out.println(p1.equals(joe1)); // value is false since joe2 is not of same type as joe1
//		System.out.println(joe1.equals(p1));
	}
}
