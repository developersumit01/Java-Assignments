package arrayPrograms;

import java.util.Scanner;
// You can access this assignment from the below link of google drive.

// https://drive.google.com/file/d/1OLzVrzWT8be1mi1yqAtqRb0d6WhH8FPE/view?usp=sharing

public class ProblemsOnLoops2 {
	public static void main(String[] args) {
		ProblemsOnLoops2 loops2=new ProblemsOnLoops2();
		loops2.printX(5);
	}
//	Que. Write a program to print Fibonacci series of n terms where n is input by user.
	public void fibonacciSeries(int n) {
		int first=0,second=1;
		if(n<1) {
			System.out.println("Invalid input");
		}else if(n==1) {
			System.out.println(first);
		}else if(n==2){
			System.out.println(first+" "+second+" ");
		}else {			
			System.out.print(first+" "+second+" ");
			for(int i=2;i<n;i++) {
				int third=first+second;
				System.out.print(third+" ");
				first=second;
				second=third;
			}
		}
	}
	
	
//	  Que. Write a program to enter the numbers till the user wants, the number can be positive,
//	  negative or zero. Calculate the sum of numbers until a negative number is encountered.
//	  If the input is a negative number, current sum is discarded and print -1.
	
	public void printSum() {
		int num=0,sum=0;
		System.out.println("Sum any number you want");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			num=scanner.nextInt();
			if(num<0) {
				System.out.println(-1);
				break;
			}else {
				sum+=num;
				System.out.println(sum);
			}
		}
		scanner.close();
	}
	 
//	Que. Write a program to calculate the factorial of a number.
	public void factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		System.out.println(fac);
	}
	
//	Que. Write a program to print all Armstrong numbers between 1 to n.
	public void armstrong(int n) {
		for(int i=1;i<=n;i++) {
			int digit=(int)Math.log10(i)+1;
			int sum=0;
			int num=i;
			while(num>0) {
				sum+=(int)Math.pow(num%10, digit);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(sum);
			}
			sum=0;
		}
	}
	
//	Que. Write a program to print the cross pattern given below (in the shape of X):
	
	public void printX(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i+j==(n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
