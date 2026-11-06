class Solution {
    public int[] findSum(int n) {
        // Code here
        int sum = 0;
        int sum2 = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
            else {
                sum2 += i;
            }
        }
            return new int[] {sum , sum2};
        
    }
}