package FPP.lectureCode.lesson2.stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
//		String str ="";
//		for(char c='a'; c<='z';c++)
//			str+=c;// str=str+c;
//		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for(char c='a'; c<='z';c++)
			sb.append(c);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.setCharAt(1, 'W');
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}

}
