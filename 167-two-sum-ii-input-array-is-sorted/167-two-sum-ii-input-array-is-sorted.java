class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        int [] res=new int[2];
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                res[0]=l+1;
                res[1]=r+1;
                return res;
            }
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return res;
    }
}