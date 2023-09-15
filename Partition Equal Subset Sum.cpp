Partition Equal Subset Sum

GFG
class Solution{
public:
    bool isSubsetSum(int n, int arr[], int sum){

        bool dp[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)    dp[i][j]= false;
                if(j==0)    dp[i][j]=true;
            }
        }
        for( int i=1; i<n+1; i++ ){
            for( int j=1; j<sum+1; j++ ){
                if( arr[i-1] <= j ){
                    dp[i][j] = dp[i-1][ j-arr[i-1] ] or dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    int equalPartition(int N, int arr[]){
        long int sum = 0;
        for( int i=0; i<N; i++ ){
            sum += arr[i];
        }
        if( sum%2==1 )  return 0;
        return isSubsetSum( N, arr, sum/2 );
    }
};
