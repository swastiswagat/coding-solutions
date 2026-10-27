class Solution {
    public int sumOfAP(int n, int a, int d) {
        // code here
        int sum = 0;
        int cur = a;
        for (int i = 1; i <= n; i++) {
            sum += cur;
            cur += d;
        }
        return sum;
    }
}