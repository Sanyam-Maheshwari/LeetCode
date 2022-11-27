class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean ans=ifPath(board, word, 0, i, j );
                    if(ans==true)
                        return true;
                }
            }
        }
        return false;
       
    }
    public static boolean ifPath(char [][]board, String word, int ind, int x, int y)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(x>=board.length || x<0 || y>=board[0].length || y<0 || board[x][y]!=word.charAt(ind))
        {
            return false;
        }
        int []movex={-1, 1, 0, 0};
        int []movey={0, 0, -1, 1};
        board[x][y]='*';
        for(int j=0;j<4;j++)
        {
            boolean ans=ifPath(board, word, ind+1, x+movex[j], y+movey[j]);
            if(ans==true)
            {
                return true;
            }
        }
        board[x][y]=word.charAt(ind);
        return false;
    }
}