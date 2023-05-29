package com.String.Pratice_Core2web.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class demoArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array here : ");
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(bReader.readLine());
		}
		System.out.println("here is the your array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
