package com.Core2web.Nested_LOOP;

import java.util.Scanner;

public class Que10_prime_no_series {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the starting number: ");
		int start = scanner.nextInt();

		System.out.print("Enter the ending number: ");
		int end = scanner.nextInt();

		System.out.print("Series = ");
		for (int number = start; number <= end; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}

		scanner.close();
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
