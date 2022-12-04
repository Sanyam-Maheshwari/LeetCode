//  if we already had the sum of all elements of the array, then we can subtract the left part's sum from it to get the right part's sum, thus we can discard the suffixSum array and use only prefixSum array with a totalSum variable.

// But further we can notice, that while iterating on every index for breaking the nums array in two parts at that index, every time we only use the value at the current index i from the prefixSum array. Thus, instead of storing all prefix sums in an array, we can store the prefix sum till index i in a variable. So, we can also discard the prefixSum array and only use a currPrefixSum variable instead of it.
// Thus, instead of two arrays, we can use only two variables totalSum and currPrefixSum.
    
// Algorithm
// Initialize variables:

// n, integer to store the number of elements in the array.
// minAvgDiff, initialized with a large integer value, stores the minimum average difference.
// totalSum, a variable to store the sum of all elements of the nums array.
// currPrefixSum, a variable to store the sum of all elements till the current index of the nums array.
// ans, integer to store the index where we found the minimum average difference.
// Iterate on the nums array and calculate totalSum.

// Iterate over each index of the nums array:

// At each index i, we add the current element in currPrefixSum, to get the sum of all elements of the nums array from index 0 to index i, and divide the sum by i + 1 to get the average of the left part of the array.
// Similarly, we can get the sum of elements from index i + 1 to n - 1 after subtracting the left part's sum from the total sum of the array, and then divide it by n - i - 1 to get the average of the right part of the array.
// If the difference between the average of the left and right part of the array is smaller than minAvgDiff, then store this difference in minAvgDiff and the current index i in ans.
// Return ans.
    
class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int minAvgDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;
        
        // Get total sum of array.
        long totalSum = 0;
        for (int index = 0; index < n; ++index) {
            totalSum += nums[index];
        }
        
        for (int index = 0; index < n; ++index) {
            currPrefixSum += nums[index];
            
            // Calculate average of left part of array, index 0 to i.
            long leftPartAverage = currPrefixSum;
            leftPartAverage /= (index + 1);
            
            // Calculate average of right part of array, index i+1 to n-1.
            long rightPartAverage = totalSum - currPrefixSum;
            // If right part have 0 elements, then we don't divide by 0.
            if (index != n - 1) {
                rightPartAverage /= (n - index - 1);
            }
            
            int currDifference = (int) Math.abs(leftPartAverage - rightPartAverage);
            // If current difference of averages is smaller,
            // then current index can be our answer.
            if (currDifference < minAvgDiff) {
                minAvgDiff = currDifference;
                ans = index;
            }
        }
        return ans;
    }
}