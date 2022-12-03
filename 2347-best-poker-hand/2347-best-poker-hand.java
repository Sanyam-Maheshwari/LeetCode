class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> maprank=new HashMap();
        for(int i:ranks)
        {
            maprank.put(i,maprank.getOrDefault(i,0)+1);
        }
        HashMap<Character, Integer> mapsuit=new HashMap();
        for(char c:suits)
        {
            mapsuit.put(c,mapsuit.getOrDefault(c,0)+1);
        }
        if(mapsuit.containsValue(5))
            return "Flush";
        if(maprank.containsValue(3)||maprank.containsValue(4)||maprank.containsValue(5))
            return "Three of a Kind";
        if(maprank.containsValue(2))
            return "Pair";
        return "High Card";
    }
}