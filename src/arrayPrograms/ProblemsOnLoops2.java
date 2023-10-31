package arrayPrograms;

import java.util.Scanner;
// This is the URL of that google drive from which you can take the reference if this assignment.
// https://drive.google.com/file/d/1OLzVrzWT8be1mi1yqAtqRb0d6WhH8FPE/view?usp=sharing

public class ProblemsOnLoops2 {
//	Que 1. Write a program to print Fibonacci series of n terms where n is input by user.
	public void fibonacciSeries(int n) {
		int first = 0, second = 1;
		if (n < 1) {
			System.out.println("Invalid input");
		} else if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.println(first + " " + second + " ");
		} else {
			System.out.print(first + " " + second + " ");
			for (int i = 2; i < n; i++) {
				int third = first + second;
				System.out.print(third + " ");
				first = second;
				second = third;
			}
		}
	}

//	  Que 2. Write a program to enter the numbers till the user wants, the number can be positive,
//	  negative or zero. Calculate the sum of numbers until a negative number is encountered.
//	  If the input is a negative number, current sum is discarded and print -1.

	public void printSum() {
		int num = 0, sum = 0;
		System.out.println("Sum any number you want");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			num = scanner.nextInt();
			if (num < 0) {
				System.out.println(-1);
				break;
			} else {
				sum += num;
				System.out.println(sum);
			}
		}
		scanner.close();
	}

//	Que 3. Write a program to calculate the factorial of a number.
	public void factorial(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println(fac);
	}

//	Que 4. Write a program to print all Armstrong numbers between 1 to n.
	public void armstrong(int n) {
		for (int i = 1; i <= n; i++) {
			int digit = (int) Math.log10(i) + 1;
			int sum = 0;
			int num = i;
			while (num > 0) {
				sum += (int) Math.pow(num % 10, digit);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(sum);
			}
			sum = 0;
		}
	}

//	Que 5. Write a program to print the cross pattern given below (in the shape of X):

	public void printX(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

//	Que 6. Write a program to print alphabet diamond pattern. 
	public void diamondPattern(int num) {
		if (num > 24) {
			System.out.println("The input number should be less then 24");
			return;
		}
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch <= 'A' + (i * 2); ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for (int i = num - 2; i >= 0; i--) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch <= 'A' + (i * 2); ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

//	Que 7. Write a program to print pattern given below.
//	  *
//	  *
//
//	*****
//
//	  *
//	  *
	public void addPattern(int num) {

		if (num < 0) {
			System.out.println("Invalid input");
			return;
		} else if (num % 2 == 0) {
			num++;
		}

		for (int i = 0; i < num + 2; i++) {
			if (i == (num + 2) / 2) {
				for (int n = 0; n < num; n++) {
					System.out.print("*");
				}
			}
			if (i == ((num + 2) / 2) - 1 || i == ((num + 2) / 2) + 1) {
				System.err.println();
				continue;
			}
			if (i != (num + 2) / 2) {
				for (int n = 0; n < (num / 2); n++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}

	}

//		Que 8. Write a program to print a triangle of prime numbers up to given number of lines of the trinagle.
	public void numberPattern(int num) {
		int nOL = (num * (num + 1)) / 2; // nOL stands for Number Of lines
		int index = 0;
		ProblemsOnLoops2 loops2 = new ProblemsOnLoops2();
		int prime[] = loops2.findPrime(nOL);
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (int ch = 0; ch <= i; ch++) {
				System.out.print(prime[index++] + " ");
			}
			System.out.println();
		}

	}

//	This method is use to find all prime number and return an array of prime number.
	private int[] findPrime(int n) {
		int i = 1;
		int k = -1;
		int arr[] = new int[n];
		while (n > 0) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
				if (count > 0) {
					break;
				}
			}
			if (count == 0) {
				arr[++k] = i;
				n--;
			}
			i++;
		}
		return arr;
	}

//	Que 9. Write a program to check whether a prime Number can be expressed as a Sum of TwoPrime Numbers.
	public boolean sumOfindivisualdigits(int num) {
		num = num - 2;
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

//	Que 10. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits
//	the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb
//	is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will
//	be switched on after n fluctuations.
//	Take as input a number n, representing the number of bulbs.
//	Print all the bulbs that will be on after the nth fluctuation in voltage.
	public void bulb(int n) {
		for (int i = 1; i * i <= n; i++) {
			System.out.print(i * i + " ");
		}
	}

}
