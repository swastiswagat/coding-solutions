# Alternates in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array **arr[]**, the task is to return a list elements of arr in alternate order (starting from index 0).

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
```

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Take fifth element: 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T16:24:14.238Z  

```java
class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList b = new ArrayList();
        for (int i = 0; i < arr.length; i +=2) {
            b.add(arr[i]);
        }
        return b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1)