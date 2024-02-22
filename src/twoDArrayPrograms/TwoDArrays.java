package twoDArrayPrograms;

//https://drive.google.com/file/d/1Q_lGDeu6kRyL3T2GqPWbqdxUPNVOErMJ/view?usp=sharing
public class TwoDArrays {

//	Q1. Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
//	row and column index.
	public String checkElementExistOrNot(int arr[][], int element) {
		int row = 0;
		for (int[] inArray : arr) {
			int index = linearSearch(inArray, element);
			if (index > -1) {
				return row + " " + index;
			}
			row++;
		}
		return -1 + "";
	}

	private int linearSearch(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

//	Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix
//	should also be sorted.
	public int[][] convertOneDToTwoDArray(int arr[], int row, int col) {
		if (row * col != arr.length) {
			System.out.println("Enter a valid array and row and column");
			return null;
		}
		int ans[][] = new int[row][col];
		int m = 0, n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (n >= col) {
				m++;
				n = 0;
			}
			ans[m][n++] = arr[i];
		}
		return ans;
	}

//	Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row
//	and column specified.

	public int elementSumInRange(int arr[][], int range[][]) {
		int sum = 0;
		for (int row = range[0][0]; row <= range[1][0]; row++) {
			for (int col = range[0][1]; col <= range[1][1]; col++) {
				sum += arr[row][col];
			}
		}
		return sum;
	}

//	Q4. Given a 2D array for n rows and m columns, reverse each row.

	public void reverseEachRowOfMatrix(int arr[][]) {
		for (int[] inArray : arr) {
			reverseArray(inArray);
		}
	}

	private void reverseArray(int[] inArray) {
		int start = 0, end = inArray.length - 1;
		while (start < end) {
			int temp = inArray[start];
			inArray[start] = inArray[end];
			inArray[end] = temp;
			start++;
			end--;
		}
	}

//	Q5. Check if an element x exists in the given sorted matrix or not. Each row and column
//	is sorted in itself. If it does not exist, return -1, else return its row and column index.

	public String checkElementExistOrNotForSorted(int arr[][], int element) {
		int row = 0;
		for (int[] inArray : arr) {
			int index = binarySearch(inArray, element);
			if (index > -1) {
				return row + " " + index;
			}
			row++;
		}
		return -1 + "";
	}

	private int binarySearch(int arr[], int element) {
		int start = 0, end = arr.length - 1;
		int mid = (start + end) / 2;
		while (start < end) {
			if (arr[start] == element) {
				return start;
			} else if (arr[mid] == element) {
				return mid;
			} else if (arr[end] == element) {
				return end;
			}
			if (arr[mid] < element) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
