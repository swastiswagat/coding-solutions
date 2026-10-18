class Solution {
    public long nPr(int n, int r) {
        // code here
        long fact1 = 1;
        long fact2 = 1;
        for (int i = 1; i <= n; i++ ) { 
            fact1 *= i;
        }
        int res2 = n - r;
        for (int i = 1; i <= res2; i++) {
            fact2 *= i;
        }
        return fact1 / fact2;
    }
}