package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {
	private static final Object name = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a name");
		String name = sc.nextLine();
		System.out.println("Name is : " + name);
	}

	void secondMethod() {

		String rev = " ";
		for (int i = ((String) name).length() - 1; i >= 0; i--) {
			rev = rev + ((String) name).charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println("Palindrom String");

		} else {
			System.out.println("Not a Palindrom String");
		}
	}
}