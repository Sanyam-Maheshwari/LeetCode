//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int k) 
	{ 
        
         int n=nums.length;
         if(n==1)
         {
            long []ans={1};
            return ans;
         }
        long []prefix =new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
        }
        
        long []suffix = new long[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*nums[i];
        }
        
        long []ans =new long[n];
        ans[0]=suffix[1];
        ans[n-1]=prefix[n-2];
        for(int i=1;i<n-1;i++)
        {
            ans[i]=prefix[i-1]*suffix[i+1];
        }
        return ans;
	} 
} 
