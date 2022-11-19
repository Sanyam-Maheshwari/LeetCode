class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        int digits=0;
        long z=n;
        // while(z>0)
        // {
        //     z/=10;
        //     digits++;
        // }
        long sumofdigits=0;
        
        z=n;
        while(z>0)
        {
            long rem=z%10;
            z/=10;
            sumofdigits+=rem;
        }
        long ans=0;
        z=n;
        int p=0;
        while(sumofdigits>target)
        {
            long rem=z%10;
            if(rem==0)
            {
                p++;
                z/=10;
            }
            else{
            z+=10-rem;
            n=z;
            sumofdigits=0;
            while(n>0)
            {
                sumofdigits+=(n%10);
                n/=10;
            }
            ans=ans+(10-rem)*(long)Math.pow(10,p);
            // z++;
            // sumofdigits-=rem+1;
            // sumofdigits+=rem;
            }
        }
        return ans;
        }
    }