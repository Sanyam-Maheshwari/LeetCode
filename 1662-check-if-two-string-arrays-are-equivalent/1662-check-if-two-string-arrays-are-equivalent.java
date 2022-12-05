class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String s:word1)
            s1+=s;
        for(String s:word2)
            s2+=s;
        // System.out.println(s1);
        // System.out.println(s2);
        return s1.equals(s2);
    }
}