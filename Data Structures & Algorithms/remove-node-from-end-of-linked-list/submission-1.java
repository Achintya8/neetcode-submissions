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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }else if(head.next==null) return null;
        ListNode tmp = head;
        while(n>0){
            tmp=tmp.next;
            n--;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow = dummy;
        while(tmp!=null){
            tmp=tmp.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
