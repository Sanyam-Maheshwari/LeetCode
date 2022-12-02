class Solution {
    public int findLucky(int[] arr) {
        int []freq=new int[501];
        for(int i:arr)
        {
            freq[i]+=1;
        }
        for(int i=freq.length-1;i>0;i--)
        {
            if(freq[i]==i)
                return i;
        }
        return -1;
    }
}