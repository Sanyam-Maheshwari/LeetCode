// meetchandarana
// 36
// May 14, 2020 10:32 AM

// 1.2K VIEWS

// Create an array of starting points where sp[i] = starting point of interval i.
// Use a HashMap to keep track of index of each starting point (Each starting point is unique).
// Sort the array of starting points
// Then for each end point 'ep':
// perform binary search on array of starting points to get the minimum start point 'sp' such that sp >= ep
// if such a start point is found, add its index (use the HashMap to get its index) to result array, else add -1 to result array
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = intervals.length;
        int n = intervals[0].length;
        int[] sp = new int[m];                  //array of starting points
        
        for(int i = 0; i < m; i++) {
            sp[i] = intervals[i][0];            
            map.put(sp[i], i);                  //(key=start_point, val=index)
        }
        
        Arrays.sort(sp);                        //sort array of starting points
        int[] result = new int[m];
        
        for(int i = 0; i < m; i++) {
            int l = 0, r = m - 1;
            boolean found = false;              //to see if result was found
            int min = -1;
            int ep = intervals[i][n - 1];       //ep = endpoint
            while(l <= r) {                     //binarySearch on arr of start points
                int mid = (l + ((r - l) / 2));
                if(sp[mid] >= ep) {
                    min = sp[mid];              
                    found = true;               
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            result[i] = found ? map.get(min) : -1;
        }
        return result;
    }
}