package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sumofArray {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many element you want : ");
		int arr1 = Integer.parseInt(bReader.readLine());
		int[] arr = new int[arr1];
		int sum = 0;
		System.out.println("Eneter the Array Element here: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			sum = sum + arr[i];
		}
		System.out.println("here is your Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Total Of Array : ");
		System.out.println(sum);
	}
}
