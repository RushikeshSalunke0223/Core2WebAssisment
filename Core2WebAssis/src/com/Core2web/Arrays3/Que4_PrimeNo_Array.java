package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_PrimeNo_Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements You want : ");
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Enter the Arrays Elements ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 2) {
				int count = 0;

				for (int j = 2; j * j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						count++;
					}
				}
				if (count == 0)
					System.out.println("prime no " + arr[i] + " Found at " + i + " index");
			}
		}

	}

}
