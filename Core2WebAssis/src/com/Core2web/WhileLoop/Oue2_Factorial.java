package com.Core2web.WhileLoop;


public class Oue2_Factorial {

	public static void main(String[] args) {
		int i = 1;
		int n = 6;
		int fact=1;
		while (i <= n) {
			{
				fact=fact*i;
				i++;
			}
			System.out.println("Fcatorial of "+n+" is "+fact);
		}
	}
}