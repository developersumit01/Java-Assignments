package Recursion;

public class RecursionProblem7 {
	
//	Q1. Write a program to merge 2 strings alternately using recursion starting from the first input string.
	public String mergeString(String str1,String str2) {
		if(!str1.equals("")&&!str2.equals(""))
		return ""+str1.charAt(0)+str2.charAt(0)+mergeString(str1.substring(1), str2.substring(1));
		else if(!str1.equals("")) {
			return str1;
		}
		else if(!str2.equals("")) {
			return str2;
		}
		return "";
	}
	
//	Q2. Given a string, find its first uppercase letter and return the remaining substring, starting from
//		the uppercase letter.
	
	public String substringFirstCharacterUpper(String str) {
		if(str.equals("")) return "";
		if((int)str.charAt(0)>=65&&(int)str.charAt(0)<=90) {
			return str;
		}
		return substringFirstCharacterUpper(str.substring(1));
	}
	
}
