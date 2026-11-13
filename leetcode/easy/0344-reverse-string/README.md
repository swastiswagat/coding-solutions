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
**Memory:** 47.9 MB (beats 76.53%)  
**Submitted:** 2026-11-13T14:00:29.960Z  

```java
class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int end = s.length - 1;

        while (st < end) {
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)