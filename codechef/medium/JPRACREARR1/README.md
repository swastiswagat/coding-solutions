# JPRACREARR1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T17:55:51.763Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int h = sc.nextInt();
		    System.out.println(x + (h  - 1) * y);
		}
		sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACREARR1)