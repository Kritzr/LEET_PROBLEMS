/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);

    }

    private int dfs(TreeNode node, int maxvalue){
        if(node==null){
            return 0;

        }
        int result = (node.val>=maxvalue)?1:0;
        maxvalue = Math.max(maxvalue,node.val);
        result+=dfs(node.left, maxvalue);
        result+=dfs(node.right,maxvalue);
        return result;
    }
}