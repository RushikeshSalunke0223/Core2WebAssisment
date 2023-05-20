package com.Core2web.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2_NO_Spelling {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 0 to 5 any no : ");
		int Num = Integer.parseInt(bReader.readLine());
		switch (Num) {

		default:
			if (Num < 0) {
				System.out.println("Num is negetive");
			} else if (Num >= 5) {
				System.out.println("Num is Gratter then 5");
			} else {
				System.out.println();
			}
			break;

		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Foure");
			break;
		case 5:
			System.out.println("Five");
			break;

		}
	}

}
