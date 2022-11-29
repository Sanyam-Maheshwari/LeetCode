class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap();
        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i: nums)
        {
            int rev=reverse(i);
            System.out.print(rev+" ");
            // map.put(i, map.getOrDefault(i,0)+1);
            if(map.containsKey(rev))
            {
                map.put(rev, map.get(rev)+1);
            }
            else{
                map.put(rev,1);
            }
        }
        
//         Iterator <Integer> it = map.keySet().iterator();       //keyset is a method  
// while(it.hasNext())  
// {  
// int key=(int)it.next();  
//  int rev=reverse(key);
//     map.put(rev, 1);
// }    
//          for (Integer n : map.keySet())
//          {
//              int rev=reverse(map.getKey(n));
//              map.put(rev,1);
//              // map.put(i, getOrDefault(i,0)+1);
        
//             // if (lossesCount.get(player) == 0) {
//             //     answer.get(0).add(player);
//             // } else if (lossesCount.get(player) == 1) {
//             //     answer.get(1).add(player);
//             // }
//          }
        // System.out.println(map);
        return map.size();
    }
    public static int reverse(int n)
    {
        int ans=0;
        while(n>0)
        {
            int r=n%10;
            ans=ans*10+r;
            n/=10;
        }
        return ans;
    }
}