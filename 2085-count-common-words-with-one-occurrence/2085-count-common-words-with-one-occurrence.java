class Solution {
    public int countWords(String[] words1, String[] words2) {
         HashMap<String, Integer> map1=new HashMap();
        HashMap<String, Integer> map2=new HashMap();
        for(String s:words1)
        {
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:words2)
        {
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) 
        {
            if(entry.getValue()==1)
            {
                if(map2.containsKey(entry.getKey()))
                {
                    if(map2.get(entry.getKey())==1)
                        count++;
                }
            }
            // if(entry.getValue()==1)
            // {
            //     count++;
            // }
        }
        // String []ans=new String[count];
        // int i=0;
        // for (Map.Entry<String, Integer> entry : map.entrySet()) 
        // {
        //     if(entry.getValue()==1)
        //     {
        //         ans[i++]=entry.getKey();
        //     }
        // }
        return count;
    }
}