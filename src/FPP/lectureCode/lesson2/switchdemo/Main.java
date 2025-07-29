package FPP.lectureCode.lesson2.switchdemo;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
//		stringSample();
//		intSample();
		switchExpression();
		
	}
	
	public static void stringSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type one of the strings 'Apple', 'Cherry', 'Papaya' ");
		String val = sc.next();
		sc.close();
		System.out.println();
		
		switch(val) {			
			case "Apple": 			//int, byte,short,enum, String, char , Integer,Byte, Short, Character 
				System.out.println("'Apple' starts with 'A'.");
				break;
			default:
				System.out.println("Bad selection.");	
				//break;
			case "Cherry": 
				System.out.println("'Cherry' starts with 'C'");
				break;
			case "Papaya": System.out.println("'Papaya' starts with 'P'");
				break;			
			
		}	
	}
	
	public static void intSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick an integer in the range 1..9 ");
		int val = sc.nextInt();
		System.out.println();
		switch(val) {
			case 2:
			case 4:
			case 6:
			case 8: 
				System.out.println("You chose an even number.");
				break;
			default:
				System.out.println("You chose an odd number.");
		}	

	}
	
	public static void switchExpression() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number:");
		int val = sc.nextInt();	
		sc.close();
		val%=10;		
		switch(val) {
			case 0, 2, 4, 6, 8 -> System.out.println("You chose an even number.");			
			default -> System.out.println("You chose an odd number.");
		};
	}

}
