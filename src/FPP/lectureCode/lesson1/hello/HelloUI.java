
package FPP.lectureCode.lesson1.hello;

import javax.swing.JOptionPane;
class Person {
	String name;
	Person(String name) {
		this.name = name;
	}
}


public class HelloUI {
	public static void main(String[] args) {

		Person p1 = new Person("Leo");
		System.out.println(p1);
	}
}
