class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        generateParenthesis(list,n,0,0,"");
        return list;
    }
    public static void generateParenthesis(ArrayList<String> list, int n, int open, int close, String ans){
        if(open==n && close==n){
            list.add(ans); return;
        }
        if(open<n)
        {
            generateParenthesis(list, n,open+1,close,ans+"(");
        }
        if(close<open)
        {
            generateParenthesis(list,n,open, close+1, ans+")");
        }
    }
}