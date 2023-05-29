package com.Core2web.Nested_LOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2_pattern2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ebter the Rows : ");
		int Row=Integer.parseInt(bReader.readLine());
		
		for(int i=1;i<=Row;i++) {
			for( int j=1;j<=Row;j++) {
				if(i==j) {
					System.out.print("  # ");
				}else {
					System.out.print("  = ");
				}
			}
			System.out.println();
		}

	}

}
