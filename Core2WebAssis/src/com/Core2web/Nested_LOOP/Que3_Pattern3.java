package com.Core2web.Nested_LOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que3_Pattern3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Rows : ");
		int Row = Integer.parseInt(bReader.readLine());

		for (int i = 1; i <= Row; i++) {
			int x = Row - i + 1;
			for (int j = Row; j >= i; j--) {
				System.out.print(x * i + " ");
				x--;
				
			}
			System.out.println();
		}
	}
}
