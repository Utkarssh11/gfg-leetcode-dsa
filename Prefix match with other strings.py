GFG
Prefix match with other strings

# User function Template for python3


class TrieNode:
    def __init__(self):
        self.children = [None for _ in range(26)]
        self.count = 0


class Solution:
    def klengthpref(self, arr, n, k, s):
        # return list of words(str) found in the board
        if len(s) < k:
            return 0
        root = TrieNode()

        for a in arr:
            p = root
            for c in a:
                d = ord(c) - ord("a")
                if p.children[d] is None:
                    p.children[d] = TrieNode()
                p = p.children[d]
                p.count += 1

        p = root
        for i in range(k):
            d = ord(s[i]) - ord("a")
            if p.children[d] is None:
                return 0
            p = p.children[d]

        return p.count


# {
# Driver Code Starts
# Initial Template for Python 3
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        n = int(input())
        arr = []
        for x in range(n):
            s1 = input()
            arr.append(s1)
        k = int(input())
        s = input()
        obj = Solution()
        print(obj.klengthpref(arr, n, k, s))


# } Driver Code Ends
