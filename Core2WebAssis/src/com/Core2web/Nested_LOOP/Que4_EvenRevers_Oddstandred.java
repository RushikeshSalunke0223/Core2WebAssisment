package com.Core2web.Nested_LOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4_EvenRevers_Oddstandred {
	public static void Even(int Start, int End) {
		for (int i = End; i >= Start; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void Odd(int Start, int End) {
		for (int i = Start; i <= End; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Start And End Point value : ");
		System.out.println("Start Point");
		int Start = Integer.parseInt(bReader.readLine());
		System.out.println("End Point");
		int End = Integer.parseInt(bReader.readLine());
		System.out.println("Even no");
		Even(Start, End);
		System.out.println("\nOdd no");
		Odd(Start, End);

	}

}
