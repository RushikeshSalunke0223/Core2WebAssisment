package com.Core2web.Nested_LOOP;

import java.util.Scanner;

public class Que6_pattern5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first character: ");
		char char1 = scanner.next().charAt(0);

		System.out.print("Enter the second character: ");
		char char2 = scanner.next().charAt(0);

		if (char1 == char2) {
			System.out.println("The characters are equal: " + char1);
		} else {
			int difference = Math.abs(char2 - char1);
			System.out.println("The difference between " + char1 + " and " + char2 + " is " + difference);
		}

		scanner.close();

	}

}
