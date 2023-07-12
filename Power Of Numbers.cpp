GFG
Power Of Numbers



class Solution{

    public:

    //You need to complete this fucntion




    long long power(int N,int R)

    {

       long long ans = 1;

       int mod = 1e9 + 7;




       while(R){

           if(R&1) ans = (ans*N) % mod;




           N = (N* 1LL * N) % mod;

           R = R>>1;

       }




       return ans;

    }




};
