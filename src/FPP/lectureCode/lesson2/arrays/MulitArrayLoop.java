package FPP.lectureCode.lesson2.arrays;

import java.util.Arrays;

public class MulitArrayLoop {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int[] el: arr) {
			for(int ele: el) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}		
		
		System.out.println(Arrays.toString(arr));
	}
}
