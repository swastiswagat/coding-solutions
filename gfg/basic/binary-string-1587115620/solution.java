import java.util.regex.*;
class Solution {
    public int binarySubstring(String s) {
        // code here
        Pattern p = Pattern.compile("1");
        Matcher m = p.matcher(s);
        
        long count = 0;
        while (m.find()) {
            count++;
        }
        return(int) (count * (count - 1) / 2);
    }
}