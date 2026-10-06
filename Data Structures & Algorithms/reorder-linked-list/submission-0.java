/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode trav = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (trav != null) {
            ListNode temp = trav.next;
            trav.next = prev;
            prev = trav;
            trav = temp;
        }
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

    
            first.next = second;
            second.next = tmp1;

    
            first = tmp1;
            second = tmp2;

        }
    }
}
