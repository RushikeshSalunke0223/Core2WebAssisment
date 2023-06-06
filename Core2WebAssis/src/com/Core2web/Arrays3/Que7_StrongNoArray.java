package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que7_StrongNoArray {

	public static void main(String[] args) throws IOException {
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
			int sum = 0;
			while (n != 0) {
				int rem = n % 10;
				int fact = 1;
				for (int j = 1; j <= rem; j++) {
					fact = fact * j;
				}
				sum = sum + fact;
				n = n / 10;
			}
			if (sum == arr[i]) {
				System.out.println("Storng no " + arr[i] + " found at " + i + " index");
			}
		}

	}

}
