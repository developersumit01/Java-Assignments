package arrayPrograms;

//	https://drive.google.com/file/d/1Q1YIj7mywtWxGhfxXd8w9cl51oiHBYJo/view?usp=sharing

public class Arrays_2 {
	public static void main(String[] args) {
		Arrays_2 arrays_2 = new Arrays_2();
		int a[] = { 1,2,3,4,5,6,7,8,9 };
//		System.out.println(arrays_2.union(a, b));
		System.out.println(arrays_2.smallestInteger(a, 4));
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
		int small=-1;
		for (int j = 0; j < k; j++) {
			int max = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < max) {
					max = arr[i];
					index = i;
				}
			}
			small=arr[index];
			arr[index] = Integer.MAX_VALUE;	
		}
		return small;
	}

}
