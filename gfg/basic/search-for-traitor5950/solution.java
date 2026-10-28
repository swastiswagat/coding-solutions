class Solution {
    public int findPos(int n) {
        // code here
        if (n == 1)
        return 1;
        if (n % 2 == 0 ){
            return 2 * findPos(n / 2) - 1;
        }
        else {
            return 2 * findPos(n / 2) + 1;
        }
    }
}