Level order traversal in spiral form

GFG


vector<int> findSpiral(Node *root)
{
    //Your code here
    vector<int> ans;
    queue<Node*> q;
    q.push(root);
    bool b=true;
    while(q.size()){
        int s=q.size();
        vector<int> level;
        for(int i=0;i<s;i++){
            Node *temp = q.front();
            q.pop();
            level.push_back(temp->data);
            if(temp->left)q.push(temp->left);
            if(temp->right)q.push(temp->right);
        }
        if(b==true)reverse(level.begin(),level.end());
        for(auto x:level)ans.push_back(x);
        b=!b;
    }
    return ans;
}
