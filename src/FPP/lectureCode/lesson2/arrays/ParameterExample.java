package FPP.lectureCode.lesson2.arrays;

class ParameterExample {
	public static void main(String[] args) {
		int len = 0;
		if(args != null) len = args.length;
		for(int i = 0; i < len; ++i) {  
		    System.out.println("position " + i + ": " + args[i]);
		} 
	}
}

