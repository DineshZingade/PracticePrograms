package com.bridgelabz;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {

        String number = "13";
        int numLength = number.length();
        System.out.println(numLength);
        String numberToWord = "";

        for (int j = 0; j < numLength; j++) {

            switch (number.charAt(j)) {

                case '1': {  
                    numberToWord = numberToWord + "one";
                    break;
                }
                case '2': { 
                    numberToWord = numberToWord + "two";
                    break;
                }
                case '3': {
                    numberToWord = numberToWord + "three";
                    break;
                }
                case '4': {
                    numberToWord = numberToWord + "four";
                    break;
                }
                case '5': {
                    numberToWord = numberToWord + "five";
                    break;
                }
                case '6': {
                    numberToWord = numberToWord + "six";
                    break;
                }
                case '7': {
                    numberToWord = numberToWord + "seven";
                    break;
                }
                case '8': {
                    numberToWord = numberToWord + "eight";
                    break;
                }
                case '9': {
                    numberToWord = numberToWord + "nine";
                    break;
                }
                default: {
                    numberToWord = numberToWord + "zero";
                }
            }
        }
        System.out.println(numberToWord);
    }
}