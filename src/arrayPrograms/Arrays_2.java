package arrayPrograms;

//This is the URL of that google drive from which you can take the reference if this assignment.
//	https://drive.google.com/file/d/1Q1YIj7mywtWxGhfxXd8w9cl51oiHBYJo/view?usp=sharing

public class Arrays_2 {

//	Que 1. Given an unsorted array arr[] of size N having both negative and positive integers, place
//	all negative elements at the end of array without changing the order of positive elements
//	and negative elements.

	public int[] sortACNegativePositive(int[] arr) {
		int ans[] = new int[arr.length];
		int start = 0, end = arr.length - 1, neg = arr.length - 1, pos = 0;
		while (start < arr.length) {
			if (arr[end] < 0) {
				ans[neg--] = arr[end];

			}
			if (arr[start] >= 0) {
				ans[pos++] = arr[start];
			}
			end--;
			start++;
		}
		return ans;
	}

//	Que 2. Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
//			union between these two arrays and print the number of elements of the union set.
//			Union of the two arrays can be defined as the set containing distinct elements from both
//			the arrays. If there are repetitions, then only one occurrence of element should be printed
//			in the union.

	public int union(int[] a, int[] b) {
		int ans[] = new int[a.length + b.length];
		int index = 0;
		Arrays_2 arrays_2 = new Arrays_2();
		for (int i : a) {
			ans[index++] = i;
		}
		for (int i : b) {
			if (arrays_2.findElement(a, i)) {
				ans[index++] = i;
			}
		}
		return index - 1;
	}

//	This is the helper method for union method 
//	which is use to find the element is present in second array or not.
	private boolean findElement(int[] arr, int elem) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elem) {
				return false;
			}
		}
		return true;
	}

//	Que 3. Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//	find the Kth smallest element in the given array. It is given that all array elements are
//	distinct.

	public int smallestInteger(int arr[], int k) {
		int index = -1;
		int small = -1;
		for (int j = 0; j < k; j++) {
			int max = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < max) {
					max = arr[i];
					index = i;
				}
			}
			small = arr[index];
			arr[index] = Integer.MAX_VALUE;
		}
		return small;
	}

//	Que 4. Given an unsorted array A of size N that contains only non-negative integers, find a
//	continuous sub-array which adds to a given number S.
//	In case of multiple subarrays, return the subarray which comes first on moving from left
//	to right.
//	You need to print the start and end index of answer subarray.

	public int[] subArray(int[] arr, int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > num) {
					break;
				}
				if (sum == num) {
					int ans[] = { i, j };
					return ans;
				}
			}
		}
		return null;
	}

//	Que 5. Write a Java program to test the equality of two arrays.

	public boolean equalityOfArray(int[] firstArr, int[] secondArr) {
		if (firstArr.length != secondArr.length) {
			return false;
		}
		for (int i = 0; i < firstArr.length; i++) {
			if (firstArr[i] != secondArr[i]) {
				return false;
			}
		}
		return true;
	}
}
