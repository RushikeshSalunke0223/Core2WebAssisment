package com.Core2web.WhileLoop;

public class Oue9_Reverce_No {

	public static void main(String[] args) {
		int Num = 808724386;
		int sum = 0;
		int temp = Num;

		while (Num != 0) {
			int rev = Num % 10;

			sum = sum * 10 + rev;
			Num = Num / 10;

		}
		System.out.println(temp + " Affter Rev no " + sum);

	}

}
