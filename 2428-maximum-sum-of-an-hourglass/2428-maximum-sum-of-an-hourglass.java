class Solution {
    public int maxSum(int[][] grid) {
        int maxSum=-1;
        
        for(int i=1;i<=grid.length-2;i++)
        {
            for(int j=1;j<=grid[0].length-2;j++)
            {
                int sum=grid[i][j] + grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}