GFG

Stock buy and sell II

from typing import List


class Solution:
    def stockBuyAndSell(self, n: int, prices: List[int]) -> int:
        # code here
        ans = 0
        prev = prices[0]
        for i in range(1, n):
            if prices[i] > prev:
                ans += prices[i] - prev
            prev = prices[i]

        return ans


# {
