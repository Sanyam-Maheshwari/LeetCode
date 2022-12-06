class Solution {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] ans = new String[strArr.length];

        for (String str : strArr) {
            int k = str.length();
            int idx = str.charAt(k - 1) - '0' - 1;
            ans[idx] = str.substring(0, k - 1);     // O(k)
        }

        return String.join(" ", ans);
    }
}