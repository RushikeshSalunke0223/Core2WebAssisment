package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_2D {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Elements YOu Wants : ");
		System.out.println("Enter the Rows You want ");
		int rows = Integer.parseInt(br1.readLine());
		System.out.println("Enter the Columns You want ");
		int cols = Integer.parseInt(br1.readLine());
		System.out.println("Enter the Array Elements : ");
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(br1.readLine());
			}
		}
		System.out.println("\n" + "Multidimentioal Array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
