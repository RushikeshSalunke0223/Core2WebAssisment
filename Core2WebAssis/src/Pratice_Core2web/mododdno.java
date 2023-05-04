package Pratice_Core2web;

import java.util.Scanner;

public class mododdno {

	public static void main(String[] args) {
		System.out.println("Enter the no ");
		@SuppressWarnings("resource")
		Scanner scrScanner = new Scanner(System.in);
		int digit = scrScanner.nextInt();
		int rev = 0;
		int temp = digit;

		while (digit != 0) {
			int rem = digit % 10;
			rev = rev * 10 + rem;
			digit = digit / 10;

		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("this is palomdroem");
		} else {
			System.out.println("this is not a palomdroem");
		}

	}

}
