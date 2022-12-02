class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet();
        for(int i:nums1)
        {
            set1.add(i);
        }
        HashSet<Integer> set2=new HashSet();
        for(int i:nums2)
        {
            set2.add(i);
        }
        int count=0;
        for(Integer i:set1)
        {
            if(set2.contains(i))
                count++;
        }
        int []ans=new int[count];
        int i=0;
        for(Integer j:set1)
        {
            if(set2.contains(j))
                ans[i++]=j;
        }
        return ans;
    }
}