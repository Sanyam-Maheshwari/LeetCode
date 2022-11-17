class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int []ans=new int[n];
        
        int product=1;
        for(int i=0;i<n;i++)
        {
            product=product*nums[i];
            ans[i]=product;
        }
        
        product=1;
        for(int i=n-1;i>0;i--)
        {
            ans[i]=ans[i-1]*product;
            product*=nums[i];
            
        }
        ans[0]=product;
        // int product=1;
        // for(int i=n-1;i>0;i--)
        // {
        //     ans[i]=ans[i-1]*product;
        //     product=nums[i]*product;
        // }
        return ans;
        
//         int n=nums.length;
//         int []prefix =new int[n];
//         prefix[0]=nums[0];
//         for(int i=1;i<n;i++)
//         {
//             prefix[i]=prefix[i-1]*nums[i];
//         }
        
//         int []suffix = new int[n];
//         suffix[n-1]=nums[n-1];
//         for(int i=n-2;i>=0;i--)
//         {
//             suffix[i]=suffix[i+1]*nums[i];
//         }
        
//         int []ans =new int[n];
//         ans[0]=suffix[1];
//         ans[n-1]=prefix[n-2];
//         for(int i=1;i<n-1;i++)
//         {
//             ans[i]=prefix[i-1]*suffix[i+1];
//         }
//         return ans;
    }
}