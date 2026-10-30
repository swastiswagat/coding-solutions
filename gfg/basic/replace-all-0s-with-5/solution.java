class Solution {
    public int convertFive(int n) {
        // code here
        return Integer.parseInt(String.valueOf(n).replace('0', '5'));
    }
}