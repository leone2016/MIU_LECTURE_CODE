package FPP.lectureCode.lesson2.stringcompareto;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String[] names = {"Steve", "Joe", "Alice", "Tom"};
		//sorts the array in place
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		String a = "hi";
		String b = "yes";
		String c = a + b;
		String d = "Hi".toLowerCase();
		
		
		System.out.println(c == "hiyes");//false
		System.out.println(c == "hiyes");//false
	}

}
