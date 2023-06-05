package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que1_GivenRange_Div5_or_Even {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Ponit");
		int A = Integer.parseInt(br1.readLine());

		System.out.println("End Point");
		int B = Integer.parseInt(br1.readLine());
		int count = 0;
		for (int i = A; i < B; i++) {
			if (i % 5 == 0 || i % 2 == 0) {
				count++;
			}

		}
		System.out.println("count = " + count);

	}

}
