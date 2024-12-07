class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;
        char[] subs = s.toCharArray();
        int scnt = 0, slen = s.length();

        for (Character c : t.toCharArray()) {
            if (c == subs[scnt])
                scnt++;
            if (slen == scnt)
                return true;
        }
        return false;
    }
}