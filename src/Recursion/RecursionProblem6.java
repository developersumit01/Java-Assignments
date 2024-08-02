package Recursion;

public class RecursionProblem6 {
//	Q1 - Count all the possible paths on an m x n grid from top left (grid[0][0]) to bottom right (grid[m-1][n-1]) having 	constraints that from each cell you can either move only to right or down.
	public int numberOfPath(int m, int n) {
		int count[] = new int[1];
		return serviceOfNumberOfPath(m, n, 0, 0, count);
	}

	private int serviceOfNumberOfPath(int m, int n, int i, int j, int count[]) {
		// TODO Auto-generated method stub
		if (i == m - 1 && j == n - 1) {
			count[0]++;
		}
		if (i >= m || j >= n) {
			return 0;
		}
		serviceOfNumberOfPath(m, n, i + 1, j, count);
		serviceOfNumberOfPath(m, n, i, j + 1, count);
		return count[0];
	}

//	Q2 - Given an array of integers, print a sum triangle from it such that the first level(the bottom
//			level in triangular fashion) has all array elements. From then, at each level, the number of
//			elements is one less than the previous level and elements at the level is the sum of
//			consecutive two elements in the previous level.

	public void triangularArray(int arr[]) {
		int i = 0, j = 1;
		if (arr.length == 1) {
			System.out.println(arr[0]);
			return;
		} else if (arr.length == 0) {
			System.out.println("The array is empty");
			return;
		}
		int ans[] = new int[arr.length - 1];
		while (j < arr.length) {
			ans[i] = arr[i] + arr[j];
			i++;
			j++;
		}
		triangularArray(ans);
		elementSum(arr, 0, 1);
	}

	private void elementSum(int[] arr, int i, int j) {
		if (j == arr.length) {
			return;
		}
		System.out.println(arr[i] + arr[j]);
		elementSum(arr, i + 1, j + 1);

	}

//	Q3 - Given an array of size n, generate and print all possible combinations of r elements in array.

//	Note This function is showing error i will handle this error very soon.

	public void rCombinationOfArray(int arr[], int r) {
		int ans[] = new int[r];

		serviceOfRCombinationOfArray(arr, ans, r, 0, 0);
	}

	private void serviceOfRCombinationOfArray(int[] arr, int[] ans, int r, int index, int i) {
		if (index == r) {
			for (int j = 0; j < ans.length; j++) {
				System.out.print(ans[j] + " ");
			}
			System.out.println();
			return;
		}

		if (i >= arr.length) {
			return;
		}

		ans[index] = arr[i];

		serviceOfRCombinationOfArray(arr, ans, r, index + 1, i + 1);
		serviceOfRCombinationOfArray(arr, ans, r, index, i + 1);
	}

//	Q4 - Given two sorted arrays A and B of length m and n respectively, generate all possible arrays
//	such that the first element is taken from A then from B then from A, and so on in increasing order
//	till the arrays are exhausted. The generated arrays should end with an element from B.


	public void generate(int[] A, int[] B, int[] C, int i, int j, int m, int n, int len, boolean flag) {
		if (flag) {
			// Include valid element from A
			// Print output if there is at least one 'B' in output array 'C'
			if (len != 0) {
				printArr(C, len + 1);
			}
			// Recur for all elements of A after current index
			for (int k = i; k < m; k++) {
				if (len == 0) { // this block works for the very first call to include the first element in the
								// output array
					C[len] = A[k];
					// don't increment len as B is included
					generate(A, B, C, k + 1, j, m, n, len, !flag);
				} else if (A[k] > C[len]) { // include valid element from A and recur
					C[len + 1] = A[k];
					generate(A, B, C, k + 1, j, m, n, len + 1, !flag);
				}
			}
		} else { // Include valid element from B and recur
			for (int l = j; l < n; l++) {
				if (B[l] > C[len]) {
					C[len + 1] = B[l];
					generate(A, B, C, i, l + 1, m, n, len + 1, !flag);
				}
			}
		}
	}

	public static void printArr(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

}
