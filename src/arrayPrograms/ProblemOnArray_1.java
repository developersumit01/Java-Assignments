package arrayPrograms;

//	This is the URL of that google drive from which you can take the reference if this assignment.
//	https://drive.google.com/file/d/1AFdV8ZNy-yAlaGtw6C4Uv4rXosuJn_cz/view?usp=sharing

public class ProblemOnArray_1 {
	
//	Que 1. Given an array sorted in increasing order of size n and an integer x, find if there exists a
//	pair in the array whose absolute difference is exactly x.(n>1)
	
	public boolean checkDifferencePair(int arr[],int num) {
		int first=0,second=1;
		while(second<arr.length) {
			int diff=Math.abs(arr[first]-arr[second]);
			if(diff==num) {
				return true;
			}
			first++;
			second++;
		}
		return false;
	}
	
//	Que 2. Given an array of size n, find the total number of occurrences of given number x.
	
	public int numberOfOccurrence(int arr[],int num) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		return count;
	}
	
//	Que 3. Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//	missing number from the first N integers. There are no duplicates in the list.
	
	public int missingNumber(int arr[],int num) {
		int sum=(num*(num+1))/2;
		int arraySum=0;
		for(int i=0;i<arr.length;i++) {
			arraySum+=arr[i];
		}
		return sum-arraySum;
	}
}
