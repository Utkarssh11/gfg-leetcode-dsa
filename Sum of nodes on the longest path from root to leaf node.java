Sum of nodes on the longest path from root to leaf node

  GFG- Problem Of The Day

  
  C++

  
class Solution
{
public:
    int ans = 0, maxHeight = 0;
    void solve(Node* root, int heightOfTree, int sumOfNodes) {
        if(!root) return;
        if(!root->left && !root->right) {
            sumOfNodes += root->data;
            if(heightOfTree > maxHeight) {
                maxHeight = heightOfTree;
                ans = sumOfNodes;
            }
            else if(heightOfTree == maxHeight) {
                ans = max(sumOfNodes, ans);
            }
            return;
        }
        sumOfNodes += root->data;
        solve(root->left, heightOfTree+1, sumOfNodes);
        solve(root->right, heightOfTree+1, sumOfNodes);
        return;
    }
    int sumOfLongRootToLeafPath(Node *root)
    {
        solve(root,1,0);
        return ans;
    }
};
