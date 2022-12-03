class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num%10 == 0 && num!=0)   return false;
        return true;
        // int r1=reverse(num);
        // return reverse(r1)==num;
    }
    // public static int reverse(int n)
    // {
    //     int ans=0;
    //     while(n!=0)
    //     {
    //         int r=n%10;
    //         ans=ans*10+r;
    //         n/=10;
    //     }
    //     return ans;
    // }
}