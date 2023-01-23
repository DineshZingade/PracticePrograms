package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 0;
		int tails = 0;
		int counter = 1;
		double randNum = 0.0;
		double HeadPercentage = 0.0;
		double TailPercentage = 0.0;
		Scanner in = new Scanner(System.in);

		System.out.println("How many times will the coin be flipped? ");
		int flips = in.nextInt();

		while (counter <= flips) {
			randNum = Math.random();
			System.out.print(counter + " " + randNum);

			if (randNum < .5) {
				heads++;
				System.out.println(" heads");
			} else {
				tails++;
				System.out.println(" tails");
			}
			counter++;
		}
		System.out.println();
		System.out.println("Number of Heads = " + heads);
		System.out.println("Number of Tails = " + tails);

		System.out.println();
		HeadPercentage = (heads * 100) / flips;
		TailPercentage = (tails * 100 / flips);
		System.out.println();
		System.out.println(HeadPercentage);
		System.out.println(TailPercentage);
	}
}