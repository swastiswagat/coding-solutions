# LJAAS49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that takes the radius of a circle as input and prints its area. (use $\pi$ = 3.14)

### Sample 1:
Input
Output

```
5
```

```
78.5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T18:09:14.791Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextDouble()) {
		    double r = sc.nextDouble();
		    double a = 3.14 * r * r;
		    System.out.println(a);
		}
		sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS49)