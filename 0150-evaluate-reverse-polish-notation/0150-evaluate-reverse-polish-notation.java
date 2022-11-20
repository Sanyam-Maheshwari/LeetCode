class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stk=new Stack();
    for(String s:tokens)
    {       
            if(s.equals("+"))
            {
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a+b);
            }
            else if(s.equals("-"))
            {
                int b=stk.pop();
                int a=stk.pop();
                stk.push((a-b));
            }
            else if(s.equals("*"))
            {
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a*b);
            }
            else if(s.equals("/"))
            {
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a/b);
            }
            else
                stk.push(Integer.parseInt(s));   
        }
        return stk.pop();
    }
}