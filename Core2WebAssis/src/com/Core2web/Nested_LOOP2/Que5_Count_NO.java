package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5_Count_NO {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements You wants : ");
		int A=Integer.parseInt(bReader.readLine());
		
		int count=0;
		
		do {
			System.out.println("Enter Numbers ");
			int x=Integer.parseInt(bReader.readLine());
			
			int temp=x;
			int cnt=0;
			while(temp!=0) {
				cnt++;
				temp=temp/10;
			}
			System.out.println("numbers "+x+" has "+cnt+" digits");
			count++;
			
		}while(count!=A);
	}

}
