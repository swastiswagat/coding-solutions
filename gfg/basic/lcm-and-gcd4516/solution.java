class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcdVal = gcd(a, b);
            int lcmVal = (a / gcdVal) * b;
            return new int[]{lcmVal, gcdVal};
        }

        private static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
    }
}