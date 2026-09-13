class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while (n > 0){
            sum  += n % 10;
            n /= 10;
        }
        int org = sum;
        int rev = 0;
        
        while ( sum > 0){
            int a = sum % 10;
            rev =rev * 10 + a;
            sum /= 10;
        }
        
        return org == rev;
    }
}