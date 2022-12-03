class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1=reverse(num);
        return reverse(r1)==num;
    }
    public static int reverse(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int r=n%10;
            ans=ans*10+r;
            n/=10;
        }
        return ans;
    }
}