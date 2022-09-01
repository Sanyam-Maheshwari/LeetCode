class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        int res=1;
        if(n==0)
            return 0;
        else if(n>h)
            return -1;
        else{
        for(int i=0;i<h-n+1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                for(int j=0;j<n;j++)
                {
              
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    if(j==n-1)return i;
                }
                

                
        
        }}
        }
            
            
        return -1;
    }
        
}