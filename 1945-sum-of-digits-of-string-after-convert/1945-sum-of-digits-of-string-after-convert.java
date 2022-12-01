class Solution {
    public int getLucky(String s, int k) {
        String n="";
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            n+=(s.charAt(i)-'a'+1);
        }
        String nn="";
        int nnn=0;
        for(int i=0;i<n.length();i++)
        {
            nnn+=(n.charAt(i)-'0');
        }
        num=nnn;
        // num=Integer.parseInt(nnn);
        int temp=num;
        for(int i=1;i<k;i++)
        {
            int sum=0;
            while(temp!=0)
            {
                int r=temp%10;
                sum+=r;
                temp/=10;
            }
            temp=sum;
        }
        return temp;
    }
}