
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                tail.next = A;
                A = A.next;
            } else {
                tail.next = B;
                B = B.next;
            }
            tail = tail.next;
        }

        if (A != null) {
            tail.next = A;
        } else {
            tail.next = B;
        }
        return dummy.next;
    }
}
