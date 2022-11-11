class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start=0;
        // int i=1;
        for(int i=1;i<=nums.length-1;i++)
        {
            if(nums[start]!=nums[i])
            {
                nums[++start]=nums[i];
            }
        }
        return start+1;
    }
}