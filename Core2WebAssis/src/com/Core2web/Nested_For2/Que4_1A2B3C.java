package com.Core2web.Nested_For2;

public class Que4_1A2B3C {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			int A = 1;
			char a = 'A';
			for (int j = 1; j <= 3; j++) {
				System.out.print((A++)+""+(a++)+" ");
			}
			System.out.println();
		}
	}
}
