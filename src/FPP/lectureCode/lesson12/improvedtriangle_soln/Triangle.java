package FPP.lectureCode.lesson12.improvedtriangle_soln;

import java.util.Arrays;
import java.util.logging.Logger;

public class Triangle {
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	protected Logger log = Logger.getLogger("FPP.lectureCode.lesson12.improvedtriangle_soln");
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		double[] arr = sort(side1,side2,side3);		
		double x = arr[0];
		double y = arr[1];
		double z = arr[2];
		if(x + y < z) {
			throw new IllegalTriangleException ("Illegal sizes for a triangle: "+side1+", "+side2+", "+side3);
			//System.out.println("Illegal sizes for a triangle: "+side1+", "+side2+", "+side3);
			//System.out.println("Using default sizes.");
			//setValues(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
			//computeBaseAndHeight(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
		}
		else {	
			setValues(x,y,z);
			computeBaseAndHeight(x,y,z);
		}
	}
	public void setValues(double x, double y, double z){
		side1 = x;
		side2 = y;
		side3 = z;
	}
	private void computeBaseAndHeight(double x, double y, double z){
		double u = (y*y - x*x + z*z)/(2*z);
		double h = Math.sqrt(y*y - u*u);
		base = z;
		height = h;		
	}
	double computeArea() {
		return (0.5 * base * height);
	}
	private double[] sort(double a, double b, double c){
		double[] retVal = new double[3];
		double[] others = new double[2];
		double min = a;
		others = new double[]{b,c};
		
		
		if(b < min) {
			min = b;
			others = new double[]{a,c};
		}
		
		if(c < min) {
			min = c;
			others = new double[]{a,b};
		}
		retVal[0]= min;
		if(others[0]> others[1])
			others= new double[]{others[1],others[0]};
		
		retVal[1]=others[0];
		retVal[2]=others[1];
		System.out.println("Sorted: "+Arrays.toString(retVal));
		return retVal;
	}
	public static void main(String[] args){
		try{
			Triangle t = new Triangle(1.41421, 1.41421, 2);
			System.out.println("Area: "+t.computeArea());
			Triangle t2=new Triangle(1,1,4);
		}
		catch(IllegalTriangleException e){
			System.out.println(e.getMessage());
		}
			
		
			
	}
	public int getNumberOfSides(){
		return 3;
	}
	public double computePerimeter(){
		return side1+side2+side3;
	}

	private final double DEFAULT_SIDE = 5.0;

}
