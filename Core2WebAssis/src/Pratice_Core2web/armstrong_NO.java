package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class armstrong_NO {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number Here : ");

		int n = Integer.parseInt(bReader.readLine());
		int temp1 = n;
		int count = 0;
		int sum = 0;
		int temp = n;

		while (temp1 != 0) {
			count++;
			temp1 = temp1 / 10;
		}
		while (n != 0) {
			int rem = n % 10;
			int mult = 1;
			for (int i = 1; i <= count; i++) {
				mult = mult * rem;
			}
			sum = sum + mult;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("Not a Armstrong NO");
		}
	}
}
