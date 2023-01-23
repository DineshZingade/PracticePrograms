package com.bridgelabz;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n = 10;
		// int m = 20;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Second  Number");
		int num2 = sc1.nextInt();
		System.out.println("Before Swap n :" + num1 + "  Before Swap m :" + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap n :" + num1 + "  After Swap m :" + num2);

	}

}