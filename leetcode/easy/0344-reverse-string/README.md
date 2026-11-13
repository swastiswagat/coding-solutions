# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

Original
Java
 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 49.07%)  
**Memory:** 47.6 MB (beats 89.98%)  
**Submitted:** 2026-11-13T13:57:01.595Z  

```java
class Solution {
    public void reverseString(char[] s) {
        char[] res = new char[s.length];
        for (int i = s.length - 1; i >= 0 ;i--) {
            res[s.length - 1 - i] += s[i];
        }
        for (int i = 0; i <s.length; i++) {
            s[i] = res[i];
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)