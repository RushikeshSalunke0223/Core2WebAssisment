package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Optimized2Prime_no {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the NO : ");
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		int i,m = 0, flag = 0;
		int n = Integer.parseInt(bReader.readLine());
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else }

	}

}
