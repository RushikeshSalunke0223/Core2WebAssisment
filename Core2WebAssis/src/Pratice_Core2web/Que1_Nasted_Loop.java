package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Que1_Nasted_Loop {

	public static void main(String[] args) throws IOException {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String : ");
		String string = bReader.readLine();

		StringTokenizer STZ = new StringTokenizer(string, " ");
		System.out.println(STZ.countTokens());

		while (STZ.hasMoreTokens()) {
			System.out.println(STZ.nextToken());
		}

	}

}
