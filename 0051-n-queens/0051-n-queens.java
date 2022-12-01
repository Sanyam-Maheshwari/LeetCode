class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList();
        List<String> ans =new ArrayList();
        char board[][]=new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        // for(int i=0;i<board.length;i++)
        // {
            place(res, ans, board, n, 0);
        // }
        return res;
        
    }
    public void place(List<List<String>> res, List<String> ans, char [][]board, int n, int r)
    {
        if(n==0)
        {
            
            res.add(new ArrayList(prequire(board)));
            return;
        }
        for(int c=0;c<board.length;c++)
        {
            if(isPossible(board,r,c))
            {
                ans.add("Q");
                board[r][c]='Q';
                place(res, ans, board, n-1, r+1);
                board[r][c]='.';
                ans.remove(ans.size()-1);
            }
        }
        
    }
    public static List<String> prequire(char [][]board)
    {
       List<String> ans =new ArrayList();
        for(int i=0;i<board.length;i++)
        {
            String str="";
            for(int j=0;j<board.length;j++)
            {
                str+=board[i][j];
            }
            ans.add(str);
        }
        return ans;
    }
    public boolean isPossible(char [][]board, int r, int c)
    {
        int i=r;
        int j=c;
        while(i>=0)
        {
            if(board[i][j]=='Q')
                return false;
            i--;
        }
        
        i=r;
        j=c;
        while(j>=0  && i>=0)
        {
            if(board[i][j]=='Q')
                return false;
            j--;
            i--;
        }
        
        i=r;
        j=c;
        while(j<board.length  && i>=0)
        {
            if(board[i][j]=='Q')
                return false;
            j++;
            i--;
        }
        
        return true;
    }
}