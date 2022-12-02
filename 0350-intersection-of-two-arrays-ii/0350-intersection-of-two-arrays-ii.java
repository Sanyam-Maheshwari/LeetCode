class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int si1=0;
        int si2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList();
        while(si1<nums1.length && si2<nums2.length)
        {
            if(nums1[si1]==nums2[si2])
            {
                list.add(nums1[si1]);
                si1++;
                si2++;
            }
            else if(nums1[si1]<nums2[si2])
            {

                si1++;

            }
            else
            {
                si2++;

            }
        }
        int []ans=new int[list.size()];
        int i=0;
        for(int j:list)
        {
            ans[i++]=j;
        }
        return ans;
    }
}