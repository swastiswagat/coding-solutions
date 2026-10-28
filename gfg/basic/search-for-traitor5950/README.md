# Find Safe Position

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a group of  **n** soldiers standing in a circle, numbered from  **1 to n**.

- Starting from soldier 1, every alternate soldier is eliminated in a clockwise direction - soldier 1 eliminates soldier 2, soldier 3 eliminates soldier 4, and so on.
- This process continues around the circle until only one soldier remains.

Find the position of the soldier who survives till the end.

 **Examples:** 

```
Input: n = 10
Output: 5
Explanation: 1 kills 2, 3 kills 4, 5 kills 6, 7 kills 8, 9 kills 10. Now 1 kills 3, 5 kills 7, 9 kills 1. Now 5 kills 9. Surviving position = 5 

```

```
Input: n = 7
Output: 7
Explanation: 1 kills 2, 3 kills 4, 5 kills 6. Now 7 kills 1, 3 kills 5. Now 7 kills 3. Surviving position = 7

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T17:33:31.512Z  

```java
class Solution {
    public int findPos(int n) {
        // code here
        if (n == 1)
        return 1;
        if (n % 2 == 0 ){
            return 2 * findPos(n / 2) - 1;
        }
        else {
            return 2 * findPos(n / 2) + 1;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-for-traitor5950/1)