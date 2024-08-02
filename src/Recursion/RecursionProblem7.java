package Recursion;

import java.util.ArrayList;

public class RecursionProblem7 {

//	Q1. Write a program to merge 2 strings alternately using recursion starting from the first input string.
	public String mergeString(String str1, String str2) {
		if (!str1.equals("") && !str2.equals(""))
			return "" + str1.charAt(0) + str2.charAt(0) + mergeString(str1.substring(1), str2.substring(1));
		else if (!str1.equals("")) {
			return str1;
		} else if (!str2.equals("")) {
			return str2;
		}
		return "";
	}

//	Q2. Given a string, find its first uppercase letter and return the remaining substring, starting from
//		the uppercase letter.

	public String substringFirstCharacterUpper(String str) {
		if (str.equals(""))
			return "";
		if ((int) str.charAt(0) >= 65 && (int) str.charAt(0) <= 90) {
			return str;
		}
		return substringFirstCharacterUpper(str.substring(1));
	}

//	Que 3. return all subsequence of the string in an arraylist.

	public ArrayList<String> allSubsecquence(String str) {
		ArrayList<String> ans = new ArrayList<String>();
		ans = helperOfAllSubsecquence(str, "", ans);
		return ans;
	}

	private ArrayList<String> helperOfAllSubsecquence(String str, String string, ArrayList<String> ans) {
		if (str.equals("")) {
			if (!string.equals(""))
				ans.add(string);
			return ans;
		}
		char temp = str.charAt(0);
		helperOfAllSubsecquence(str.substring(1), string + temp, ans);
		helperOfAllSubsecquence(str.substring(1), string, ans);
		return ans;
	}

//	Que 4. Given an array of integers print sum of all subset in it output sums can be printed in any order.

	public void subsetArray(int arr[]) {
		helperOfSubsetArray(arr, 0, 0);
	}

	private void helperOfSubsetArray(int[] arr, int index,int sum) {
		if(index>=arr.length) {
			System.out.println(sum);
			return;
		}
		helperOfSubsetArray(arr, index+1, sum+arr[index]);
		helperOfSubsetArray(arr, index+1, sum);
	}
	
	

}
