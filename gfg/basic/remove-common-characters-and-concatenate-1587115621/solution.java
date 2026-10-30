class Solution {
	public static String concatenatedString(String s1, String s2) {
		// code here
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				res += s1.charAt(i);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < s1.length(); j++) {
				if (s2.charAt(i) == s1.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				res += s2.charAt(i);
			}
		}
	    return res.isEmpty() ? "-1" : res;
	}
}
