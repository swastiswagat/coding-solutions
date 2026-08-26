# Multiplication Table

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, print the multiplication table from 1 to 10 for n in a single line, separated by spaces.

 **Examples:** 

```
Input: n = 9
Output: 9 18 27 36 45 54 63 72 81 90
```

```
Input: n = 2
Output: 2 4 6 8 10 12 14 16 18 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:27:14.856Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int i = 1;
        // code here
        while (i <= 10 ){
            prod = n * i;
            i++;
            System.out.print(prod+" ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/multiplication-table/1)