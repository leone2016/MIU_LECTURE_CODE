package FPP.lectureCode.lesson1.hello;

import java.util.Arrays;

/**
 * 
 * @author aochirbat
 *
 */

class FamGuarta{
	private String name;
	private int edad;

	public FamGuarta(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "FamGuarta{" +
				"name='" + name + '\'' +
				", edad=" + edad +
				'}';
	}
}
public class Hello {
/**
 * 
 * @param args is String array
 */
	public static void main(String[] args) {

		char c = 'l'; // codigo ascii
		int  d = c;

		System.out.println(c + "" +d);
		int i = 0;


		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr.length);

		String[] test = {"MANZANAS", "PERAS"};

		test = "Hola, Mundo".split(",");

		System.out.println(Arrays.toString(test));

		FamGuarta p = new FamGuarta("Lorena", 32);
		FamGuarta[] fam = {
				new FamGuarta("Lorena", 32),
				new FamGuarta("Maria", 65),
				new FamGuarta("Jpson", 30)
		};



	}
}

