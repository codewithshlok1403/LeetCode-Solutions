/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *    ListNode  next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = head;
        ListNode b = head.next;
        ListNode d = new ListNode(-1);
        ListNode t = d;
        while (a != null && b != null) {
            t.next = b;
            a.next = b.next;
            b.next = a;
            t = a;
            a = a.next;
            if (a != null)
                b = a.next;
        }
        return d.next;
    }
}
