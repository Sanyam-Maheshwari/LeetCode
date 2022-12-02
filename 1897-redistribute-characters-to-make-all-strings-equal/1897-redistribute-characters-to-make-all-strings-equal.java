class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map=new HashMap();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            {
            if(entry.getValue() % words.length!=0)
                return false;
        }
    // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
        // while(Integer i:map.values())
        // {
        //     if(i%3!=0)
        //         return false;
        // }
        return true;
    }
}