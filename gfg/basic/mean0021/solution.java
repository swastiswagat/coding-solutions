class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            sum += arr[i];
        }
        int Mean = sum / l;
        return Mean;
    }
};