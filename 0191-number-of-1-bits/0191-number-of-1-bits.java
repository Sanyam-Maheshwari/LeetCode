public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        System.out.println(n);
        int count=0;
        while(n!=0)
        {
            if((n & 1)==1)
                count++;
                // System.out.print(r+" ");
            
            n=n>>>1;
            // if(r==1)
            //     count++;
            // n=n/10;
        }
        return count;
    }
}