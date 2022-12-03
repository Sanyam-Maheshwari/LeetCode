class Solution {
    public int heightChecker(int[] heights) {
        int []expected =new int[heights.length];
        int j=0;
        for(int i:heights)
            expected[j++]=i;
        
        Arrays.sort(expected);
        // for(int i:expected)
        //     System.out.print(i+" ");
        //  System.out.println();
        // for(int i:heights)
        //     System.out.print(i+" ");
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
                count++;
        }
        return count;
    }
}