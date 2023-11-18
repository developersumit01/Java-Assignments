package arrayPrograms;

import java.util.Arrays;

//This is the URL of that google drive from which you can take the reference if this assignment.
// https://drive.google.com/file/d/1WEfT6xe34gqx7d_mEQoLOaFgPaVt4Kp4/view?usp=sharing

public class ProblemsOnArray_3 {
	public static void main(String[] args) {
		ProblemsOnArray_3 array_3 = new ProblemsOnArray_3();
		int arr[] = { 1, 2, 3, 5, 5, 3, 4, 4, 4, 5 };
		System.out.println(array_3.howManyUniqueInteger(arr, 2));
	}

//	Que 1. Given an integer m, n, and n integers, return true if the number of unique integers among the n
//	integers is greater than or equal to m, else return false.(Integers appearing multiple times are all
//	considered as 1 unique integer)
	public boolean howManyUniqueInteger(int[] arr, int num) {
		Arrays.sort(arr);
		int count = 0, n = arr[0], dublicate = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == n) {
				dublicate++;
				continue;
			} else {
				if (dublicate == 0) {
					count++;
				}
				if (dublicate == 0 && i == arr.length - 1) {
					count++;
				}
				n = arr[i];
			}
			dublicate = 0;
		}
		if (num <= count) {
			return true;
		}
		return false;
	}
	
//	Que 2. Given an integer array arr, return the number of consecutive sequences(subarrays) with
//	odd sum.
	
	
}
