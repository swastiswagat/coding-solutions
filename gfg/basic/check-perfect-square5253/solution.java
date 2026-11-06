class Solution {
    public boolean isPerfectSquare(int n) {
        // code here
        if (n < 0) return false;
        return (Math.sqrt(n) % 1 == 0);
        
    }
}