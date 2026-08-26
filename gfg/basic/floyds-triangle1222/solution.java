import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        // code here
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
        
    }
}