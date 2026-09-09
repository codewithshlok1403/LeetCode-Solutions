/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *    ListNode (int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode d1 = new ListNode(-1);
        ListNode t = d1;
        ListNode t1 = head1;
        ListNode t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                t.next = t1;
                t = t.next;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            t.next = t1;
        } else if (t2 != null) {
            t.next = t2;
        }
        return d1.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int n = lists.length;
        while (n > 1) {
            ListNode a = lists[n - 1];
            ListNode b = lists[n - 2];
            ListNode c = merge(a, b);
            lists[n - 2] = c;
            n = n - 1;

        }
        return lists[0];

    }
}
