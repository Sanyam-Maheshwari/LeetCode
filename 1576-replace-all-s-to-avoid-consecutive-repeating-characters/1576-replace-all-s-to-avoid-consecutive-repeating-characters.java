class Solution {
    public String modifyString(String s) {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='?')
            {
                for(int j=0;j<26;j++)
                {
                    if(isPossible(s, i, j))
                    {
                        s=s.substring(0,i)+(char)(j+'a')+s.substring(i+1);
                        break;
                    }
                }
            }
        }
        return s;
    }
    public static boolean isPossible(String s, int i, int j)
    {
        if(s.length()<=1)
            return true;
        else if(i==0)
        {
            if(s.charAt(i+1)!=(char)(j+'a'))
                return true;
        }
        else if(i==s.length()-1)
        {
            if(s.charAt(i-1)!=(char)(j+'a'))
                return true;
        }
        else if(s.charAt(i+1)!=(char)(j+'a') && s.charAt(i-1)!=(char)(j+'a') )
                return true;
        else return false;
        return false;
        }
        
    
}