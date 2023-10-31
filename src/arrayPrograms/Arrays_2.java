package arrayPrograms;

public class Arrays_2 {
	public static void main(String[] args) {
		Arrays_2 arrays_2 = new Arrays_2();
	}

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
	
//	Note Que 2 will complete in next day so you can see it tomorrow.
}
