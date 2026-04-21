
class MiddleElementOfList {

    static class ListNode {

        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int middleOfList(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public static void main(String args[]) {
        System.out.println("Middle element of a given LinkedList");

        MiddleElementOfList obj = new MiddleElementOfList();

        // 🔹 Test case 1: Even length list: 1 → 2 → 3 → 4 → 5 → 6
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);

        System.out.println("Middle (odd list): " + obj.middleOfList(head1));
        // Expected: 4 (N/2 + 1)

        // 🔹 Test case 2: Odd length list: 1 → 2 → 3 → 4 → 5
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Middle (even list): " + obj.middleOfList(head2));
        // Expected: 3 
    }
}
