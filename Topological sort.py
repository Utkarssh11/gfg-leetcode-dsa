GFG
Topological sort

class Solution:
    def dfs(self, adj, v, marked):
        marked[v] = 1
        for w in adj[v]:
            if marked[w] == 0:
                self.dfs(adj, w, marked)
        self.post.append(v)

    # Function to return list containing vertices in Topological order.
    def topoSort(self, V, adj):
        # Code here
        self.post = []
        marked = [0] * V
        for v in range(V):
            if marked[v] == 0:
                self.dfs(adj, v, marked)

        return list(reversed(self.post))


# {
