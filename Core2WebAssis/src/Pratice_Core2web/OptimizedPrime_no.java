package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimizedPrime_no {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		int Num = Integer.parseInt(bReader.readLine());
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if(Num % i == 0) {
				count++;
			}
			if (count == 2) {
				System.out.println("prime no");
			} else {
				System.out.println("Non prime no");
			}

		}
	}
}