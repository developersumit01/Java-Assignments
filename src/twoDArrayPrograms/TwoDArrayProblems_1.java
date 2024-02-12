package twoDArrayPrograms;

import java.util.Arrays;

//	This is the URL of that google drive from which you can take the reference if this assignment.

// 	https://drive.google.com/file/d/1hlzvkVaowS5x9TWfbdz1fd9yAVv59Vfu/view?usp=sharing

public class TwoDArrayProblems_1 {

	public static void main(String[] args) {
		TwoDArrayProblems_1 arrayProblems_1 = new TwoDArrayProblems_1();
		int arr[][] = { { 1, 2, 3 },{4,5,6} };
		System.out.println(Arrays.toString(arrayProblems_1.diagoanlTraversalOfSquareMatrix(arr)));
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

//	Que 4. Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.
//  NOTE: In this question according to graph this solution is correct.
	public int[] diagoanlTraversalOfSquareMatrix(int arr[][]) {
//		from here i am  starting the validation of array 
		/*
		 * if the array is not square matrix then it will return with an error message.
		 * if the array is empty the it will return.
		 */
		if (arr.length == 0) {
			return null;
		}
		int row = arr.length - 1, col = arr[0].length - 1;
		if (row != col) {
			System.out.println("The array should be squired!");
			return null;
		}
//		validation end.
		int ans[] = new int[arr.length * arr[0].length]; // This is the answer array.
		int rowStart = 0, rowEnd = 0, index = 0, i = 0, j = 0, oddEven = 0;
		/*
		 * In this logic i am traversing the array according to rowStart and rowEnd
		 * number. i,j are the index of array which we want to traverse. index is a
		 * variable which will traverse the answer array. and oddEven is the variable
		 * which iteration we are performing odd or even. if the iteration is odd the
		 * iteration will be top to bottom. else the iteration will be bottom to top.
		 */
		while (rowStart <= row) {
			while (i > -1 && j > -1 && i <= row) {
				if (oddEven % 2 != 0) {
					ans[index++] = arr[i++][j--];
				} else {
					ans[index++] = arr[j--][i++];
				}
			}
			oddEven++;
			if (rowEnd < row) {
				rowEnd++;
			} else {
				rowStart++;
			}
			i = rowStart;
			j = rowEnd;
		}
		return ans;
	}
//	public int[] diagoanlTraversal(int arr[][]) {
////		from here i am  starting the validation of array 
//		/*
//		 * if the array is not square matrix then it will return with an error message.
//		 * if the array is empty the it will return.
//		 */
//		if (arr.length == 0) {
//			return null;
//		}
//		int row = arr.length - 1, col = arr[0].length - 1;
////		if (row != col) {
////			System.out.println("The array should be squired!");
////			return null;
////		}
////		validation end.
//		int ans[] = new int[arr.length * arr[0].length]; // This is the answer array.
//		int rowStart = 0, rowEnd = 0, index = 0, i = 0, j = 0, oddEven = 0;
//		/*
//		 * In this logic i am traversing the array according to rowStart and rowEnd
//		 * number. i,j are the index of array which we want to traverse. index is a
//		 * variable which will traverse the answer array. and oddEven is the variable
//		 * which iteration we are performing odd or even. if the iteration is odd the
//		 * iteration will be top to bottom. else the iteration will be bottom to top.
//		 */
//		while (rowStart <= row) {
//			while (i > -1 && j > -1 && i <= row) {
//				if(i>row) {
//					i=row;
//				}
//				if(j>col) {
//					j=col;
//				}else if(oddEven%2!=0&&j>row) {
//					j=row;
//				}
//				if (oddEven % 2 != 0) {
//					ans[index++] = arr[i++][j--];
//				} else {
//					ans[index++] = arr[j--][i++];
//				}
//			}
//			oddEven++;
//			if (rowEnd < col) {
//				rowEnd++;
//			} else {
//				rowStart++;
//			}
//			i = rowStart;
//			j = rowEnd;
//		}
//		return ans;
//	}

}
