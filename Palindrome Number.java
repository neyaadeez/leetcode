class Solution {
    public boolean isPalindrome(int x) {
        String Y = String.valueOf(x);
        int n = Y.length();

        for(int i = 0; i < n/2; i++){
            if(Y.charAt(i) != Y.charAt(n-i-1))
                return false;
        }

        return true;
    }
}
