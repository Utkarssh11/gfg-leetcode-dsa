GFG
Unique rows in boolean matrix

class Solution
{
    public:
    // #define MAX 1000
    vector<vector<int>> uniqueRow(int M[MAX][MAX],int row,int col)
    {
        //Your code here
         unordered_map<string,int> mm;
        vector<vector<int>> ans;
        for(int i=0;i<row;i++){
            string s="";
            vector<int> temp;
            for(int j=0;j<col;j++){
                s.push_back('0'+M[i][j]);
                temp.push_back(M[i][j]);
            }
            if(!mm[s]){
                mm[s]++;
                ans.push_back(temp);
            }
        }
        return ans;
    }
};
