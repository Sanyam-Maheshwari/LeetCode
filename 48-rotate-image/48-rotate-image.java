class Solution {
    public void rotate(int[][] matrix) {
        int c=matrix[0].length;
        int r=matrix.length;
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++)
        {
            int start=0;
            int end=r-1;
            while(start<end)
            {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }
    
}