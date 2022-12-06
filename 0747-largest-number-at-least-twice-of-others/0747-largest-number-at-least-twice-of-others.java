class Solution {
    public int dominantIndex(int[] nums) {
        //Get the max value
        int max = nums[0];
        int n = nums.length;
        int maxIndex = 0;
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
        }
        
        //Check if any of the number except the biggest is more than half of the value
        // is found, if yes return -1, otherwise return index of the max number 
        for(int i:nums){
            if(i!=max){
                if(i*2>max)
                    return -1;
            }
        }
        return maxIndex;
    }
}