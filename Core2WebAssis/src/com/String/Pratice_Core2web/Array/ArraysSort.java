package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class ArraysSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(br1.readLine());
		int arr[] = new int[x];
		System.out.println("Enter the All Element ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("Sorted Arrays" + Arrays.toString(arr));

	}

}
