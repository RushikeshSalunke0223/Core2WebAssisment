package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysEvenElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many element you want : ");
		int arr1 = Integer.parseInt(bReader.readLine());
		int[] arr = new int[arr1];
		int Even = 0, Odd = 0;
		System.out.println("Eneter the Array Element here: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			if (arr[i] % 2 == 0) {
				Even++;
			} else {
				Odd++;
			}
		}
		System.out.println("Here is your Array : ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("total Element of Even Number's In Array : " + Even);
		System.out.println("total Element of Odd Number's In Array : " + Odd);

	}
}
