package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que8_nonCommanElement {
	void nonCommanElement() throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(br1.readLine());
		int arr1[] = new int[x];
		System.out.println("Enter the Array Element : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(br1.readLine());
		}
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x1 = Integer.parseInt(br1.readLine());
		int arr2[] = new int[x1];
		System.out.println("Enter the Array Element : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(br2.readLine());
		}

		int flag = 0;
		System.out.println("Uncomman Element in Arrays: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr2[j]) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(arr1[i]);
			}
			flag = 0;
		}

		for (int i1 = 0; i1 < arr2.length; i1++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[j] == arr1[i1]) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(arr2[i1]);
			}
			flag = 0;
		}

	}

	public static void main(String[] args) throws IOException {
		Que8_nonCommanElement q1 = new Que8_nonCommanElement();
		q1.nonCommanElement();
	}

}
