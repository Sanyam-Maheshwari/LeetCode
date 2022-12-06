class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet();
        for(int i:nums)
        {
            set.add(i);
        }
        while(set.contains(original))
        {
            // set.remove(original);
                    original*=2;
                    // set.add(original);
        }
        return original;
    }
}