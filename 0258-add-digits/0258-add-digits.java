class Solution {
    public int addDigits(int num) {
        int res=num;
        int temp=num;
        while(!(res<10))
            {
                res=0;
                while(temp!=0)
                {
                    int r=temp%10;
                    res+=r;
                    temp/=10;
                }
                temp=res;
            }
              return res;
    }
}