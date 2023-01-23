package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// or ch = 'i';
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " Consonant");
		}

	}

}