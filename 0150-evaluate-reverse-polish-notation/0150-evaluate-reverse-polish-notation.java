class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack();
        // for(int i=0;i<tokens.length;i++)
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
            {
                stk.push(Integer.parseInt(s));
            }
                
            }
            
//             if(tokens[i]!="+" || tokens[i]!="-" || tokens[i]!="*" || tokens[i]!="/")
//             {
//                 stk.push(Integer.parseInt(tokens[i]));
//             }
           
//             else
//             { 
//                 String sign=tokens[i];
//                 int b=stk.pop();
//                 int a=stk.pop();
//                 if(sign=="+")
//                 {
//                     stk.push(a+b);
//                 }
//                 if(sign=="-")
//                 {
//                     stk.push(a-b);
//                 }
//                 if(sign=="*")
//                 {
//                     stk.push(a*b);
//                 }
//                 if(sign=="/")
//                 {
//                     stk.push(a/b);
//                 }
                
//             }
        return stk.pop();
    }
}