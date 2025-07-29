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
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode current = new ListNode();
        current = head;
        ListNode last = new ListNode();
        last = null;
        int length = 1;
        while(current.next!=null){
            length++;
            current = current.next;
            
        }

        last = current;
        k%=length;
        int pointer = length - k ;
        if(k==0)
            return head;

        ListNode end = new ListNode();
        end  = head;

        for(int i =0; i<pointer-1; i++){
            end = end.next;
        }

        ListNode start = new ListNode();
        start = end.next; 
        end.next = null; 
        last.next = head;

        return start; 
        

    }
}