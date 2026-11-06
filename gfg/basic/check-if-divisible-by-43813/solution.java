class Solution {
    boolean divisibleBy4(String s) {
        // code here
        if (s.length() <= 2) {
        int num = Integer.parseInt(s);
        return (num % 4 == 0);
        }
        String lastTwoDigits = s.substring(s.length() - 2);
        
            int num = Integer.parseInt(lastTwoDigits);
            return num % 4 == 0;
        
    }
}