# LJAAS50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that takes the two different strings as input and prints them in a single line separated by spaces.

### Sample 1:
Input
Output

```
Code
Chef
```

```
Code Chef
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T18:11:02.792Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(a + " " + b);
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS50)