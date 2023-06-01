package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que6_BiggestElement_Arrays {
	void Biggest_Element() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(bReader.readLine());
		System.out.println("Enter the Arrays Element : ");
		int arr[] = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
		}

		// when anything we want to find from Array we use 2 for-loops
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Biggest Element In Array is : " + max);
	}

	public static void main(String[] args) throws IOException {
		Que6_BiggestElement_Arrays q6 = new Que6_BiggestElement_Arrays();
		q6.Biggest_Element();

	}

}
