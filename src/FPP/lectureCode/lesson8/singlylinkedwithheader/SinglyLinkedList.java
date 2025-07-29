package FPP.lectureCode.lesson8.singlylinkedwithheader;

public class SinglyLinkedList {
	Node header; // startNode

	boolean search(String s) {
		if (s == null)
			return false;

		Node next = header;
		while (next != null) {
			String t = next.data;
			if (s.equals(t)) {
				return true;
			}
			next = next.next;
		}
		return false;
	}

	void printNodes() {
		Node next = header;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	void addFirst(String s) {
		Node newNode = new Node();
		newNode.data = s;

		// link from newNode to current header.node
		newNode.next = header;

		// link from header to newNode
		header = newNode;
	}

	void addLast(String s) {
		Node newNode = new Node();
		newNode.data = s;
		if (header == null)
			header = newNode;
		else {
			Node last = header;
			while (last.next != null) {
				last = last.next;
			}
			// Collections
			// now last is the last non-null node
			last.next = newNode;
		}
	}

	void insert(String s, int pos) {
		int size = size();
		if (pos < 0 || pos > size) {
			throw new IllegalArgumentException("Illegal position for new node");
		}
		if (pos == size)
			addLast(s); // same as add(s);
		else if (pos == 0)
			addFirst(s);
		else {
			Node n = new Node();
			n.data = s;
			if (header == null)
				header = n;
			else {
				Node temp = header;
				int count = 0;
				while (count < pos-1) {
					temp = temp.next;
					count++;
				}
				// insert n between temp and temp.node
				Node last = temp.next;
				temp.next = n;
				n.next = last; // placing n into position pos
			}
		}
	}

	/** size = the number of non-null nodes */
	int size() {
		if (header == null)
			return 0;
		Node temp = header;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	void remove(String s) {
		if (s == null)
			return;

		if (header == null)
			return;		
		
		if(header.data.equals(s)) {
			header = header.next;
			return;
		}
		
		Node previous = header;
		Node next = header.next;
		
		while (next != null) {
			if (s.equals(next.data)) {
				previous.next = next.next;
				return;
			}
			previous = next;
			next = next.next;
		}
	}

	void removeRec(String s) {
		removeRec(s, header);
	}

	void removeRec(String s, Node n) {
		if (s == null)
			return;
		Node next = n.next;
		Node previous = n;
		if (n != null) {

			if (s.equals(previous.data)) {
				if (header == n)
					header = previous.next;
				else
					previous.next = next.next;
				return;
			}
			previous = next;
			next = next.next;
		}
		removeRec(s, n.next);
	}

	/** Implement as inner class */
	private class Node {
		String data;
		Node next;

		@Override
		public String toString() {
			if (data == null)
				return "";
			StringBuilder sb = new StringBuilder(data + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.data + " ");
			return toString(sb, n.next);
		}
	}

	public static void main(String[] args) {
		// String[] stringData = { "Albert", "Billy", "Charles", "David", "Emma" };
		SinglyLinkedList sll = new SinglyLinkedList();
		// sll.addLast("test");
		// populate
//		for (int i = stringData.length - 1; i >= 0; i--) {
//			sll.addFirst(stringData[i]);
//		}
//		boolean foundCharles = sll.search("Charles");
//		System.out.println("Found Charles? " + foundCharles);

		sll.printNodes();
		sll.addFirst("Frank");
		sll.addFirst("Bob");
//		 sll.remove("Frank");
//		sll.printNodes();
//		sll.addLast("Francesca");
//		sll.printNodes();
//		System.out.println(sll.size());
//		sll.insert("Bobby1", 1);
//		sll.printNodes();
//		sll.insert("Bobby2", sll.size());
//		sll.printNodes();
//		sll.insert("Bobby3", sll.size() - 1);
//		sll.printNodes();
//		sll.removeRec("Bobby1");
//		sll.printNodes();
	}

}
