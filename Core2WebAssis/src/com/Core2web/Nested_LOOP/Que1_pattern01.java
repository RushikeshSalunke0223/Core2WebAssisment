package com.Core2web.Nested_LOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que1_pattern01 {

	public static void main(String[] args) throws IOException{
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Rows : ");
		
		int Row=Integer.parseInt(bReader.readLine());
		int num=Row;
		char ch=(char) (Row+64);
		for(int i=1;i<=Row;i++) {
			for(int j=1;j<=Row;j++) {
				if(i%2==1) {
					System.out.print(num-- +""+ch-- +" ");
				}else {
					System.out.print(num++ +""+ch++ +" ");
				}
			}
			if(i%2==1) {
				num++;
				ch++;
			}else {
				num--;
				ch--;
			}
			System.out.println();
		}
	}

}
