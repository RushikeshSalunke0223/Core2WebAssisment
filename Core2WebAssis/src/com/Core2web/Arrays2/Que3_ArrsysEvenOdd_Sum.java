package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que3_ArrsysEvenOdd_Sum {
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
				Even = Even + arr[i];
			} else {
				Odd = Odd + arr[i];
			}
		}
		System.out
				.println("Total of Even Element in Array = " + Even + "\n" + "Total of Odd Element in Array = " + Odd);

	}

	public static void main(String[] args) throws IOException {
		Que3_ArrsysEvenOdd_Sum que3 = new Que3_ArrsysEvenOdd_Sum();
		que3.Even_Odd();

	}

}
