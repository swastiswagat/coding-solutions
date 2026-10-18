# Addition Under Modulo

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three integers a, b, and M, compute the result of the modular addition operation: (a+b) mod M

 **Note:** Modular operations returns the remainder when divided by M. The result will always lie in the range  **0**  and  **M - 1**.

 **Examples :** 

```
Input: a = 10, b = 20, M = 3
Output: 0
Explanation: (10 + 20) mod 3 = 0
```

```
Input: a = 100, b = 13, M = 107
Output: 6
Explanation: (100 + 13) mod 107 = 6
```

 **Constraints:** 
1 ≤ a, b, M ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T19:55:07.219Z  

```java
class Solution {
    public int sumUnderModulo(int a, int b, int M) {
        // code here
        int sum = 0;
        sum = a + b;
        
        return sum % M;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/addition-under-modulo/1)