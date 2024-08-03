package Recursion;

public class RecursionProblem8 {
	public static void main(String[] args) {
		RecursionProblem8 problem8 = new RecursionProblem8();
		char arr[] = { 'a', 'b' };
		problem8.allPossibleString(arr, 2);

	}

//	Q1. Given the number of digits n in a number, print all n-digit numbers whose digits are strictly
//		increasing from left to right.
	public void printDigits(int n) {
		printDigits(1, n);
	}

	public void printDigits(int n, int len) {
		String temp = n + "";
		if (temp.length() > len)
			return;
		if (checkIncreasingOrder(n, n / 10, n % 10)) {
			System.out.println(n + " ");
		}
		printDigits(n + 1, len);
	}

	private boolean checkIncreasingOrder(int num, int n, int prevDigit) {
		if (num < 10) {
			return true;
		}
		if (prevDigit > n % 10) {
			return checkIncreasingOrder(num / 10, n / 10, n % 10);
		} else {
			return false;
		}
	}

	public void specialString(int n) {
		specialString(n, "", 0, 0);
	}

	private void specialString(int remainChar, String ans, int star, int dash) {
		if (remainChar <= 0) {
			System.out.println(ans);
			return;
		}
		specialString(remainChar - 1, ans + "*", star + 1, dash);
		if (star > dash) {
			specialString(remainChar - 1, ans + "_", star, dash + 1);
		}
	}

//	Q3. Given a set of characters and a positive integer k, print all possible strings of length k that
//	can be formed from the given set.

//	Note : This method is not giving the right output it showing the exception, i will complete it very soon. 
	
	public void allPossibleString(char str[], int len) {
		allPossibleString(str, 0, "", len);
	}

	private void allPossibleString(char arr[], int index, String ans, int len) {
		if (ans.length() >= len) {
			System.out.println(ans);
			return;
		}
		if (index < len) {
			allPossibleString(arr, index + 1, ans + arr[index], len);
		} else {
			allPossibleString(arr, 0, ans + arr[0], len);
		}
		allPossibleString(arr, index + 1, ans, len);
	}

//	Q5. A string is called special if it consists of only stars(‘*’) and dashes(‘-’), and there are no
//	consecutive stars in the string. Given a positive integer k, print all the special strings of size k.

	public void specialStringNoConsecutiveStar(int n) {
		specialStringNoConsecutiveStar(n, "", true);
	}

	private void specialStringNoConsecutiveStar(int remainChar, String ans, boolean star) {
		if (remainChar <= 0) {
			System.out.println(ans);
			return;
		}
		if (star) {
			specialStringNoConsecutiveStar(remainChar - 1, ans + "*", false);
		}
		specialStringNoConsecutiveStar(remainChar - 1, ans + "_", true);
	}
}
