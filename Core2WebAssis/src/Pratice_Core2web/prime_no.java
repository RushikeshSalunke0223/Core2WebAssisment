package Pratice_Core2web;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		System.out.println("Enter the NO here : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (n % i == 0) {
				sum++;
			}
		}
		if (sum == 2) {
			//What is prime no?
			//no.whoes factors are exactly two.this is known prime no
			System.out.println("prime");
		} else {
			System.out.println("non prime");
		}
	}
}
