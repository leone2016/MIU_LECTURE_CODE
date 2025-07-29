package FPP.lectureCode.lesson4.protectedex.try4.objrefpkg;

import FPP.lectureCode.lesson4.protectedex.try4.superpkg.SuperClass;

public class ObjRefClass extends SuperClass {
	//override the protected method in SuperClass 
	public String getVal() {
		return "val obj";
	}
}
