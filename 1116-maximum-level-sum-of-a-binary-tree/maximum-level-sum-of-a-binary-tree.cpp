/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxLevelSum(TreeNode* root) {
        std::vector<std::vector<int>> result;
        int sum=0;
        if(!root){
            return 0;
        }

        std::queue<TreeNode*> q;
        q.push(root);

        int max =INT_MIN;
        int maxlevel = 1;
        int currentlevel=1;


        while(!q.empty()){
            int levelsize = q.size();
            long long sum=0;
            //std::vector<int> currentlevel;
            for(int i=0; i<levelsize; i++){
                TreeNode* current =q.front();
                q.pop();
                //cuurentlevel.push_back(current->val);
                sum+=current->val;
                if(current->left){
                    q.push(current->left);

                }
                if(current->right){
                    q.push(current->right);
                }
            }
            if(sum>max){
                max=sum;
                maxlevel =currentlevel; 
            }
            currentlevel++;
            //result.push_back(currentlevel);
        }
        return maxlevel;
    }
};