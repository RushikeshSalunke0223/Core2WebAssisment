package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que9_MargeArray {
	void MargeArray() throws NumberFormatException, IOException {
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

		int arr3[] = new int[x + x1];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[x + i] = arr2[i];
		}
		System.out.println("Margered Arrays : ");
		for (int i = 0; i < arr3.length; i++)
			;
		System.out.println(Arrays.toString(arr3));
	}

	public static void main(String[] args) throws IOException {
		Que9_MargeArray q1 = new Que9_MargeArray();
		q1.MargeArray();

	}

}
