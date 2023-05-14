package com.Core2web.Nested_For3;

public class Que10_1to9 {

	public static void main(String[] args) {
		int n=4;
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print((x++)+"  ");
			}
			x--;
			System.out.println();
		}


	}

}
