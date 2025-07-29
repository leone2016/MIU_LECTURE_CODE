package FPP.lectureCode.lesson2.textblock;

public class TextBlock {

	public static void main(String[] args) {
		String color1 = "red\nblue\ngreen\n";
		String color2 = """
				red
				blue
				green
				""";
		
		System.out.println(color2);
		System.out.println(color1);
		System.out.println(color1.equals(color2));
		System.out.println(color1 == color2);

	}

}
