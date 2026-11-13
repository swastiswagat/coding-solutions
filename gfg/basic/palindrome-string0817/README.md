# Palindrome String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, find if it is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

 **Examples :** 

```
Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
```

```
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T13:46:36.071Z  

```java
class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] ch = s.toCharArray();
        int st = 0;
        int end= s.length() - 1;
        
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)