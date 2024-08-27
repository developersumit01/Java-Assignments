package Recursion;

import java.util.ArrayList;

public class RecursionProblem9 {

	public static void main(String[] args) {
		RecursionProblem9 problem9 = new RecursionProblem9();
		problem9.beautifulString(5);

	}



//	Q1 - You are given a string. Your task is to divide the string into palindromic substrings. Print all such
//		partitions.
	public void dividePalindrom(String str) {
		ArrayList<String> list = new ArrayList<String>();
		dividePalindrom(str, list, 0);
	}

	private void dividePalindrom(String str, ArrayList<String> list, int idx) {
		if (idx == str.length()) {
			System.out.println(list);
			return;
		}
		String curr = "";
		for (int end = idx; end < str.length(); end++) {
			curr += str.charAt(end);
			if (checkPalindrom(curr)) {
				list.add(curr);
				dividePalindrom(str, list, end + 1);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean checkPalindrom(String str) {
		StringBuffer newStr = new StringBuffer(str);
		StringBuffer revStr = newStr.reverse();
		String rev = "" + revStr;
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

//	Q2 - A string is called beautiful if is an even length string consisting of only stars(‘*’) and dashes(‘-’). Further
//	the number of stars in the first half of the string should be equal to the number of stars in the second half of
//	the string. Given a number n, print all the beautiful strings of length 2 * n.

	public void makeBeautifulString(int n) {
		helperOfMakeButifulString(n, "", 0);
	}

	private void helperOfMakeButifulString(int n, String ans, int star) {
		if (ans.length() >= n * 2) {
			if (star == 0) {
				System.out.println(ans);
			}
			return;
		}
		if (ans.length() >= n) {
			if (star >= 0) {
				helperOfMakeButifulString(n, ans + "*", star - 1);
			}
			helperOfMakeButifulString(n, ans + "_", star);
		} else {
			helperOfMakeButifulString(n, ans + "*", star + 1);
			helperOfMakeButifulString(n, ans + "_", star);
		}
	}

//	Q3 - A string is called beautiful if it consists of only stars(‘*’) and dashes(‘-’). Further the number of stars in
//	the first half of the string should be equal to the number of stars in the second half of the string. Given a
//	number n, print all the beautiful strings of length n. If the value of n is odd, the middle value can be either
//	'*' or '-'
	public void beautifulString(int n) {
		if(n%2==0) {
			helperOfMakeButifulString(n/2, "", 0);
		}else {
			beautifulStringOfOddLength(n, "", 0);
		}
	}
	
	private void beautifulStringOfOddLength(int n, String ans, int star) {
		if (ans.length() >= n) {
			if (star == 0) {
				System.out.println(ans);
			}
			return;
		}
		if (ans.length() == n / 2) {
			beautifulStringOfOddLength(n, ans + "*", star);
			beautifulStringOfOddLength(n, ans + "_", star);
		} else if (ans.length() >= n/2) {
			if (star >= 0) {
				beautifulStringOfOddLength(n, ans + "*", star - 1);
			}
			beautifulStringOfOddLength(n, ans + "_", star);
		} else {
			beautifulStringOfOddLength(n, ans + "*", star + 1);
			beautifulStringOfOddLength(n, ans + "_", star);
		}
	}
	
}
