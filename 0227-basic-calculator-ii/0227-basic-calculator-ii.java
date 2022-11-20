class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0)
            return 0;
        int currNo=0;
        int ans=0;
        char sign='+';
        int last=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                currNo+=(s.charAt(i)-'0');
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1)))
                {
                    currNo=currNo*10+(s.charAt(i+1)-'0');
                    i++;
                }
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' || i==s.length()-1)
               {
                   if(sign=='+')
                   {
                       ans+=last;
                       last=currNo;
                   }
                   else if(sign=='-')
                   {
                       ans+=last;
                       last=-currNo;
                   }
                   else if(sign=='*')
                   {
                       last=last*currNo;
                   }
                    else if(sign=='/')
                   {
                       last=last/currNo;
                   }
                   sign=s.charAt(i);  
                   currNo=0; 
                   
               }
        }
               ans+=last;
               return ans;
    }
}