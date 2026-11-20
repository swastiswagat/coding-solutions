# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 85.61%)  
**Memory:** 42.8 MB (beats 86.33%)  
**Submitted:** 2026-11-20T17:48:30.953Z  

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if (ch == ')' && top != '(' ||
                    ch == ']' && top != '[' ||
                    ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)