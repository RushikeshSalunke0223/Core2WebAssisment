package com.Core2web.WhileLoop;

public class Oue4_OddEbenInRandomNO {

	public static void main(String[] args) {
		int i = 808724386;
		int n = 0;
		while (i != 0) {
			int r = i % 10;
			if (r % 2 == 1) {
				n++;
			}
			i = i / 10;
		}
		System.out.println("count of odd numbers " + n);

	}

}
