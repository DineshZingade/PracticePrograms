package com.bridgelabz;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be cheak");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " Even Number");
		} else {
			System.out.println(n + " Odd Number");
		}

	}
}