class Solution {
    public String reverseWords(String s) {
        int start=0;
        int count=0;
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(count==0)
                {
                    rev=reverse(s.substring(start,i));
                    start=i+1;
                    count++;
                }
                else
                {
                    rev=rev+" "+reverse(s.substring(start,i));
                    start=i+1;
                }
            }
            else if(i==s.length()-1)
            {
                // rev=rev+" "+reverse(s.substring(start,i+1));
                // start=i+1;
                if(count==0)
                {
                    rev=reverse(s.substring(start,i+1));
                    start=i+1;
                    count++;
                }
                else
                {
                    rev=rev+" "+reverse(s.substring(start,i+1));
                    start=i+1;
                }
            }
        }
        return rev;
    }
    public static String reverse(String str)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            ans=str.charAt(i)+ans;
        }
        return ans;
    }
}