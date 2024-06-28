package Recursion;

public class RecursionProblem4 {
	public static void main(String[] args) {
		RecursionProblem4 problem4 = new RecursionProblem4();
		System.out.println(problem4.changeBinary(10));
	}

//	Q1 - Given a number n. Print if it is an Armstrong number or not.
//	An Armstrong number is a number if the sum of every digit in that number raised to the power
//	of total digits in that number is equal to the number.
//	Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an Armstrong number.

	public boolean armstrongOrNot(int num) {
		int ans = serviceOfArmstrongOrNot(num, numberCount(num, 0));
		if (num == ans) {
			return true;
		} else {
			return false;
		}
	}

	private int serviceOfArmstrongOrNot(int num, int numberCount) {
		if (num < 10)
			return pow(num, numberCount);
		int ans = pow(num % 10, numberCount);
		return ans + serviceOfArmstrongOrNot(num / 10, numberCount);
	}

	private int pow(int num, int power) { // This method is use to calculate the power of number means p^q
		if (power == 1)
			return num;
		if (power % 2 == 0) {
			return num * num;
		} else {
			return num * num * num;
		}
	}

	private int numberCount(int num, int count) { // This method is use to count the number of digits in the number.
		if (num < 10) {
			return count + 1;
		}
		return numberCount(num / 10, count++);
	}

//	Q2 - Given a number n, check whether it's a prime number or not using recursion.

	public boolean isPrime(int num) {
		if (isDivide(num, num - 1)) {
			return false;
		} else {
			return true;
		}
	}

	private boolean isDivide(int num, int i) {
		if(i==1) {
			return false;
		}else if(num%i==0) {
			return true;
		}
		return isDivide(num, --i);
	}
	
//	Q4 - Given a decimal number as input, we need to write a program to convert the given
//	decimal number into its equivalent binary number.
	
	public String changeBinary(int num) {
		if(num<=1) {
			return ""+num;
		}
		return ""+changeBinary(num/2)+num%2;
	}
}
