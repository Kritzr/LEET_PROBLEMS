// Definition for a binary tree node.
class TreeNode {
    int val;        // value of the node
    TreeNode left;  // left child
    TreeNode right; // right child

    // Constructor to create a new node with no children
    TreeNode() {}

    // Constructor to create a new node with a specified value
    TreeNode(int val) {
        this.val = val;
    }

    // Constructor to create a new node with a specified value and specified left and right children
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are empty, they are the same.
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;

        // Recursively check if the left subtree of both trees are the same 
        // AND the right subtree of both trees are the same.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}