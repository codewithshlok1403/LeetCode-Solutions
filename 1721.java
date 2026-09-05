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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode temp2 = head;
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        for (int i = 1; i <= size - k; i++) {
            temp2 = temp2.next;
        }
        int swap = temp.val;
        temp.val = temp2.val;
        temp2.val = swap;
        return head;
    }
}
