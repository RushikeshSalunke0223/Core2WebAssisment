package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_perfect_Qube {

	public static void main(String[] args) throws  IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Point");
		int A=Integer.parseInt(br1.readLine());
		
		System.out.println("End Point");
		int B=Integer.parseInt(br1.readLine());
		
		int count=0;
		for(int i=A;i<=B;i++) {
			for(int j=1;j*j*j<=i;j++) {
				if(j*j*j==i) {
					System.out.println(i+"\t");
					count++;
				}
			}
		}
		System.out.println(count+" counts");

	}

}
