package FPP.lectureCode.lesson10.setimpl;

import java.util.*;

public class TreeSetDemo {

	public static void main(String args[]) {
		// Create a tree set
//		TreeSet<String> ts = new TreeSet<String>();
//		// Add elements to the tree set
//		ts.add("C");
//		ts.add("A");
//		ts.add("B");
//		ts.add("E");
//		ts.add("F");
//		ts.add("D");
//		ts.add("B");
//		System.out.println(ts);
//		Iterator<String> iter = ts.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//
//		for (String str : ts) {
//			System.out.println(str);
//		}
//		
//		ts.forEach(e -> {			
//			System.out.print(e + " ");
//
//		});
		
		
		LinkedList<Integer> list1 = new LinkedList<>(List.of(1,2,3));
		LinkedList<Integer> list2 = new LinkedList<>(List.of(1,3,2));
//		System.out.println(list1.equals(list2));
		
		TreeSet<Integer> ts1 = new TreeSet<>(List.of(1,2,3));		
		TreeSet<Integer> ts2 = new TreeSet<>(List.of(1,3,1,3,2,8,7,9,8,10,100,2));
		System.out.println(ts2);
//		System.out.println(ts1.equals(ts2));
		
		HashSet<Integer> hs1 = new HashSet<>(List.of(1,2,3));		
		HashSet<Integer> hs2 = new HashSet<>(List.of(1,3,2,8,7,9,8,10,100));
		System.out.println(hs2);
//		System.out.println(hs1.equals(hs2));
		

	}
}
