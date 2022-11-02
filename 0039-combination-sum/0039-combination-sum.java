class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList();
        List<Integer> ans=new ArrayList();
          combinations(candidates, target, result, 0, ans);
        return result;
    }
    public static void combinations(int []candidates, int target, List<List<Integer>> result, int index, List<Integer> ans)
    {
        if(target==0)
        {
            result.add(new ArrayList(ans));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(target>=candidates[i])
            {
                ans.add(candidates[i]);
                combinations(candidates, target-candidates[i], result, i, ans);
                ans.remove(ans.size()-1);
            }
        }
    }
}