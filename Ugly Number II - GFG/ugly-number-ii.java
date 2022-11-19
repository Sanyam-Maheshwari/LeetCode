//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      int ans = obj.uglyNumber(n);
      System.out.println(ans);
    }
  }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int uglyNumber(int n) {
    int arr[] =new int[n+1];
    int p2=1;
    int p3=1;
    int p5=1;
    arr[1]=1;
    for(int i=2;i<=n;i++)
    {
        int fn=2*arr[p2];
        int sn=3*arr[p3];
        int tn=5*arr[p5];
        int min=Math.min(fn, Math.min(sn, tn));
        arr[i]=min;
        if(fn==min)
            p2++;
        if(sn==min)
            p3++;
        if(tn==min)
            p5++;
    }
    return arr[n];

  }
}
     