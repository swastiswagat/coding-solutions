# Check if divisible by 5

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**  in the form of string, check if the number is divisible by  **5**.

 **Examples:** 

```
Input: n = "5"
Output: true
Explanation: 5 is divisible by 5.
```

```
Input: n = "121"
Output: false
Explanation: 121 is not divisible by 5.
```

 **Constraints:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T17:27:24.997Z  

```java
class Solution {
    public boolean divisibleBy5(String n) {
        // code here
       char ch = n.charAt(n.length() - 1);
       return (ch == '0' || ch == '5');
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-divisible-by-52730/1)