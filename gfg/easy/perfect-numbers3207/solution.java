class Solution {
    static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += (n / i);
                }
            }
        }

        return sum == n;
    }
}