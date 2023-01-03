class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int col=0;col<strs[0].length();col++)
        {
            for(int s=0;s<strs.length-1;s++)
            {
                if(strs[s].charAt(col) > strs[s+1].charAt(col))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}