class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = head;
        ListNode slow = dummy; // slow starts at dummy, not head
        
        // Move fast pointer n steps ahead
        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        
        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // slow.next is the node to be deleted
        slow.next = slow.next.next;
        
        // Return dummy.next because the original head might have been deleted
        return dummy.next;
    }
}