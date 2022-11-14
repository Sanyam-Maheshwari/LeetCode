class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        int psum=0,csum=0;
        for(int n:nums){
            csum+=n;
            if(s.contains(csum%k))
                return true;
            csum=csum%k;
            s.add(psum);
            psum=csum;
        }
        return false;
    }
}