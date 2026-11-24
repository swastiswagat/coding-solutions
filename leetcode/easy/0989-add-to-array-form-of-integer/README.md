# Add to Array-Form of Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The  **array-form**  of an integer `num` is an array representing its digits in left to right order.

- For example, for num = 1321, the array form is [1,3,2,1].

Given `num`, the  **array-form**  of an integer, and an integer `k`, return  *the  **array-form**  of the integer*  `num + k`.

 

Original
Java
 **Example 1:** 

```
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

```

 **Example 2:** 

```
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

```

 **Example 3:** 

```
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

```

 

 **Constraints:** 

- 1 <= num.length <= 104
- 0 <= num[i] <= 9
- num does not contain any leading zeros except for the zero itself.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.68%)  
**Memory:** 47.3 MB (beats 60.06%)  
**Submitted:** 2026-11-24T15:23:06.687Z  

```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList a = new LinkedList();
        for (int i = num.length-1; i >= 0 || k > 0; i--) {
            if(i >= 0) k += num[i];
            a.addFirst(k%10);
            k /= 10;
        }
        return a; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-to-array-form-of-integer/)