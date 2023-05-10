package com.Core2web.Nested_For2;

public class Que10_pattern10 {

	public static void main(String[] args) {
		int row = 6;

		for (int i = 1; i <= row; i++) {
			int x = row;
			char ch = 'F';

			for (int j = 1; j <= row; j++) {

				if (j % 2 == 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print(x + " ");
				}
				ch--;
				x--;
			}
			System.out.println();
		}
	}

}
