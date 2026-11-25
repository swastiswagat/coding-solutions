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
