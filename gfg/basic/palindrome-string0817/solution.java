class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] ch = s.toCharArray();
        int st = 0;
        int end= s.length() - 1;
        
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}