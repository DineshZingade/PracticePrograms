package com.bridgelabz;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divident");

		int divident = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Divisor");
		int divisor = sc.nextInt();
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		System.out.println("Quotient" + quotient);
		System.out.println("Remainder" + remainder);
	}

}