package FPP.lectureCode.lesson2.charsandstrings;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char c = 'A';
		int unicodeVal = (int)c;  // this is in base 10
		String hexVal = Integer.toHexString(unicodeVal); //value = 41
		System.out.println(""+c + " "+ unicodeVal + " "+hexVal);
		//char c = '终';
		int unicodeVal1 = (int)c;  // this is in base 10
		String hexVal1 = Integer.toHexString(unicodeVal1); //value = 7ec8

//		int _a, $a, a1, A, a; 
//		int ө;
//		System.out.println(""+ (int)'Ө');
//		System.out.println((char)65); //transforms base 10 ascii code for 'A'
//		System.out.println('\u0041'); //prints unicode for 'A'
		//if this doesn't print correctly,
		//change window>preferences>workspace>text encoding
		//to UTF-8
		//System.out.println('\u7ec8');
		
//		System.out.println("\ud835\udd6b, \ud835\udd6b_\ud835\udd6b"); //'\ud835' and '\udd6b' by themselves are  illegal
//		System.out.println(Integer.toHexString((int)'终'));
//		System.out.println(Integer.toHexString(Character.toCodePoint('\ud835','\udd6b')));
		//System.out.println((int)'𝕫');
	}

}
