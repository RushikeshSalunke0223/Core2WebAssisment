package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que6_perfectNumber {

	public static void main(String[] args)throws IOException {
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start point");
		int A=Integer.parseInt(br1.readLine());
		
		System.out.println("End point");
		int B=Integer.parseInt(br1.readLine());

		for(int i=A;i<=B;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i+"\t");
			}
		}
	}

}
