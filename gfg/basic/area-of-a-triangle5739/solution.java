class Solution {
    public double findArea(int a, int b, int c) {
        // code here
        if (a + b <= c || b + c <= a || a + c <= b) {
                    return 0.0;
                }

                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                long truncated = (long) (area * 1000.0);
                return truncated / 1000.0;
    }
}