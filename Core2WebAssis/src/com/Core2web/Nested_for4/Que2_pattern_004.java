package com.Core2web.Nested_for4;

public class Que2_pattern_004 {

	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((x++)+"  ");
			}
			x++;
			System.out.println();
		}

	}

}
