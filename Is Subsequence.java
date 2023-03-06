class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        
        int subsequence = 0;
        for(int i=0; i<t.length(); i++){
            if(s.length() == subsequence)
                return true;
            if(s.charAt(subsequence) == (t.charAt(i)))
                subsequence++;
        }
        return subsequence == s.length();
    }
}
