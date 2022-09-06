class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res=new int[2];
        Map map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            {
               return  new int[] {(int)map.get(complement),i};
            }
            else
            {
                map.put(nums[i],i);
            // result[1]=i;
            // result[0]=map.get(target-nums[i]);
            // return res;
            }
        }
        return null;
    }
}