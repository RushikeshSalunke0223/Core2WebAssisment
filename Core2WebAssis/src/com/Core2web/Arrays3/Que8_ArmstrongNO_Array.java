package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que8_ArmstrongNO_Array {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want ");
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Enter the elements ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int count = 0;
			int sum = 0;
			while (n != 0) {
				count++;
				n = n / 10;
			}
			n = arr[i];

			while (n != 0) {
				int mul = 1;
				int rem = n % 10;
				for (int j = 0; j < count; j++) {
					mul = mul * rem;
				}
				sum = sum + mul;
				n = n / 10;
			}
			if (sum == arr[i]) {
				System.out.println("Storng no " + arr[i] + " found at " + i + " index");
			}
		}
	}
}
