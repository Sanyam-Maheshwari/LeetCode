class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int pairs=0;
        int left=0;
        int arr[]=new int[nums.length];
        int j=0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet())
        {
            arr[j++]=entry.getValue();
            // pairs+=(entry.getValue()/2);
            // if(entry.getValue()%2==0)
            // {
            //     map.remove(entry.getKey());
            // }
            // else
            // {
            //     map.put(entry.getKey(),entry.getValue()%2);
            // }
        }
        for(int i=0;i<arr.length;i++)
        {
            pairs+=arr[i]/2;
            arr[i]%=2;
        }
        for(int i:arr)
        {
            left+=i;
        }
        int ans[]=new int[2];
        ans[0]=pairs;
        ans[1]=left;
        return ans;
    }
}