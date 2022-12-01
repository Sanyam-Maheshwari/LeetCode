class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> vowels=new ArrayList(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        // vowels.add();
        int si=0;
        int ei=s.length()-1;
        int vip1=0;
        int vip2=0;
        while(si<ei)
        {
            if(vowels.contains(s.charAt(si)))
                vip1++;
            if(vowels.contains(s.charAt(ei)))
                vip2++;
            ei--;
            si++;
        }
        return vip1==vip2;
    }
}