class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> numbers=new ArrayList();
        for(int i=1;i<n;i++)
        {
            fact*=i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans="";
        k=k-1;
        while(true)
        {
            ans+=numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0)
            {
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        return ans;
    }
}


// class Solution {
//     public String getPermutation(int n, int k) {
//         String str="";
//         for (int i = 1; i <= n; i++) {
//             str=str+i;

//         }
//         permutations(str, "");

//     }
//     public static void permutations(String ques, String ans)
//     {
//         if(ques.length()==0)
//         {
//             System.out.println(ans);
//             return;
//         }
//         for (int i = 0; i < ques.length(); i++) {
//             char ch=ques.charAt(i);
//             permutations(ques.substring(0,i)+ques.substring(i+1),ans+ch);
//         }
//     }
// }