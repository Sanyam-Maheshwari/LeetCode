class Solution {
    public boolean squareIsWhite(String s) {
        if(((s.charAt(0)-'a')%2==0 && (s.charAt(1)-'a')%2!=0) || ((s.charAt(0)-'a')%2!=0 && (s.charAt(1)-'a')%2==0))
        {
            return true;
        }
        return false;
    }
}