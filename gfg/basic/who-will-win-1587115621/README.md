# Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr[]**  of distinct integers and an integer  **k**, return the 0-based index of k if it is present in the array. Otherwise, return -1.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: 6 is present at index 4.
```

```
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: -1
Explanation: 3 is not present in the array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T15:12:29.342Z  

```java
class Solution {
    public int binarySearch(int[] arr, int k) {
        // code here
        int st = 0;
        int end = arr.length - 1;
        
        while (st <= end) {
            int mid = (st + end) / 2;
            
            if (k == arr[mid]) {
                return mid;
            } 
            else if (k < arr[mid]) {
                end = mid - 1;
            }
            else {
                st = mid +1;
            }
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1)