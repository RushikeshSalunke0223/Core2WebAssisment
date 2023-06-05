package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaggedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how manay Rows you want ");
		int a = Integer.parseInt(br1.readLine());
		int arr[][] = new int[a][];
		System.out.println("How many elements you want in 0 index");
		int x = Integer.parseInt(br1.readLine());
		arr[0] = new int[x];
		System.out.println("How many elements you want in 1 index");
		int y = Integer.parseInt(br1.readLine());
		arr[1] = new int[y];
		System.out.println("How many elements you want in 2 index");
		int z = Integer.parseInt(br1.readLine());
		arr[2] = new int[z];

		System.out.println("Enter Arrays Elemens  : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(br1.readLine());
			}
			System.out.println();
		}
		
		System.out.println("This JAGGED Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
