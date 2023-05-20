package com.Core2web.Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que1_Studnts_Marks {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		int Marathi_Marks;
		System.out.println("Enter Marathi_Marks : ");
		Marathi_Marks = Integer.parseInt(bReader.readLine());

		int English_Marks;
		System.out.println("Enter English_Marks : ");
		English_Marks = Integer.parseInt(bReader.readLine());

		int Social_Science_Marks;
		System.out.println("Enter Social_Science_Marks : ");
		Social_Science_Marks = Integer.parseInt(bReader.readLine());

		int Maths_Marks;
		System.out.println("Enter Maths_Marks : ");
		Maths_Marks = Integer.parseInt(bReader.readLine());

		int Geography_Marks;
		System.out.println("Enter Geography_Marks : ");
		Geography_Marks = Integer.parseInt(bReader.readLine());

		if (Marathi_Marks < 35 || English_Marks < 35 || Social_Science_Marks < 35 || Maths_Marks < 35
				|| Geography_Marks < 35) {
			System.out.println("So sorry champ... \nYou are Failed  \nDon't Give Up");
		} else {
			double Avg = (Marathi_Marks + Maths_Marks + English_Marks + Social_Science_Marks + Geography_Marks) / 5;

			char Ch;
			if (Avg > 75) {
				Ch = 'A';
			} else if (Avg > 60) {
				Ch = 'B';
			} else if (Avg > 50) {
				Ch = 'C';
			} else if (Avg > 40) {
				Ch = 'D';
			} else if (Avg > 35) {
				Ch = 'E';
			} else {
				Ch = 'F';
			}
			switch (Ch) {
			case 'A':
				System.out.println("First class with distinction");
				break;
			case 'B':
				System.out.println("First Class");
				break;
			case 'C':
				System.out.println("Secound class");
				break;
			case 'D':
				System.out.println("Third class");
				break;
			case 'F':
				System.out.println("Failed");
			default:
				throw new IllegalArgumentException("Unexpected value: " + Ch);
			}

		}

	}
}
