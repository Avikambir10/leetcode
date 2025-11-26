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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. Find length and tail
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // 2. Make it circular
        tail.next = head;

        // 3. Effective rotation
        k = k % len;
        int stepsToNewHead = len - k;

        // 4. Move to new tail
        while (stepsToNewHead-- > 0) {
            tail = tail.next;
        }

        // 5. New head is next of tail
        head = tail.next;
        tail.next = null; // break the circle

        return head;
    }
}
