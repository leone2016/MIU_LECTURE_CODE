package FPP.lectureCode.lesson4.inclass.protectedpractice.nested;

import FPP.lectureCode.lesson4.inclass.protectedpractice.MyClass;

//inside secondpackage
public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		//return cl.getVal(); //produces a compiler error -- how to fix?
		return null;
	}
}


