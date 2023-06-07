GFG
Least Prime Factor




class Solution {
  public:
    vector<int> leastPrimeFactor(int n) {
        // code 

        vector<int> spf(n+1 , -1);
        spf[0] = 0;
        spf[1] =1 ;

        for(int i=2;i<=n;i++){
            if(spf[i] == -1){
                spf[i] = i;
                for(int j = i+i ; j <= n;j+=i){
                    if(spf[j] == -1)
                        spf[j] = i; 
                }
            }
        }

        return spf;
    }
};
