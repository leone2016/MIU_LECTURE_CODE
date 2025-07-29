package FPP.lectureCode.lesson4.protectedex.try1.callingpkg;

import FPP.lectureCode.lesson4.protectedex.try1.objrefpkg.ObjRefClass;
import FPP.lectureCode.lesson4.protectedex.try1.superpkg.SuperClass;

public class CallingClass {
	public void methodCall(ObjRefClass cl){
		//obj ref class type is not same as or subclass
		//of CallingClass, and CallingClass is in diff
		//package from SuperClass -- compiler error
		ObjRefClass c1 = new ObjRefClass();
		SuperClass c2 = new SuperClass();
		//String s1 = cl.getVal(); -- compiler error
		//String s2 = c2.getVal(); -- compiler error
		
		
	}
}
