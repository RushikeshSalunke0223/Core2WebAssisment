package com.Core2web.Nested_For2;

public class Que7_pattern7 {

	public static void main(String[] args) {
		int A = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (A % 2 == 1) {
					System.out.print(A * A + " ");
					A++;
				} else {
					System.out.print(A + " ");
					A++;
				}
			}
			System.out.println();
		}
	}

}
