package com.bridgelabz;

import java.util.Scanner;

public class HormonicSeries {
	public static void main(String[] args) {

		System.out.println("Enter any Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Hormonic Series ");
		double result = 0.0;
		/*
		 * while(num>0) { result = (double)1/num; num--;
		 */
		for (int i = 1; i <= num; i++) {
			result = (double) 1 / i;

			System.out.println(result + " ");
		}
		System.out.println(" ");
		System.out.println("nth Hormonic Serioes output " + result);
	}

}
