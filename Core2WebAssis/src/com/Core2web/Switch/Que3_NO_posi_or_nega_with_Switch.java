package com.Core2web.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que3_NO_posi_or_nega_with_Switch {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		int No1, No2;
		System.out.println("Enter NO1 : ");
		No1 = Integer.parseInt(bReader.readLine());
		System.out.println("Enter NO2 : ");
		No2 = Integer.parseInt(bReader.readLine());


		if (No1 < 0 || No2 < 0) {
			System.out.println("Negaetive Number Are Not Allowed  ");
		} else {
			switch ((No1 * No1) % 2) {
			case 0:
				System.out.println("Multiplication is Even ");
				break;
			case 1:
				System.out.println("Multiplication is Odd ");
				break;
			}
		}
	}
}
