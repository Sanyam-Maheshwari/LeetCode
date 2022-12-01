class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet();
        int temp=n;
        int sumOfSquares=n;
        while(sumOfSquares!=1)
        {
            temp=sumOfSquares;
            sumOfSquares=0;
            while(temp!=0)
            {
                int r=temp%10;
                sumOfSquares+=(r*r);     //Math.pow(r,2);
                temp/=10;
            }
            // System.out.println(sumOfSquares);
            if(set.contains(sumOfSquares))
                return false;
            set.add(sumOfSquares);
            // if(sumOfSquares==1)
            // {
            //     return true;
            // }
        }
        return true;
    }
}