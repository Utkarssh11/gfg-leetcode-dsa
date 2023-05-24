24May Maximum Identical Bowls



class Solution {
public:
    int getMaximum(int N, vector<int> &arr) 
    {
        long long int tot=0;
        for(auto x:arr)
        {
            tot+=x;
        }
        int n=N;

        for(int i=N;i>=1;i--)
        {
            if(tot%i==0)
            {
                return i;
            }
        }
        return 0;
    }
};
