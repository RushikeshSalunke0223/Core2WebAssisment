package com.Core2web.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_Arrays_of_Vowels {

	void Vowels() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("HOw many Element you want in Array  : ");
		int sum = 0;
		int x = Integer.parseInt(bReader.readLine());
		System.out.println("Enter the Array Element :  ");
		char arr[] = new char[x];
		for (int i = 0; i < x; i++) {
			arr[i] = (char) bReader.read();
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= x) {
				System.out.println("Enter the Arrys size " + x + " only");
			} else if (arr[i] <= x || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
					|| arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("total Vowels in char Arrays : " + (sum));
	}

	public static void main(String[] args) throws IOException {
		Que4_Arrays_of_Vowels A1 = new Que4_Arrays_of_Vowels();
		A1.Vowels();

	}

}
