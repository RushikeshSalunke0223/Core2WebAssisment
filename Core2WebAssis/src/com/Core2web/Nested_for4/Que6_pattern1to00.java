package com.Core2web.Nested_for4;

public class Que6_pattern1to00 {

	public static void main(String[] args) {
		int n=4;
		int x=1;
		for(int i=1;i<=n;i++) {
			int temp=x;
			for(int j=1;j<=i;j++) {
				System.out.print(temp++ + "  ");
			}
			x++;
			System.out.println();
		}
	}

}
