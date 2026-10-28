class Solution {
    public boolean isNumber(String s) {
        String regex = "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?";
        return s.matches(regex);
    }
}