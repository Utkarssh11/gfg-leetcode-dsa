GFG
Delete middle element of a stack


class Solution
{
    public:
    //Function to delete middle element of a stack.
    void deleteMid(stack<int>&s, int size)
    {
        // code here.. 
        
        stack<int>temp;
        int count = size/2;
        
        while(count--){
            temp.push(s.top());
            s.pop();
        };
        
        s.pop();
        
        while(temp.size()){
            s.push(temp.top());
            temp.pop();
        }
        
    }
};
