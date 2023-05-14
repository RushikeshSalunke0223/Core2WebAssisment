package com.Core2web.Nested_For3;

public class Que3_10to1Triangle {

	public static void main(String[] args) {
		int n = 4;
		int m = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((m--) + "  ");
			}
			System.out.println();
		}
	}

}
