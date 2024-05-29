GFG
Problem Of The Day 30 May
JAVA SOLUTION


  

class Solution {
    public static int countWays(String s1, String s2) {
        int MOD = 1000000007;
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Base case: dp[i][0] = 1 for all i
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j] % MOD;
                }
            }
        }

        return dp[n][m];
    }
}

https://www.linkedin.com/in/utkarsh-patidar-800081221/
