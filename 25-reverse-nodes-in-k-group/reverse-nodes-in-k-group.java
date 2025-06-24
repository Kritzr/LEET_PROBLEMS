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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode grpprev = dummy;

        while(true){
            ListNode kth = getkth(grpprev,k);
            if(kth == null){
                break;
            }
            ListNode grpnext = kth.next;

            ListNode prev = kth.next;
            ListNode curr = grpprev.next;
            while(curr!= grpnext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = grpprev.next;
            grpprev.next = kth;
            grpprev = temp;
        }

        return dummy.next;
    }

    private ListNode getkth (ListNode curr, int k){
        while(curr!=null && k>0){
            curr= curr.next;
            k--;
        }
        return curr;
    }
}