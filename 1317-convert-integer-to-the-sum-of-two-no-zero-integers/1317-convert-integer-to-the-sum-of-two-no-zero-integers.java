class Solution {
    public int[] getNoZeroIntegers(int n) {
        int []arr=new int[2];
        for(int i=1;i<=n/2;i++)
        {
            if(isNoZero(i) && isNoZero(n-i))
            {
                arr[0]=i;
                arr[1]=n-i;
                return arr;
            }
        }
        return arr;
    }
    public static boolean isNoZero(int n)
    {
        while(n!=0)
        {
            int r=n%10;
            if(r==0)
                return false;
            n/=10;
        }
        return true;
    }
}