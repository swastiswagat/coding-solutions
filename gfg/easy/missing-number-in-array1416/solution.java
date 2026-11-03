class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long sum = (long) n * (n+1) /2;
        long sum2 = 0;
        
        for(int num : arr) {
            sum2 += num;
        }
        
        return (int) (sum - sum2);
    }
}