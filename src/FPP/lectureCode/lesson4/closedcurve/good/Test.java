package FPP.lectureCode.lesson4.closedcurve.good;

public class Test {
	
	public static void main(String[] args) {
		String a;
	
		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}