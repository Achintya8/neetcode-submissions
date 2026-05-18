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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode left = list1;
        ListNode right = list2;
        ListNode tmp = dummy;
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }else if(list1==null && list2==null){
            return null;
        }
        while (left != null && right != null) {
            if (left.val <= right.val) {
                tmp.next = left;
                left = left.next;
            } else {
                tmp.next = right;
                right = right.next;
            }
            tmp = tmp.next;
            if (left == null) {
                tmp.next = right;
            } else if (right == null) {
                tmp.next = left;
            }
        }

        return dummy.next;
    }
}