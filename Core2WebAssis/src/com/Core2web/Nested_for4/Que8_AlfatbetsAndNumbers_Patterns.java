package com.Core2web.Nested_for4;

public class Que8_AlfatbetsAndNumbers_Patterns {

	public static void main(String[] args) {
		int n=4;
		int x=10;
		char ch='J';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print((ch)+"  ");
				}else {
					System.out.print(x +"  ");
				}
				x--;
				ch--;
			}

			System.out.println();
		}

	}

}
