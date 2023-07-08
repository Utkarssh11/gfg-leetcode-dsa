GFG
Find triplets with zero sum




class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
         Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k){
                int temp=arr[i]+arr[j]+arr[k];
                if(temp==0)return true;
                else if(temp<0)j++;
                else k--;
            }
        }
        return false;
    }
}
