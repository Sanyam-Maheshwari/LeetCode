import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String r = 'r' + "-" + i + "-" + board[i][j];
                    String c = 'c' + "-" + j + "-" + board[i][j];
                    String rc = (i / 3) + "-" + board[i][j] + "-" + (j / 3);
                    if (!hs.add(r) || !hs.add(c) || !hs.add(rc)) 
                        return false;

                }
            }
        }
        return true;
    }
}