package com.bridgelabz;

public class DemontrateStatic {
	static int x = 10;
	static int y;

	static void func(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	static {
		System.out.println("Running static initialization block.");
		y = x + 5;
	}

	public static void main(String args[]) {
		System.out.println("Demonstration of Static Import in Java");
		int a = 10;
		System.out.println("Value of a is: " + a);

		func(8);
	}

}
