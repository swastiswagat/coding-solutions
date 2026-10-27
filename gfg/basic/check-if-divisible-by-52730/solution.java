class Solution {
    public boolean divisibleBy5(String n) {
        // code here
       char ch = n.charAt(n.length() - 1);
       return (ch == '0' || ch == '5');
       
    }
}