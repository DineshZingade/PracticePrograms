package com.bridgelabz;

public class DefaultValue {
	boolean t;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;

	void Display() {
		System.out.println("boolean (default Value) = " + t);
		System.out.println("byte (default Value) = " + b);
		System.out.println("short (default Value) = " + s);
		System.out.println("int (default Value) = " + i);
		System.out.println("long (default Value) = " + l);
		System.out.println("float (default Value) = " + f);
		System.out.println("double (default Value) = " + d);
	}

	public static void main(String[] args) {
		DefaultValue d = new DefaultValue();
		System.out.println("Displaying Default values...");
		d.Display();
	}
}
