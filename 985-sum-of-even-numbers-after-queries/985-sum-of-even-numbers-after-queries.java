class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int []ans=new int[queries.length];
        int count=0;
        int csum=0;
        for(int i=0;i<nums.length;i++)
            {
                    
            if(nums[i]%2==0)
                {
                    csum+=nums[i];
                }
            }
        for(int j=0;j<queries.length;j++)
        {
            int res=nums[queries[j][1]]+queries[j][0];
            if(res%2==0)
            {
                if(nums[queries[j][1]]%2==0)
                    csum=csum-nums[queries[j][1]]+res;
                else
                    csum=csum+res;
            }
            else{
                if(nums[queries[j][1]]%2==0)
                    csum=csum-nums[queries[j][1]];
            }
            nums[queries[j][1]]=res;
            ans[count++]=csum;
        }
        return ans;
    }
}