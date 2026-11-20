# Remove Consonants

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, remove all consonants and return the modified string containing only vowels.

If the string does not contain any vowels, return an empty string.

 **Examples:** 

```
Input: s = "abEkipo"
Output: "aEio"
Explanation: a, E, i, o are only vowels in the string.

```

```
Input: s = "rrty"
Output: ""
Explanation: There are no vowels.

```

 **Constraints** 
1 ≤ n ≤ 105, n is length of the string
The string should consist of only alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T17:46:36.578Z  

```java
class Solution {
	String remConsonants(String s) {
		// code here
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				a += ch;
			}
		}
			return a;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string1945/1)