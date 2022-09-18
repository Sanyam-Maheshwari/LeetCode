class Solution {
    public int[][] generateMatrix(int n) {
        int [][]ans=new int[n][n];
        int value=1;
        int top=0, left=0;
        int right=n-1;
        int bottom=n-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=value++;
                // System.out.println(value);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=value++;
                 // System.out.println(value);
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                ans[bottom][i]=value++;
                 // System.out.println(value);
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                ans[i][left]=value++;
                 // System.out.println(value);
            }
            left++;
        }
        return ans;
    }
}