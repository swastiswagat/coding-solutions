class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n <= 1)
        return false;
        boolean flag = true;
        for(int i = 2 ; i <= n/2; i++)
        if(n % i == 0) {
        flag = false;
        break;
            
        }
        return flag;
    }
}