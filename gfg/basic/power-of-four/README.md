# Power of Four

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number n, check if n is power of 4 or not.

 **Examples:** 

```
Input: n = 64
Output: true
Explanation: 43= 64
```

```
Input: n = 75
Output : false
Explanation : 75 is not a power of 4.
```

 **Constraints:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T17:43:41.815Z  

```java
class Solution {
    boolean isPowerOfFour(int n) {
        // code here
        if (n == 0) return false;
        while ( n % 4 == 0) {
            n /= 4;
        }
        if (n == 1) return true;
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-four/1)