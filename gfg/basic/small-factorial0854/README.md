# Small Factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Calculate factorial of a given number  **N**.
 

 **Example 1:** 

```
Input: 5
Output: 120
Explanation: 1  *2*  3  *4*  5 = 120.

```

 

 **Your Task:** 
You don't need to read or print anything. Your task is to complete the function  **find_fact()**  which takes n as input parameter and returns factorial of N.
 

 **Expected Time Complexity:** O(N)
 **Expected Space Complexity:** O(1)
 

 **Constraints:** 
1 <= N <= 18

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T17:27:55.359Z  

```java
class Solution {
	public long find_fact(int n) {
		// Code here
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/small-factorial0854/1)