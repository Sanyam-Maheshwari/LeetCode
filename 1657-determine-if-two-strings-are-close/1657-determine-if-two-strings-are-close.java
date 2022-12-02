class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        HashMap<Character, Integer> map1=new HashMap();
        for(int i=0;i<word1.length();i++)
        {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0)+1);
        }
        HashMap<Character, Integer> map2=new HashMap();
        for(int i=0;i<word2.length();i++)
        {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0)+1);
        }
        
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        for(Map.Entry<Character,Integer> entry:map1.entrySet())
        {
            l1.add(entry.getValue());
            if(!map2.containsKey(entry.getKey()))
                return false;
        }
        
        for(Map.Entry<Character,Integer> entry:map2.entrySet())
        {
            l2.add(entry.getValue());
            
        }
        Collections.sort(l1);
        System.out.println(l1);
        
        Collections.sort(l2);
        System.out.println(l2);
        return l1.equals(l2);
    }
}