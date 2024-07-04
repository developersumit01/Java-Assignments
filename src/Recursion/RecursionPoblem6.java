package Recursion;

public class RecursionPoblem6 {
	public static void main(String[] args) {
		RecursionPoblem6 poblem6 = new RecursionPoblem6();

		int arr[] = { 1, 2, 3, 4, 5 };
		poblem6.rCombinationOfArray(arr,3);
	}

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
		for (int i = 0; i < r; i++) {
			ans[i] = i;
		}

		serviceOfRCombinationOfArray(arr, ans, r,r-1);
	}

	private void serviceOfRCombinationOfArray(int[] arr, int[] ans, int r,int index) {
		// TODO Auto-generated method stub
		if(index==-1) {
			return;
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(arr[ans[i]]+" ");	
		}
		for(int j=ans.length-1;j>=index;j--) {
			ans[j]++;
		}
		System.out.println();
		if(ans[index]==arr.length-1) {
			index--;
			for(int i=index;i<ans.length-1;i++) {
				ans[i+1]=ans[i]+1;
			}
		}
		serviceOfRCombinationOfArray(arr, ans, r, index);
	}
}
