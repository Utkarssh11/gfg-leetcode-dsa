GFG
Ticket Counter




class Solution {
  public:
    int distributeTicket(int N, int K) {
        bool start = true;
        int i=1,j=N;

        while(j - i > K){
            if(start) i += K;
            else j -= K;

            start = !start;
        }

        if(start) return j;
        return i;
    }
};
