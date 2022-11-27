class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> ans=new ArrayList();
        Arrays.sort(candidates);
        combinations(res, ans, candidates, target, 0);
        return res;
    }
    public static void combinations(List<List<Integer>> res, List<Integer> ans, int[] candidates, int target, int ind)
    {
        if(target==0)
        {
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind && candidates[i]==candidates[i-1])
            {
                continue;
            }
            // boolean flag=false;
            // for(int j=i+1;j<candidates.length;j++)
            // {
            //     if(candidates[i]==candidates[j])
            //     {
            //         flag=true;
            //     }
            // }
            // if(flag==false)
            // {
            if(target-candidates[i]>=0)
                {
                    ans.add(candidates[i]);
                    combinations(res, ans, candidates, target-candidates[i], i+1);
                    ans.remove(ans.size()-1);
                }
            // }
        }
    }
}


// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> result=new ArrayList();
//         List<Integer> ans=new ArrayList();
//           combinations(candidates, target, result, 0, ans);
//         return result;
//     }
//     public static void combinations(int []candidates, int target, List<List<Integer>> result, int index, List<Integer> ans)
//     {
//         if(target==0)
//         {
//             result.add(new ArrayList(ans));
//             return;
//         }
//         for(int i=index;i<candidates.length;i++)
//         {
//             if(target>=candidates[i])
//             {
//                 ans.add(candidates[i]);
//                 combinations(candidates, target-candidates[i], result, i+1, ans);
//                 ans.remove(ans.size()-1);
//             }
//         }
//     }
// }