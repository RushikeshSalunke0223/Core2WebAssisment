package com.Core2web.Nested_for4;

public class Que7_char_and_num_mix_pattern {

	public static void main(String[] args) {
		int n=6;
		int x=1;
		char ch='F';
		for(int i=1;i<=n;i++) {
			char ch1=ch;
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print(ch1++ +"  ");
				}else {
					System.out.print((x++)+"  ");
				}
			}
			ch--;
			System.out.println();
		}

	}

}
