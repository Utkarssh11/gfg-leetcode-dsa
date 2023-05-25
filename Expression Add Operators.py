#User function Template for python3
GFG |Expression Add Operators

class Solution:
    def solve(self, k, n, prev, val, curr):
        if k == n:
            if val == self.target:
                self.ans.append(curr)
                return

        ns = ""
        num = 0
        for i in range(k, n):
            if i > k and self.s[k] == "0":
                return
            ns += self.s[i]
            num = num * 10 + int(self.s[i])
            self.solve(i + 1, n, num, val + num, curr + "+" + ns)
            self.solve(i + 1, n, -num, val - num, curr + "-" + ns)
            self.solve(i + 1, n, prev * num, val - prev + prev * num, curr + "*" + ns)

    def addOperators(self, S, target):
        # Code here
        self.target = target
        self.s = S
        self.ans = []
        n = len(S)
        for i in range(1, n + 1):
            num = int(S[0:i])
            self.solve(i, n, num, num, S[0:i])
        return self.ans


# {
