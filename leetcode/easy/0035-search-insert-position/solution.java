class Solution {
    public int searchInsert(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;

        while (a <= b) {
            int mid = (a + b) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        return a;
    }
}