package MPP.assignments.lab3.PracticeLab3.src.prob1;


import java.util.Arrays;

public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	public static void main(String[] args) {
		
	}

	/*@Override
	public int hashCode() {
		return this.name.hashCode();
	}*/

}
