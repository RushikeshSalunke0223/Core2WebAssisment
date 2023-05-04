package com.Core2web.WhileLoop;

public class Oue5_Even_no_Squers {

	public static void main(String[] args) {
		int n = 942111423;
		while (n != 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				System.out.println(rem * rem);
			}
			n = n / 10;
		}
		System.out.println();

	}
}
