package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que1_ArraysElementsReverce {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements You Wants : ");
		int A = Integer.parseInt(br1.readLine());
		System.out.println("Enter the Arrays elements  ");
		int[] arr = new int[A];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}
		System.out.println("Arrsy is \n"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int count=0;
			while(temp!=0) {
				temp=temp/10;
				count++;
			}
			System.out.println("Count of digit element : = "+count+" = "+arr[i]);
		}

	}
}
