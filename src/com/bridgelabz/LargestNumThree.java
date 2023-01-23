package com.bridgelabz;

import java.util.Scanner;

public class LargestNumThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number");
		int num2 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Third Number");
		int num3 = sc2.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " First number is largest");
		} else if (num2 >= num1 && num2 >= num3) {

			System.out.println(num2 + " Second number is largest");
		} else if (num3 >= num1 && num3 >= num1)
			System.out.println(num3 + " Third number is largest");

	}

}