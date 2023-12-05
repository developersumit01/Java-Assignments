package arrayPrograms;

//	This is the URL of that google drive from which you can take the reference if this assignment.

// 	https://drive.google.com/file/d/1hlzvkVaowS5x9TWfbdz1fd9yAVv59Vfu/view?usp=sharing

public class TwoDArrayProblems_1 {

	public static void main(String[] args) {
		TwoDArrayProblems_1 arrayProblems_1 = new TwoDArrayProblems_1();
		int arr[][] = { { 1, 2 }, { 1, 2 } };
		System.out.println(arrayProblems_1.isToeplitz(arr));
//		arr=arrayProblems_1.rotateMatrix(arr);
//		for(int row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[0].length;col++) {
//				System.out.print(arr[row][col]);
//			}
//			System.out.println();
//		}
	}

//	Que 1. Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”.
	public int[][] matrixMultiply(int a[][], int b[][]) {
		if (a.length == 0 || b.length == 0) {
			System.out.println("Invalid input given");
			return null;
		}
		int i = a.length, j = a[0].length, m = b.length, n = b[0].length;
		if (j != m) {
			System.out.println("Invalid input given");
			return null;
		}
		int sum = 0;
		int ans[][] = new int[i][n];

		for (int row = 0; row < i; row++) {
			for (int col = 0; col < n; col++) {
				for (int k = 0; k < j; k++) {
					sum += a[row][k] * b[k][col];
				}
				ans[row][col] = sum;
				sum = 0;
			}
		}
		return ans;
	}

//	Que 2. Given a square matrix, rotate it by 90 degrees in anti clockwise direction.
	public int[][] rotateMatrix(int arr[][]) {
		if (arr.length == 0) {
			System.out.println("Invalid input given");
			return null;
		}
		int ans[][] = new int[arr[0].length][arr.length];
		int num = arr[0].length - 1, count = 0;
		for (int row = 0; row < arr[0].length; row++) {
			count = 0;
			for (int col = 0; col < arr.length; col++) {
				ans[row][col] = arr[count][num - row];
				count++;
			}
		}
		return ans;
	}

//	Que 3. Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
//	if every diagonal from top-left to bottom-right has the same elements.
	public boolean isToeplitz(int arr[][]) {
		if (arr.length == 0) {
			return true;
		}
		int i = arr.length, j = arr[0].length;
		for (int row = 0; row < j; row++) {
			int m = 0, n = row;
			int first = arr[m][n];
			while (m < i && n < j) {
				if (arr[m][n] != first) {
					return false;
				}
				m++;
				n++;
			}
		}
		for (int row = 0; row < i; row++) {
			int m = row, n = 0;
			int first = arr[m][n];
			while (m < i && n < j) {
				if (arr[m][n] != first) {
					return false;
				}
				m++;
				n++;
			}
		}
		return true;
	}
	
//	This function is not completed yet i will complete it very soon. 
	
//	Que 4. Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.
//	public int[] diagoanlTraversal(int arr[][]) {
//		if (arr.length == 0) {
//			System.out.println("Invalid input given");
//			return null;
//		}
//		int row = arr.length, col = arr[0].length;
//		int i=0, j=0;
//		while (true) {
//			while(i>=0&&j<=col) {
//				System.out.println(arr[i][j]);
//				i--;
//				j++;
//			}
//			while() {
//				
//			}
//		}
//	}
}
