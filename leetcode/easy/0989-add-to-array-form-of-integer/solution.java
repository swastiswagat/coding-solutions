class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList a = new LinkedList();
        for (int i = num.length-1; i >= 0 || k > 0; i--) {
            if(i >= 0) k += num[i];
            a.addFirst(k%10);
            k /= 10;
        }
        return a; 
    }
}