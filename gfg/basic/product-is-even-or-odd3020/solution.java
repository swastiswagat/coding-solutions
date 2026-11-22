class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        if (arr == null || arr.isEmpty()){
            return false;
        }
        for (int num : arr) {
            if (num % 2 == 0)
            return true;
        }
      return false;
    }
}