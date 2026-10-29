class Solution {
    public int binarySearch(int[] arr, int k) {
        // code here
        int st = 0;
        int end = arr.length - 1;
        
        while (st <= end) {
            int mid = (st + end) / 2;
            
            if (k == arr[mid]) {
                return mid;
            } 
            else if (k < arr[mid]) {
                end = mid - 1;
            }
            else {
                st = mid +1;
            }
        }
        return -1;
    }
}