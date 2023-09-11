Lucky Numbers
GFG

  class Solution {
    public static boolean isLucky(int n) {
        int k = 2;
        while (k <= n) {
            if (n % k == 0) {
                return false;
            }
            n -= n / k;
            k++;
        }

        return true;
    }
}
