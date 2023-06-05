package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que10_ArmStrong {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Point");
		int A = Integer.parseInt(br1.readLine());

		System.out.println("End Point");
		int B = Integer.parseInt(br1.readLine());

		System.out.println();

		for (int i = A; i <= B; i++) {
			int temp1 = i;
			int count = 0;
			int sum = 0;
			while (temp1 != 0) {
				count++;
				temp1 = temp1 / 10;
			}
			while (i != 0) {
				int rem = i % 10;
				int mult = 1;
				for (int j = 1; j <= count; j++) {
					mult = mult * rem;
				}
				sum = sum + mult;
				i = i / 10;
			}

			if (sum == i) {
				System.out.println(i);
			}
		}
	}

}