package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que9_Strong_Numbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Ponit");
		int A = Integer.parseInt(br1.readLine());

		System.out.println("End Ponit");
		int B = Integer.parseInt(br1.readLine());

		System.out.println();

		for (int i = A; i <= B; i++) {
			int num = i;
			int sum = 0;
			while (num != 0) {
				int rem = num%10;
				int fact = 1;
				for (int j = 1; j <= rem; j++) {
					fact = fact * j;
					sum = sum + fact;
					num = num/10;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
