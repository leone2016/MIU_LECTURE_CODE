package FPP.lectureCode.lesson4.closedcurve.good;

abstract public class ClosedCurve {
	ClosedCurve(){
		
	}
	
	int x ; 
	
	void display() {
		System.out.println("");
	}
	
	abstract double computeArea();

}
