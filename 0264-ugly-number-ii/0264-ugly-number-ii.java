class Solution {
    public int nthUglyNumber(int n) {
        int arr[] =new int[n+1];
    int p2=1;
    int p3=1;
    int p5=1;
    arr[1]=1;
    for(int i=2;i<=n;i++)
    {
        int fn=2*arr[p2];
        int sn=3*arr[p3];
        int tn=5*arr[p5];
        int min=Math.min(fn, Math.min(sn, tn));
        arr[i]=min;
        if(fn==min)
            p2++;
        if(sn==min)
            p3++;
        if(tn==min)
            p5++;
    }
    return arr[n];
    }
}