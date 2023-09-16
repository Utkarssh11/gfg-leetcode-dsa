

Count number of hops

GFG

class Solution {
    // Function to count the number of ways in which the frog can reach the top.
    public long countWays(int n) {
        // Define an array to store the number of ways to reach each step.
        long[] dp = new long[n + 1];
        dp[0] = 1;
        long M = 1000000007;

        for (int i = 1; i <= n; i++) {
            dp[i] += dp[i - 1];
            if (i >= 2) {
                dp[i] += dp[i - 2];
            }
            if (i >= 3) {
                dp[i] += dp[i - 3];
            }
            dp[i] %= M;
        }

        return dp[n];
    }
}
