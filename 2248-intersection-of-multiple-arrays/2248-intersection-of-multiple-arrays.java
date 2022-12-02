class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        List<Integer> list=new ArrayList();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==nums.length)
                list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
        // int []ans=new int[list.size()];
        // int i=0;
        // for(Integer j:list)
        //     ans[i++]=j;
        // return ans;
    }
}