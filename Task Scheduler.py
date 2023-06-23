GFG
Task Scheduler


class Solution:
    def leastInterval(self, N, K, tasks):
        # Code here
        cnt = [0] * 26
        for t in tasks:
            cnt[ord(t) - 65] += 1

        ma, c = 0, 0
        for i in range(26):
            if cnt[i] > ma:
                ma = cnt[i]
                c = 1
            elif cnt[i] == ma:
                c += 1

        return max((ma - 1) * (K + 1) + 1 + c - 1, N)


# {
