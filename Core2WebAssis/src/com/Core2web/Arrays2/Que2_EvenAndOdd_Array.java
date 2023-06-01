package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2_EvenAndOdd_Array {
	void Even_Odd() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Element You Want : ");
		int x = Integer.parseInt(bReader.readLine());
		int Even = 0;
		int Odd = 0;
		System.out.println("Enter the Element here : ");
		int arr[] = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			if (arr[i] % 2 == 0) {
				Even++;
			} else {
				Odd++;
			}
		}
		System.out.println("Total no Even Element in Array = "+Even + "\n" 
		+ "Total no Odd Element in Array = "+Odd);

	}

	public static void main(String[] args) throws IOException {
		Que2_EvenAndOdd_Array q2 = new Que2_EvenAndOdd_Array();
		q2.Even_Odd();

	}

}
