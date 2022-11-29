class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                if(i<=arr.length-2)
                {
                        arr=shift(arr, i+1);
                    i++;
            }
//                 if(i<arr.length-1)
//                 {
//                     arr[i+1]=0;
                    
//                 }
        }
    }
    }
public static int[] shift(int []arr, int j)
    {
        for(int i=arr.length-1;i>=j;i--)
        {
            arr[i]=arr[i-1];
        }
        return arr;
    }
}