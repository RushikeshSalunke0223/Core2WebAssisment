package com.Core2web.WhileLoop;

public class Oue6_Sum_mul_Odd_Even {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		int mult = 1;

		while (n <= 10) {
			if (n % 2 == 0) {
				sum=sum+n;
			} else {
				mult=mult*n;
			}
			n++;
		}
		System.out.println("Sum of all Even no between 1 to 10= \n"+sum);
		System.out.println("multiplication of all Even no between 1 to 10= \n"+mult);

	}
}
