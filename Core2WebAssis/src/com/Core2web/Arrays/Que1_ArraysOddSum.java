package com.Core2web.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que1_ArraysOddSum {

	void Odd() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("HOw many Element you want in Array  : ");
		int x = Integer.parseInt(bReader.readLine());
		int sum = 0;
		System.out.println("Enter the Array Element :  ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("here is Your array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("total of Odd element in Array \n" + sum);
	}

	public static void main(String[] args) throws IOException {
		Que1_ArraysOddSum que1 = new Que1_ArraysOddSum();
		que1.Odd();

	}
}