package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for (int i = 2; i < num / 2; i++) {// for prime number
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;

			}
		}
		if (num > 2) {
			System.out.println(num);
		} else

		if (num != 1) {
			System.out.println(num);
		}

	}

}