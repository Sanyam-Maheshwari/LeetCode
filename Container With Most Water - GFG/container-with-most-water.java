//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int height[], int len){
        len=height.length;
        int l=0;
        int r=len-1;
        int max=0;
        int curr=0;
        while(l<=r)
        {
            curr=Math.min(height[l], height[r])*(r-l);
            max=Math.max(max,curr);
            if(height[l] < height[r])
            {
                l++;
            }
            else r--;
        }
        return max;
        
    }
    
}