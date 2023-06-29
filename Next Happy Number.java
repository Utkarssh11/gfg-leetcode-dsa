GFG
Next Happy Number


  //{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution { 

     static int isHappy(int N) { 
        if (N == 1 || N == 7) 
            return 1; 
        int sum = N, x = N; 

        // this loop executes till the sum of square of 
        // digits obtained is not a single digit number 
        while(sum > 9) { 
            sum = 0; 

            // this loop finds the sum of square of digits 
            while (x > 0) { 
                int d = x%10; 
                sum += d*d; 
                x/=10; 
            } 
            if (sum == 1) 
                return 1; 
            x = sum; 
        } 
        if(sum == 7) 
            return 1; 
        return 0; 
    } 

    // function to find next happy number 
    static int nextHappy(int N)
    {   
        int x=N+1;
        int res=x;
        // check for every name
        while(true)
        {
            if(isHappy(x)==1)
                return x;
            x++;
            res=x;
        }
    }
}

  

