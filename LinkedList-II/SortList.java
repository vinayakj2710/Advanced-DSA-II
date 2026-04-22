
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    public ListNode sortList(ListNode A) {
        //base condition
        if (A == null || A.next == null) {
            return A;
        }
        //Find the middle element 
        ListNode slow = A;
        ListNode fast = A.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //split LL into two 
        ListNode second_LL = slow.next;
        slow.next = null;

        //recursively call the two condition till we reach the base condition
        ListNode firstSorted = sortList(A);
        ListNode secondSorted = sortList(second_LL);

        return mergeTwoLists(firstSorted, secondSorted);
    }

    private ListNode mergeTwoLists(ListNode A, ListNode B) {
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
