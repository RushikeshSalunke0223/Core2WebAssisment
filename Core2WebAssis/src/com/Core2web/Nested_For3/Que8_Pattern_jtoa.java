package com.Core2web.Nested_For3;

public class Que8_Pattern_jtoa {

	public static void main(String[] args) {
		int n=4;
		char ch='J';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((ch--)+"  ");
			}
			System.out.println();
		}


	}

}
