class Solution {
    public int calculate(String s) {
        int ans=0;
        int sign=1;
        int currNo=0;
        Stack<Integer> stk=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                currNo+=s.charAt(i)-'0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1)))
                {
                    currNo=currNo*10+(s.charAt(i+1)-'0');
                    i++;
                }
                currNo*=sign;
                ans+=currNo;
                currNo=0;
            }
            else if(s.charAt(i)=='+')
                sign=1;
            else if(s.charAt(i)=='-')
                sign=-1;
            else if(s.charAt(i)=='(')
            {
                stk.push(ans);
                stk.push(sign);
                ans=0;
                currNo=0;
                sign=1;
            }
            else if(s.charAt(i)==')')
            {
                int prevSign=stk.pop();
                ans*=prevSign;
                int prevAns=stk.pop();
                ans+=prevAns;
            }
            
        }
        return ans;
    }
}