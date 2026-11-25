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
