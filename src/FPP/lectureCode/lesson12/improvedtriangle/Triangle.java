package FPP.lectureCode.lesson12.improvedtriangle;

import java.util.logging.Logger;

//import java.util.Arrays;
	public class Triangle {
		double base;
		double height;
		double side1;
		double side2;
		double side3;
		Logger log = Logger.getLogger("FPP.lectureCode.lesson12.improvedtriangle");
		//easy way of doing it
		public Triangle(double base, double height){
			this.base = base;
			this.height = height;
		}
		
		//constructor that accepts 3 sides and computes the base and height
		//always assumes the longest side is the base
		public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
			double[] arr = sort(side1,side2,side3);		
			double x = arr[0];
			double y = arr[1];
			double z = arr[2];
			if(x + y < z) {
				log.warning("Illegal sides passed into Triangle constructor");
				
				
				throw new IllegalTriangleException("The three sides do not form a triangle");
				/*
				System.out.println("Illegal sizes for a triangle: "+side1+", "+side2+", "+side3);
				System.out.println("Using default sizes.");
				setSides(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
				computeBaseAndHeight(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
				*/
			}
				
			setSides(x,y,z);
			computeBaseAndHeight(x,y,z);
			
		}
		public void setSides(double x, double y, double z){
			side1 = x;
			side2 = y;
			side3 = z;
		}
		//used with the side-side-side constructor
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
			//System.out.println("Sorted: "+Arrays.toString(retVal));
			return retVal;
		}
		public static void main(String[] args){
				Triangle t= null;
				try {
					t = new Triangle(1.41421, 1.41421, 2);
					t.computeArea();
				}
				catch(IllegalTriangleException e) {
					System.out.println("Uh-oh");
					//present a message to the user
				}
				
				
		}


		private final double DEFAULT_SIDE = 5.0;
}
