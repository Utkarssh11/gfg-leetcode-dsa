GFG


import heapq


class Solution:
    def maxDiamonds(self, A, N, K):
        # code here
        ans = 0
        pq = []
        for a in A:
            heapq.heappush(pq, -a)

        for _ in range(K):
            d = heapq.heappop(pq)
            ans += -d
            d = -(-d // 2)
            heapq.heappush(pq, d)

        return ans


# {
