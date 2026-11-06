# Divisibility by 4 Check

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number in form of a string  **s**. Check whether it is  **divisible by 4**  or not.

 **Examples :** 

```
Input: s = "1124"
Output: true
Explanation: The last two digits of "1124" are 24. Since 24 is divisible by 4, the given number is also divisible by 4. Hence, the output is true.

```

```
Input: s = "7"
Output: false
Explanation: As 7 % 4 = 3, the number is not divisible by 4. Hence, the output is false.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T17:35:18.529Z  

```java
class Solution {
    boolean divisibleBy4(String s) {
        // code here
        if (s.length() <= 2) {
        int num = Integer.parseInt(s);
        return (num % 4 == 0);
        }
        String lastTwoDigits = s.substring(s.length() - 2);
        
            int num = Integer.parseInt(lastTwoDigits);
            return num % 4 == 0;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-divisible-by-43813/1)