class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean [] visited= new boolean[nums.length];
        List<List<Integer>> res=new ArrayList();
        List<Integer> ans=new ArrayList();
        perm(nums, visited,0, ans, res);
        return res;
    }
    public static void perm(int [] nums, boolean []visited, int taken, List<Integer> ans, List<List<Integer>> res)
    {
        if(taken==nums.length)
        {
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==false)
            {
                visited[i]=true;
                ans.add(nums[i]);
                perm(nums, visited,taken+1, ans, res);
                visited[i]=false;
                ans.remove(ans.size()-1);
            }
        }
    }
}