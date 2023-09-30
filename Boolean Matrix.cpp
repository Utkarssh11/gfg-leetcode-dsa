GFG

class Solution
{   
    public:
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int> > &matrix)
    {
       unordered_set<int> row, col;
       int m = matrix.size(), n = matrix[0].size();
       for(int i = 0; i<m; i++) {
           for(int j = 0; j<n; j++) {
               if(matrix[i][j]) {
                   row.insert(i);
                   col.insert(j);
               }
           }
       }
       for(auto &i : row) {
           for(int j = 0; j<n; j++) 
                matrix[i][j] = 1;
       }
       for(auto &j : col) {
           for(int i = 0; i<m; i++)
                matrix[i][j] = 1;
       }
    }
};
