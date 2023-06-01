package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5_SmallestElement_Array {
	void SmallestElement() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(bReader.readLine());
		System.out.println("Enter the Arrays Element : ");
		int arr[] = new int[x];
		
		for (int i = 0; i < x; i++) {
			arr[i]=Integer.parseInt(bReader.readLine());
		}
		
		//when anything we want to find from Array we use 2 for-loops
		int min = arr[0];
		for( int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Smallest Element In Array is : "+min);
	}

	public static void main(String[] args) throws IOException {
		Que5_SmallestElement_Array q5 = new Que5_SmallestElement_Array();
		q5.SmallestElement();

	}

}
