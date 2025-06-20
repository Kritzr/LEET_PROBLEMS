/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> old = new HashMap<>();
        old.put(null,null);
        //map for the copying

        Node curr = head;
        while(curr!=null){
            Node copy = new Node(curr.val);
            old.put(curr,copy);
            curr = curr.next;
        }
        // we are traversing, copying and cloning the list, putting it in the map  -> first pass
        curr = head;
        while(curr!=null){
            Node copy = old.get(curr);
            copy.next = old.get(curr.next);
            copy.random = old.get(curr.random);
            curr = curr.next;
        }

        // second pass to assign and connect the pointers

        return old.get(head);
    }
}