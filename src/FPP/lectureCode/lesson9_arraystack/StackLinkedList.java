package FPP.lectureCode.lesson9_arraystack;

import java.util.LinkedList;

public class StackLinkedList {
	private LinkedList<Integer> ll = new LinkedList<>();
	
	
	public void push(Integer x) {
		ll.addFirst(x);
	}
	
	public Integer peek() {
		return ll.get(0);
	}
	
	public Integer pop() {
		Integer t = peek();
		ll.remove(0);
		return t;
	}
	
	
	@Override
	public String toString() {
		return ll.toString();
	}

	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		stack.push(5);
		stack.push(15);
		stack.push(25);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}
