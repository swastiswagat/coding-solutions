class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String s1 = str[str.length - 1];
        return s1.length();

    }
}