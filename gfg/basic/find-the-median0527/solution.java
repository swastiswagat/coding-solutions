class Solution {
	public double findMedian(int[] arr) {
		// Code here.
		int sum = 0;
		int n = arr.length;
		Arrays.sort(arr);
		if (n % 2 != 0) {
			return arr[n / 2];
		} else {
			return (double) (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
		}
	}
}
