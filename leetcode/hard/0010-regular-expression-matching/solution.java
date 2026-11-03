import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean isMatch(String s, String p) {
        Matcher m = Pattern.compile(p).matcher(s);
        return m.matches();
    }
}