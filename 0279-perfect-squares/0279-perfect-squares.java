class Solution {
    public int numSquares(int n) {
     int []dp=new int[n+1];
      Arrays.fill(dp, -1);
	// dp[0] = 0;  
        return helper(n,dp);
    }
    public static int helper(int n, int []dp)
    {
        if(n==0)
        {
            return 0;
        }
        if( dp[n] != -1)
        {
            return dp[n];
        }
        int mincount=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int res=1+helper(n-i*i, dp);
            mincount=Math.min(res, mincount);
            
        }
        return dp[n]=mincount;
    }
    
}