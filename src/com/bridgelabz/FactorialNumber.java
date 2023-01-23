package com.bridgelabz;

public class FactorialNumber {
	public static void main(String[] args) {
		int num = 10;
		long factorial = multiplyNumbers(num);
		System.out.println("Factorial of " + num + " = " + factorial);
	}

	private static long multiplyNumbers(int num) {
		if (num >= 1)
			return num * multiplyNumbers(num - 1);
		else

			return 1;
	}
}
