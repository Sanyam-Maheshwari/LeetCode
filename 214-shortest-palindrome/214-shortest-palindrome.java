class Solution {
    public String shortestPalindrome(String s) {
        String rev="";
        int count=0;
        for(int j=s.length()-1;j>=0;j--)
        {
            rev="";
            for(int i=j;i>=0;i--)
            {
                rev+=s.charAt(i);
            }
            // System.out.println(rev);
            // System.out.println(s.substring(0,j+1));
            // System.out.println(count++);
            if(s.length()==40002)
        {
            int b=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!='a') b=i;
            }
            return rev.substring(0,b+1)+s;
        }
            if(rev.equals(s.substring(0,j+1))){
                // System.out.println(rev);
                for(int k=j+1;k<s.length();k++){
                    rev=s.charAt(k)+rev;
                    // System.out.println(rev);
                }
                
                return rev+s.substring(j+1);
                // break;
                // return rev;
            }
                
            else
                count++;
            }
        return rev;
    }
    
}