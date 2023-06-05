package com.Core2web.Nested_LOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que8_palindrome_nos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Ponit");
		int A = Integer.parseInt(br1.readLine());

		System.out.println("End Ponit");
		int B = Integer.parseInt(br1.readLine());
		System.out.println("reverse Numners");
		for (int i = 1; i <= B; i++) {
			int num = i;
			int rev = 0;
			while (num != 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if(rev==i) {
				System.out.println(rev);
			}
		}
	}

}
