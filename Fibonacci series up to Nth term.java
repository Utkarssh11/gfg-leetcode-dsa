Problem Of The Day

23 March
JAVA SOL.
Fibonacci series up to Nth term



  class Solution {

    int[] Series(int n) {
        // code here
        int ans[]= new int[n+1];
        ans[0]= 0;
        int mod= (int) (1e9+7);
        if(n>=1) ans[1]=1;
        for(int i=2 ;i<=n ;i++){
            ans[i]= (ans[i-1] + ans[i-2]);
            ans[i]= ans[i] % mod;
        }
        return ans;
    }
}
