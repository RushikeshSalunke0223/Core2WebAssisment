package com.Core2web.Nested_for4;

public class Que3_10to1reverce_pattern {

	public static void main(String[] args) {
		int n=4;
		int x=10;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(x-- + "  ");
			 }
			 x++;
			 System.out.println();
		 }

	}

}
