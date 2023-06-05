package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2_compositrnumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Point ");
		int A = Integer.parseInt(br1.readLine());

		System.out.println("End Point");
		int B = Integer.parseInt(br1.readLine());

		for (int i = A; i < B; i++) {
			int count = 0;
			for (int j = 1; j * j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count >= 2) {
				System.out.println(i);
			}
		}
	}
}
