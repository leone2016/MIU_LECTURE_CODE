package FPP.lectureCode.lesson2.arrays;

public class Main {

	public static void main(String[] args) {
		 
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		
		//		int len = 0;
//		if(args != null) len = args.length;
//		for(int i = 0; i < len; ++i) {  
//		    System.out.println("position " + i + ": " + args[i]);
//		} 

		
	}
}
