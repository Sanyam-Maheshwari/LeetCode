class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []copy=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        HashMap<Integer, Integer> map=new HashMap();
        for(int i:copy)
        {
            map.putIfAbsent(i,map.size());
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i])+1;
        }
        return arr;
    }
}