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
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;
        //the chumma node to get the previous node of the node that i want to delete

        while(n>0){
            right = right.next;
            n--;
        }
        //shift right wiht the offset of the n

        while(right!=null){
            left = left.next;
            right = right.next;
        }

        //shifing of both pointers
        
        left.next = left.next.next;
        return dummy.next;
        //deletion of th enth node, and returning of the updated list 
    }
}