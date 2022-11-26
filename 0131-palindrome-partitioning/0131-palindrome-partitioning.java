class Solution {
//     public List<List<String>> partition(String s) {
        
//     }
    public static List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        palipart(res, ans, s);
        return res;
    }
    public static void palipart(List<List<String>> res, List<String> ans, String ques)
    {
        if(ques.length()==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String part=ques.substring(0,i);
            if(isPalindrome(part)) {
//                soln=soln+ques.substring(0, i);
                ans.add(ques.substring(0, i));
                palipart(res, ans, ques.substring(i));  //+ ques.substring(0, i)
                ans.remove(ans.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str)
    {
        int l=0;int r=str.length()-1;
        while (l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}