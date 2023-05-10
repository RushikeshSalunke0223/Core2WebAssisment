package com.Core2web.Nested_For2;

public class Que9_pattern9 {

	public static void main(String[] args) {
		int n=3;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			int num=n;
			char ch='C';
			
			for(int j=1;j<=n;j++) {
				System.out.print(x*x+""+(ch--)+""+(num--)+" ");
				x++;
			}
			System.out.println();
		}
	}

}
