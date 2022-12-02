class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet();
        HashSet<Integer> set2=new HashSet();
        for(int i:nums1)
        {            
                set1.add(i);
        }
        for(int i:nums2)
        {            
                set2.add(i);
        }
        List<Integer> list1=new ArrayList();
        List<Integer> list2=new ArrayList();
        for(Integer i:set1)
        {
            if(!set2.contains(i))
                list1.add(i);
        }
        for(Integer i:set2)
        {
            if(!set1.contains(i))
                list2.add(i);
        }
        List<List<Integer>> ans=new ArrayList();
        ans.add(list1);
        ans.add(list2);
        return ans;
        
        // HashMap<Integer, Integer> map1=new HashMap();
        // HashMap<Integer, Integer> map2=new HashMap();
        // for(int i=0;i<nums1.length;i++)
        // {            
        //         map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        // }
        // for(int i=0;i<nums2.length;i++)
        // {            
        //         map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        // }
        // List<Integer> list1=new ArrayList();
        // List<Integer> list2=new ArrayList();
        // for(Map.Entry<Integer,Integer> entry:map.entrySet())
        // {
        //     if(entry.getValue()==nums.length)
        //         list.add(entry.getKey());
        // }
        // Collections.sort(list);
        // return list;

    }
}