package com.Core2web.Nested_for4;

public class Que9_pttern_sqrtroot {

	public static void main(String[] args) {
		int  n=4;
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print(temp*temp*temp+"  ");
				}else {
					System.out.print(temp*temp+"\t");
				}
				
			}
			temp++;
			System.out.println();
		}

	}

}
