GFG
Predecessor and Successor



// This function finds predecessor and successor of key in BST.
// It sets pre and suc as predecessor and successor respectively
class Solution
{
    public:
    void findPreSuc(Node* root, Node*& pre, Node*& suc, int key)
    {

        // 1. Base case
        if(root==NULL)
        return;

        // 2. Left call 
        findPreSuc(root->left,pre,suc,key);

        // n - 3. codition check
        if(root->key < key)
        pre = root; 

        if(root->key > key and suc == NULL )
        {
            suc = root;
        }

        // 4. right call
        findPreSuc(root->right,pre,suc,key);
    }
};
