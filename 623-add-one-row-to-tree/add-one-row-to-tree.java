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
    /*
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth ==1){
            TreeNode new_root = new TreeNode(val);
            new_root.left = root;
            return new_root;
        }

        dfs(root,val,1,depth);
        return root;
    }

    public void dfs(TreeNode node, int val, int current, int depth){
        if(node==null){
            return ;
        }
        if(current == depth-1){
            TreeNode temp_left = node.left;
            TreeNode temp_right = node.right;
            node.left = new TreeNode(val);
            node.left.left = temp_left;
            node.right = new TreeNode(val);
            node.right.right = temp_right;

        }
        else{
            dfs(node.left, val, current+1,depth );
            dfs(node.right,val,current+1, depth);
        }
        

    }
    

    */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth ==1){
            TreeNode new_root = new TreeNode(val);
            new_root.left = root; 
            return new_root;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int current = 1;
        while(!queue.isEmpty() && current<depth-1){
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            current++;
        }

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp_left = node.left;
            TreeNode temp_right = node.right;
            node.left = new TreeNode(val);
            node.left.left = temp_left;
            node.right = new TreeNode(val);
            node.right.right = temp_right;
        }
        return root;


    }
}