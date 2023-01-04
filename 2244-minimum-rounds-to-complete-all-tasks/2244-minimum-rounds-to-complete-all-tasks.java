// class Solution {
//     public int minimumRounds(int[] tasks) {
//         HashMap<Integer,Integer> set=new HashMap<>();
//         for(int i:tasks)
//         {
//             set.put(i,set.getOrDefault(i,0)+1);
//         }
//         int rounds=0;
//         for(int freq:set.values())
//         {
            
//             if(freq%2!=0 && freq%3!=0 && freq%5!=0)
//                 return -1;
//             if(freq%5==0)
//             {
//                 while(freq>=5)
//                 {
//                     freq-=5;
//                     rounds+=2;
//                 }
//             }
//             if(freq%4==0 )
//             {
//                 return rounds+2;
//             }
//             else if(freq%3==0)
//             {
//                 return rounds+1;
//             }
//             else if(freq%2==0)
//             {
//                 return rounds+1;
//             }
//             else
//             {
//                 return -1;
//             }
//             // if(freq%2==0)
//             // {
//             //     while(freq>=0)
//             //     {
//             //         freq-=2;
//             //         rounds+=1;
//             //     }
//             // }
//             // if(freq%2==0)
//             // {
//             //     while(freq>=0)
//             //     {
//             //         freq-=2;
//             //         rounds+=1;
//             //     }
//             // }
//         }
//         return -1;
//     }
// }

class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap();
        // Store the frequencies in the map.
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        int minimumRounds = 0;
        // Iterate over the task's frequencies.
        for (int count : freq.values()) {
            // If the frequency is 1, it's not possible to complete tasks.
            if (count == 1) {
                return - 1;
            }

            if (count % 3 == 0) {
                // Group all the task in triplets.
                minimumRounds += count / 3;
            } else {
                // If count % 3 = 1; (count / 3 - 1) groups of triplets and 2 pairs.
                // If count % 3 = 2; (count / 3) groups of triplets and 1 pair.
                minimumRounds += count / 3 + 1;
            }
        }

        return minimumRounds;
    }
}