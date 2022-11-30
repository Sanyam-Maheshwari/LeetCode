class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        
        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j-1].charAt(i)>strs[j].charAt(i))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
        
        // for(int i=1;i<strs.length;i++)
        // {
        //     for(int j=0;j<strs[i].length();j++)
        //     {
        //         if(strs[i-1].charAt(j)>strs[i].charAt(j))
        //         {
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;
    }
}