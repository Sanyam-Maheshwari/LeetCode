class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
                count++;
        }
        double res=((double)count/(s.length()*1.0))*100;
        return (int)res;
    }
}