Print adjacency list
GFG

class Solution {
public:
    // Function to return the adjacency list for each vertex.
    vector<vector<int>> printGraph(int n, vector<pair<int, int>> edges) {
        vector<vector<int>> ans(n);
        for (auto& edge : edges) {
            ans[edge.first].push_back(edge.second);
            ans[edge.second].push_back(edge.first);
        }
        return ans;
    }
};
