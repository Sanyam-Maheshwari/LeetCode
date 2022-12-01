class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(isSumeven(i)){
                // System.out.println(i);
                count++;
            }
        }
        return count;
    }
    public static boolean isSumeven(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum%2==0;
    }
}