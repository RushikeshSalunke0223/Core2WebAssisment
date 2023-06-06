package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que10_minNo_in_Array {

	public static void main(String[] args)throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want ");
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Enter the elements ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}
		if (x > 2) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} else {
			System.out.println("you hav enter the correct size" + x);
		}
		System.out.println("Secount largest no in array is : " + arr[1]);
	}

}
