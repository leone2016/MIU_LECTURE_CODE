package FPP.lectureCode.lesson4.inclass.protectedpractice_soln.nested;

import FPP.lectureCode.lesson4.inclass.protectedpractice_soln.MyClass;

public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		return cl.getVal();
	}
}
