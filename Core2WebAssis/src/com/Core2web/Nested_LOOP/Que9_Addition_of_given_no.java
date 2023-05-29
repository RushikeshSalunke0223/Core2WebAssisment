package com.Core2web.Nested_LOOP;

import java.util.Scanner;

public class Que9_Addition_of_given_no {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int sum = 0;
		int temp = number;

		while (temp != 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;
		}

		System.out.println("Addition of factorials of each digit from " + number + " = " + sum);

		scanner.close();
	}

	public static int factorial(int number) {
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact *= i;
		}

		return fact;

	}

}
