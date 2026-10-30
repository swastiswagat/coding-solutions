# Remove Common and Concat

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings,  **s1**  and  **s2**. The task is to remove all characters that are common in both strings and then combine the remaining characters from each string to form a new string.

- The characters that are not shared between the two strings should appear in the result in the same order as they appear in their respective original strings.
- If no characters are left after removing the common characters, return "-1"

 **Examples:** 

```
Input: s1 = aacdb, s2 = gafd
Output: cbgf
Explanation: The common characters of s1 and s2 are: a, d. The uncommon characters of s1 and s2 are c, b, g and f. Thus the modified string with uncommon characters concatenated is cbgf.

```

```
Input: s1 = abcs, s2 = cxzca
Output: bsxz
Explanation: The common characters of s1 and s2 are: a,c. The uncommon characters of s1 and s2 are b,s,x and z. Thus the modified string with uncommon characters concatenated is bsxz.
```

 **Constraints:** 
1 <= |Length of Strings| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T05:05:07.800Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/1)