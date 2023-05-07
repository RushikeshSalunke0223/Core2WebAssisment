package com.Core2web.Collection;

import java.util.Scanner;

public class Armstrong {     

	public static void main(String[] args) {
		System.out.println("enter the no here : ");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int count = 0;
		int temp1 = n;
		int temp2 = n;
		int sum = 0;
		
		while (n != 0) {
			count++;
			n = n / 10;
		}

		while (temp1 != 0) {
			int rem = temp1 % 10;
			int m = 1;
			for (int i = 1; i <= count; i++) {
				m = m * rem;
			}
			temp1 = temp1 / 10;
			sum = sum + m;
		}
		if (temp2 == sum) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("not a Armstrong no");
		}
	}

}
