GFG

Multiply two strings



class Solution{
  public:
    /*You are required to complete below function */
    string multiplyStrings(string a, string b) {

        int negative = 0;
        if(a[0]=='-'){
            negative++;
            a.erase(a.begin());
        } 
        if(b[0]=='-'){
            negative++;
            b.erase(b.begin());
        }

        int n = a.size();
        int m = b.size();

        vector<int> arr1(n, 0);
        vector<int> arr2(m, 0);
        vector<int> result(n+m, 0);

        //Reversing the String and Converting to Integer
        for(int i=0; i<n; i++) arr1[i] = a[n-i-1]-'0';
        for(int i=0; i<m; i++) arr2[i] = b[m-i-1]-'0';

        int power10 = 0;

        //Multiply arr1 with every digit of arr2:
        for(int i=0; i<m; i++){

            int digit = arr2[i], mulcarry = 0, digitval = 0, sumcarry = 0;

            for(int j=0; j<n; j++){

                int product = (digit*arr1[j]) + mulcarry;
                digitval = product%10;
                mulcarry = product/10;

                int ans = digitval + result[power10 + j] + sumcarry ;
                sumcarry = ans/10;
                result[power10+j] = ans%10;
            }

            if(mulcarry>0){
                int ans2 = result[power10+n] + mulcarry + sumcarry;
                sumcarry = ans2/10;
                result[power10+n] = ans2%10;
            }

            int idx = n;
            while(sumcarry>0){
                int ans3 = result[power10+idx] + sumcarry;
                sumcarry = sumcarry/10;
                result[power10+idx] = ans3%10;
                idx++;
            }

            power10++;
        }

        string finalans;
        int terminalzero = 1;
        for(int i=m+n-1; i>=0; i--){
            char c = result[i] + '0';
            if(result[i]!=0) terminalzero = 0;
            if(terminalzero==0) finalans.push_back(c);
        }

        if(finalans.size()==0) return "0";
        if(negative%2==1) finalans.insert(0,"-");
        return finalans;
    }

};
