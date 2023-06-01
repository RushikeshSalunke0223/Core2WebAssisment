package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_FindIndex_Array {
	void getIndex() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(bReader.readLine());
		System.out.println("Enter Element Of Array : ");
		int arr[] = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
		}
		
		//Here strictly using 2 for-loop for finding index
		System.out.println("Enter Which Element You Want : ");
		int n = Integer.parseInt(bReader.readLine());
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("Index OF element is: " + i);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Que4_FindIndex_Array q4 = new Que4_FindIndex_Array();
		q4.getIndex();

	}

}
