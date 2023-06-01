package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que10_AdditionOfEvenNo_array {
	void Addition_Even_Array() throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(br1.readLine());
		int arr[] = new int[x];
		int sum = 0;
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}
		System.out.println("Elements Who's Addition is Even : ");
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}

			if (sum % 2 == 0) {
				System.out.println(arr[i]);
			}
			sum = 0;
		}

	}

	public static void main(String[] args) throws IOException {

		Que10_AdditionOfEvenNo_array Q1 = new Que10_AdditionOfEvenNo_array();
		Q1.Addition_Even_Array();
	}

}
