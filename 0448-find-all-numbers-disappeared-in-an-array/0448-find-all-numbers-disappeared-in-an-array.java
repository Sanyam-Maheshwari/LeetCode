class Solution {


    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}

/*
    wuattiroro's avatar
wuattiroro
124
August 7, 2020 7:46 PM

6.9K VIEWS

The solution works because 1 ≤ a[i] ≤ n (n = size of array)
As we walk through all elements in the array, we can use the current element as an index and flag its value (in place). All numbers are > 0, so we can use a negative number.
In the end, the indexes of all positive numbers in the array are the missing values.

The input: [4, 3, 2, 7, 8, 2, 3, 1]
Becomes: [-4, -3, -2, -7, 8, 2, -3, -1]

Starting from 1, the missing values are 5 and 6.*/