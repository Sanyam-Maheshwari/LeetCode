class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0)
            return 0;
        Stack<Integer> stk=new Stack();
        int currNo=0;
        int ans=0;
        char sign='+';
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                    currNo=currNo*10+(s.charAt(i)-'0');
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' || i==s.length()-1)
               {
                   if(sign=='+')
                   {
                       stk.push(currNo);
                   }
                   else if(sign=='-')
                   {
                       stk.push(-currNo);
                   }
                   else if(sign=='*')
                   {
                       stk.push(stk.pop()*currNo);
                   }
                    else if(sign=='/')
                   {
                       stk.push(stk.pop()/currNo);
                   }
                   sign=s.charAt(i);  
                   currNo=0; 
                   
               }
        }
               while(!stk.isEmpty())
               {
                   ans+=stk.pop();
               }
               return ans;
    }
}