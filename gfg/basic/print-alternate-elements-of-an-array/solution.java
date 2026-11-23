class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList b = new ArrayList();
        for (int i = 0; i < arr.length; i +=2) {
            b.add(arr[i]);
        }
        return b;
    }
}