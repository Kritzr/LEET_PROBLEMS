/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        std ::unordered_map<Node* ,Node* > hashMap;
        Node* curr = head ; 
        while(curr){
            hashMap[curr] = new Node(curr->val);
            curr = curr->next; 

        }
        curr = head; 
        while(curr){
            Node* copy = hashMap[curr];
            copy->next = hashMap[curr->next];
            copy->random = hashMap[curr->random];
            curr=curr->next;

        }

        return hashMap[head];
        
    }
};