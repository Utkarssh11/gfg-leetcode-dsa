GFG
Santa Banta


# User function Template for python3
from collections import deque


class Solution:
    def precompute(self):
        # Complete the function
        self.primes = []
        MAX = 1000005
        p = [1] * MAX
        for i in range(2, MAX):
            if p[i]:
                self.primes.append(i)
                for j in range(i * i, MAX, i):
                    p[j] = 0

    def helpSanta(self, n, m, g):
        # Complete the function
        if m == 0:
            return -1
        ans = 0
        marked = [0] * (n + 1)
        for i in range(1, n + 1):
            if marked[i] == 0:
                total = 0
                q = deque()
                q.append(i)
                marked[i] = 1
                while q:
                    v = q.popleft()
                    total += 1
                    for w in g[v]:
                        if marked[w] == 0:
                            q.append(w)
                            marked[w] = 1

                ans = max(ans, total)

        return self.primes[ans - 1]


# {
