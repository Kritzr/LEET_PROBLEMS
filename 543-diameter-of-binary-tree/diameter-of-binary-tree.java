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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result= new int[1];
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode root, int[] result){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left, result);
        int right = dfs(root.right, result);
        result[0] = Math.max(result[0], left+right);
        return 1+ Math.max(left,right);

    }
}