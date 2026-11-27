class Solution {
  String firstAlphabet(String s) {
    // code here
    String[] arr = s.split(" ");
    String res = "";

    for (int i = 0; i < arr.length; i++) {
      res += arr[i].charAt(0);
    }
    return res;
  }
};