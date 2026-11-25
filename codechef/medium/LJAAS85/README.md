# LJAAS85

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T18:22:42.749Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
		    char ch = sc.next().charAt(0);
		    switch (ch) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		            System.out.println("Vowel");
		            break;
		            default:
		            System.out.println("Consonant");
		    }
		}
		sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS85)