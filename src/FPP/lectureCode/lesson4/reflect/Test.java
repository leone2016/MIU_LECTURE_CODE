package FPP.lectureCode.lesson4.reflect;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {      		
			System.out.printf("The area of this %s is %.2f \n", 
					cc.getClass().getSimpleName(), cc.computeArea());
			
		}

    
	}

}