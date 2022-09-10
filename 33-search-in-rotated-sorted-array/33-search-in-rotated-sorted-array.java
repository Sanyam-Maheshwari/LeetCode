class Solution {
    public int search(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[l]<=arr[mid])
            {
                if(arr[l]<=target && arr[mid]>=target)
                    r=mid-1;
                else
                {
                    l=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && arr[r]>=target)
                {
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}