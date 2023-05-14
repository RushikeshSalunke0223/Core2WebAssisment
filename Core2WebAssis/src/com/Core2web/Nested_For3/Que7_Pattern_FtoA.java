package com.Core2web.Nested_For3;

public class Que7_Pattern_FtoA {

	public static void main(String[] args) {
		int n=6;
		char ch='F';
		for(int i=1;i<=n;i++) {
			char temp=ch;
			for(int j=1;j<=i;j++) {
				System.out.print((temp++)+"  ");
			}
			ch--;
			System.out.println();
		}


	}

}
