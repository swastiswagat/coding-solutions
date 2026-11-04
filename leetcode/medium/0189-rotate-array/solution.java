class Solution {
    public void rotate(int[] nums, int k) {
        int[] b = new int[nums.length];
        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            b[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            b[j] = nums[i];
            j++;
        }
        for (int i = 0; i < nums.length; i++){
        nums[0] = b[i];
        }
    }
}