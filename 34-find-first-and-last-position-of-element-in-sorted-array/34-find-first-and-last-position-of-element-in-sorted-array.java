class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res=first(nums,target);
        int res1=last(nums,target);
        int []arr=new int[2];
        arr[0]=res;
        arr[1]=res1;
        return arr;
    }
    public static int first(int[] nums, int target)
    {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                if(mid==0 || nums[mid-1]!=target)
                    return mid;
                else
                    r=mid-1;
            }
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static int last(int[] nums, int target)
    {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                if(mid==nums.length-1 || nums[mid+1]!=target)
                    return mid;
                else
                    l=mid+1;
            }
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}