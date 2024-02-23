package twoDArrayPrograms;
//This is the URL of that google drive from which you can take the reference if this assignment.

//https://drive.google.com/file/d/1o1tmkBygGg52nI33ukGNL3lA4zRQQVbh/view?usp=sharing
public class TwoDArrayProblems_3 {
	
//	Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
	public int[][] prefixSumMatrix(int arr[][]){
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				if(row>0&&col>0) {
					arr[row][col]+=(arr[row][col-1]+arr[row-1][col]);
				}else if(row<1&&col>0) {
					arr[row][col]+=arr[row][col-1];
				}else if(row>0&&col<1) {
					arr[row][col]+=arr[row-1][col];
				}
			}
		}
		return arr;
	}
	
//	Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
//		a) All the elements in the diagonals of the matrix are non-zero integers.
//		b) All other elements except the diagonal elements are 0.
//		Given a 2D integer array grid of size n*n representing a square matrix, return true if grid is a perfect matrix. Otherwise, return false.
	public boolean checkPerfectSquare(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				if(row==col||(row+col)==arr.length-1) {
					if(arr[row][col]==0) {
						return false;
					}
				}else {
					if(arr[row][col]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
//	Q3. Write a user defined function upper() which takes an integer square matrix as an input and its size N and prints the upper half of the matrix.
	public void printUpperMatrix(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for(int col=row;col<arr[0].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
