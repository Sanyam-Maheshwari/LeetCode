class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans=new ArrayList();
        List<List<Integer>> res=new ArrayList();
        combi(n,k,1,ans,res);
        return res;
    }
    public static void combi(int n, int k, int index, List<Integer> ans, List<List<Integer>> res)
    {
        if(k==0)
        {
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=index;i<=n;i++)
        {
            ans.add(i);
            combi(n, k-1,i+1, ans, res);
            ans.remove(ans.size()-1);
        }
    }
}