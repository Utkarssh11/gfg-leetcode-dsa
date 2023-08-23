GFG
Find the string in grid


class Solution {
public:
 const int dx[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
const int dy[8] = {-1, 0, 1, -1, 1, -1, 0, 1};

void dfs(vector<vector<char>>& grid, string &word, int &index, int row, int col, int q, bool &find){
    int m=grid.size();
    int n=grid[0].size();
    if(row>=m||row<0||col<0||col>=n)
    return;
    if(grid[row][col]==word[index])
    index++;
    else return;
    if(index==word.length()){
        find=true;
        return;
    }
    dfs(grid,word,index,row+dx[q],col+dy[q],q,find);
}
vector<vector<int>> searchWord(vector<vector<char>> grid, string word) {
      vector<vector<int>> ans;
    int m=grid.size();
    int n=grid[0].size();
    for(int i=0; i<m; ++i){
        for(int j=0; j<n; ++j){
            int index=0;
            if(grid[i][j]==word[index]){
                for(int k=0; k<8; ++k){
                    bool find=false;
                    index=0;
                    dfs(grid,word,index,i,j,k,find);
                    if(find){
                        ans.push_back({i,j});
                        break;
                    }
                }
            }
        }
    }
     return ans;
}
};
