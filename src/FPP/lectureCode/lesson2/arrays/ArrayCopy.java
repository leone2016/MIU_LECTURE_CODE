package FPP.lectureCode.lesson2.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] smallPrimes = { 7, 11, 5, 2, 3};
		int[] smallPrimesCopy = Arrays.copyOf(smallPrimes, smallPrimes.length);
		
		System.out.println(smallPrimes == smallPrimesCopy);
		System.out.println(Arrays.equals(smallPrimes, smallPrimesCopy));
		System.out.println(smallPrimesCopy);
		System.out.println(Arrays.toString(smallPrimesCopy));
		
//		int[] firstThree = Arrays.copyOf(smallPrimes, 3);
//		System.out.println(Arrays.toString(firstThree));	//output:  {7, 11, 5}
//		
//		int[] luckyNums = {350, 400, 150, 200, 250};
//		System.arraycopy(smallPrimes, 1, luckyNums, 3, 2);
//		System.out.println(Arrays.toString(luckyNums));   //luckyNums is now [350, 400, 150, 11, 5]

	    //sorting
	    Arrays.sort(smallPrimes);
	    System.out.println(Arrays.toString(smallPrimes)); 
	}

}
