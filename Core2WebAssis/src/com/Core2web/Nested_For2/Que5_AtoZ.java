package com.Core2web.Nested_For2;

public class Que5_AtoZ {

	public static void main(String[] args) {
		int A = 26;
		char a = 'Z';

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				if(j%2==1) {
					System.out.print(" "+(A--));
				}else {
					System.out.print(" "+(a--));
				}
			}
			System.out.println();
		}
	}

}
