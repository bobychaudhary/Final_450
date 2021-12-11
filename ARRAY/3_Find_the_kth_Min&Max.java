// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Example 1:

// Input:
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// Output : 7
// Explanation :
// 3rd smallest element in the given 
// array is 7.
// Example 2:

// Input:
// N = 5
// arr[] = 7 10 4 20 15
// K = 4
// Output : 15
// Explanation :
// 4th smallest element in the given 
// array is 15.

class Solution {
	public int partition(int[] arr, int k) {
		int n = arr.length;
		int l = 0, r = n - 1;
		while (l <= r) {
			int m = partition(arr, l, r);
			if (m == k - 1)
				return arr[m];
			else if (m > k - 1)
				r = m - 1;
			else
				l = m + 1;
		}
		return -1;


	}
	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 20, 15};
		int k = 4;
		Solution s = new Solution();
		System.out.println(s.partition(arr, k));
	}

}