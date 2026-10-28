class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum = 0; 
        int prod = 1;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            prod *= r;
            n /= 10;
        }
        return (sum == prod) ? true : false;
    }
}
