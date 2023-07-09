GFG

Smallest Positive missing number




class Solution
{
    public:
    //Function that puts all non-positive (0 and negative) numbers on left 
    //side of arr[] and return count of such numbers.
    int segregateArr (int arr[], int n) 
    { 
    	int j = 0, i; 
    	for(i = 0; i < n; i++) 
    	{ 
    	    if(arr[i] <= 0) 
    	    { 
    	        //changing the position of negative numbers and 0.
    	        swap(arr[i], arr[j]); 
    	        //incrementing count of non-positive integers.
    	        j++; 
    		} 
    	}
    	return j; 
    } 

    //Finding the smallest positive missing number in an array 
    //that contains only positive integers.
    int findMissingPositive(int arr[], int n)
    {

        //marking arr[i] as visited by making arr[arr[i]-1] negative. 
        //note that 1 is subtracted because indexing starts from 0 and 
        //positive numbers start from 1.
        for(int i=0; i<n; i++) 
        {
    	    if(abs(arr[i]) - 1 < n && arr[ abs(arr[i]) - 1] > 0) 
    	    arr[ abs(arr[i]) - 1] = -arr[ abs(arr[i]) - 1]; 
        } 

        for(int i=0; i<n; i++)
        {
            if (arr[i] > 0)
            {
                //returning the first index where value is positive. 
                // 1 is added because indexing starts from 0. 
    	        return i+1; 
            }
        }
        return n+1; 
    } 

    //Function to find the smallest positive number missing from the array.
    int missingNumber(int arr[], int n) 
    { 
        //first separating positive and negative numbers. 
        int shift = segregateArr(arr, n); 

        //shifting the array to access only positive part.
        //calling function to find result and returning it.
        return findMissingPositive(arr+shift, n-shift); 
    } 
};
