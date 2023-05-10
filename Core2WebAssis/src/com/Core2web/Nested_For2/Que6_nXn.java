package com.Core2web.Nested_For2;

public class Que6_nXn {

	public static void main(String[] args) {
		int A = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(A * A + " ");
				A++;
			}
			System.out.println();
		}
	}

}
