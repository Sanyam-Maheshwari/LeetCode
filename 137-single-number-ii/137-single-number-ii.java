class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap();
        for(int i:nums)
        {
            if(hmap.containsKey(i))
                hmap.put(i,hmap.get(i)+1);
            else
                hmap.put(i,1);
        }
        for (Integer i: hmap.keySet())  
        {  
             // System.out.println(i+" "+hmap.get(i)+"->");
            if(hmap.get(i)==1){ 
                // System.out.println(i);
                return i;
            }
        }
        return 0;
    }
}