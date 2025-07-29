package MPP.assignments.practice01.recursion;

public class SwapPairs {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: if the list is empty or has only one node
        }

        ListNode first = head;
        ListNode second = head.next;

        // Swap the first two nodes
        first.next = swapPairs(second.next);
        second.next = first;

        return second; // New head of the swapped pair
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode swappedHead = swapPairs(head);
        printList(swappedHead);
    }
}
