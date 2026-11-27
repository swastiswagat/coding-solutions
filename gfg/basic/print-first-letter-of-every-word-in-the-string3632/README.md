# First Letter of Every Word

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, the task is to create a string with the first letter of every word in the string. The string s contains lower case English alphabets and its words have a single space between them. 

 **Examples:** 

```
Input: s = "geeks for geeks"
Output: gfg
Explanation: 
First word starts at index 0, take 'g' 
After first space, next word starts with 'f'
After second space, next word starts with 'g'
```

```
Input: s = "bad is good"
Output: big
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T16:48:57.789Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1)