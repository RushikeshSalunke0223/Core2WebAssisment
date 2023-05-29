package com.Core2web.Nested_LOOP;

import java.util.Scanner;

public class Que7_Pattern6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		int count = 10;
		char letter = 'O';

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(count + " ");

				} else {
					System.out.print(letter + " ");

				}
				count--;
				letter--;
			}
			System.out.println();
		}

		scanner.close();

	}

}
