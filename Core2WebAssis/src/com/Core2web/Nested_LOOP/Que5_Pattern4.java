package com.Core2web.Nested_LOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5_Pattern4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows: ");

		int rows = Integer.parseInt(bReader.readLine());
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= rows; i++) {
			c = a + b;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				int temp = a;
				a = b;
				b = temp + b;
			}
			System.out.println();
		}

	}

}
