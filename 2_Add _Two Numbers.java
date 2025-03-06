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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head node to simplify list construction
        // Initial value 0 won't be part of the final result
        ListNode res = new ListNode(0);
        
        // Pointer to track the current position in the result list
        ListNode ptr = res;
        
        // Variable to store carry-over from addition (0 or 1)
        int carry = 0;

        // Continue while there are digits to process in either list
        while (l1 != null || l2 != null) {
            // Start sum with the carry from the previous addition
            int sum = 0 + carry;

            // If l1 has a digit, add it to sum and move to next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            // If l2 has a digit, add it to sum and move to next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate new carry (1 if sum >= 10, 0 otherwise)
            carry = sum / 10;
            
            // Get the current digit (ones place of sum)
            sum = sum % 10;
            
            // Create a new node with the current digit and link it
            ptr.next = new ListNode(sum);
            
            // Move pointer to the newly added node
            ptr = ptr.next;
        }

        // If there's a remaining carry after the loop, add it as a new node
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }

        // Return the result list, skipping the dummy head
        return res.next;
    }
}
