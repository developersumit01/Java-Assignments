package arrayPrograms;

import java.util.Arrays;

//This is the URL of that google drive from which you can take the reference if this assignment.
// https://drive.google.com/file/d/1WEfT6xe34gqx7d_mEQoLOaFgPaVt4Kp4/view?usp=sharing

public class ProblemsOnArray_3 {
	
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

	public int consecutiveSeqSubArray(int arr[]) {

		int temp[] = { 1, 0 };
		int result = 0, val = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			val = ((val + arr[i]) % 2 + 2) % 2;
			temp[val]++;
		}
		result = temp[0] * temp[1];
		System.out.println(Arrays.toString(temp));
		return (result);
	}

//	This is the another approach to solve the Que 2. this is some time easy method to solve the given question.
	public int consecutiveSeqSubArray2(int arr[]) {
		int odd = 0, even = 0, sum = 0, ans = 0;
		for (int num : arr) {
			sum += num;
			if (sum % 2 == 0) {
				ans += odd;
				even++;
			} else {
				ans += 1 + even;
				odd++;
			}
		}
		return ans;
	}
//	Que 3.You are given an integer array height of length n. There are n vertical lines drawn such that the
//	two endpoints of the ith line are (i, 0) and (i, height[i]).
//	Find two lines that together with the x-axis form a container, such that the container contains the
//	most water.
//	Return the maximum amount of water a container can store.

	public int maxWater(int arr[]) {
		int maxWater = 0;
		int left = 0, right = arr.length - 1; // These are the two pointer which points two columns
		while (left < right) {
			int water = 0;
//			if left side column is small then we can store water to the height of left column
			if (arr[left] < arr[right]) {
				water = arr[left] * (right - left);
				if (water > maxWater) {
					maxWater = water;
				}
//			if right side column is small then we can store water to the height of right column
			} else {
				water = arr[right] * (right - left);
				if (water > maxWater) {
					maxWater = water;
				}
			}
//			We skip that column which height is sort from both.
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxWater;
	}
//	Que 4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
//	find two numbers such that they add up to a specific target number.
//	Return the indices of the two numbers added by one. Return -1 if pair does not exist.

	public String targetSum(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					return "" + (1 + i) + " " + (1 + j);
				}
			}
		}
		return "-1";
	}

//	Que 5. Given an array sorted in increasing order, return an array of squares of each number sorted
//	in increasing order.
	public int[] sortedSquareArray(int arr[]) {
		int start = 0, end = arr.length - 1;
		int k = arr.length;
		int[] ans = new int[arr.length];
		while (start <= end) {
			if (Math.abs(arr[start]) > Math.abs(arr[end])) {
				ans[--k] = arr[start] * arr[start];
				start++;
			} else {
				ans[--k] = arr[end] * arr[end];
				end--;
			}
		}
		return ans;
	}

}
