package Recursion;

public class RecursionProblem3 {
	public static void main(String[] args) {
		RecursionProblem3 problem3=new RecursionProblem3();
		problem3.printPattern(16, 16, true);
	}
	
//	Q1 - Given a number n, print the following pattern without using any loop.
//	n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
	/*
	 * num=it is the number from where you want to print the pattern.
	 * orignalNumber= It is also that number from where you want to print the pattern.
	 * ## this number help to check we react the last number of the pattern
	 * 
	 * For developer -> We can solve this issue to get extra parameter from user after making another method. 
	 */
	public void printPattern(int num,int orignalNumber,boolean flag) {
		if(!flag&&num==orignalNumber) return;
		if(num<=0) {
			flag=false;
		}
		System.out.print(num+", ");
		if(flag) {			
			printPattern(num-5,orignalNumber, true);
		}else {
			printPattern(num+5, orignalNumber, false);
		}
	}
	
//	Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
//	numbers is defined as following:
//	If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//	Else :SUM(n, 1) = Sum of first n natural numbers.
}
