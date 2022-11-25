class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> lis=new ArrayList();
        String []keys={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length()==0)
        {
            return lis;
        }
        combinations(lis, keys, digits, "");
        return lis;
    }
    public static void combinations(List<String> lis, String []keys, String ques, String ans)
    {
        if(ques.length()==0)
        {
            lis.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String letters=keys[ch-'0'];
        for(int i=0;i<letters.length();i++)
        {
            
            combinations(lis, keys, ques.substring(1), ans+letters.charAt(i));
        }
    }
}