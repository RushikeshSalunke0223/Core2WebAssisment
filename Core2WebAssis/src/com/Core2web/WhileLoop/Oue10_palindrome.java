package com.Core2web.WhileLoop;

public class Oue10_palindrome {

	public static void main(String[] args) {
		int num=112211;
		int temp=num;
		int c=0;
		
		while(num!=0) {
			int rev=num%10;
			c=c*10+rev;
			num=num/10;
		}
		if(temp==c) {
			System.out.println(temp+" Its Palinedrome No ");
		}else {
			System.out.println(temp+" Its Not a Palinedrome NO ");
		}

	}

}
