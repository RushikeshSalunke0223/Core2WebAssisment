package com.Core2web.Nested_for4;

public class Que4_pattern1t04 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n-i+1; j++) {				
				System.out.print((i+j)-1+"  ");
			}
			System.out.println();
		}

	}

}
