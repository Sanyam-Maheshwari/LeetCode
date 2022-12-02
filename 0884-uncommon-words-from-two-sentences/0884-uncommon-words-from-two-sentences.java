class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map=new HashMap();
        String []sa1=s1.split(" ");
        String []sa2=s2.split(" ");
        for(String s:sa1)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:sa2)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue()==1)
            {
                count++;
            }
        }
        String []ans=new String[count];
        int i=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue()==1)
            {
                ans[i++]=entry.getKey();
            }
        }
        // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        return ans;
    }
}