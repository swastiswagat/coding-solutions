class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] b = new int[2 * nums.length];
        System.arraycopy(nums, 0 , b , 0 , nums.length );
        System.arraycopy(nums, 0, b, nums.length, nums.length);
        return b;
    }
}