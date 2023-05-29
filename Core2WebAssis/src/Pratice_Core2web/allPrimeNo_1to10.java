package Pratice_Core2web;

import java.util.Scanner;

public class allPrimeNo_1to10 {

	public static void main(String[] args) {
		System.out.println("Enter the no here : ");
		Scanner s1 = new Scanner(System.in);
		int x = s1.nextInt();
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (x % i == 0) {
				count++;
				//this variable storing the the iteration count of numbers.
			System.out.println(i+" ");
			//here we print all the factors of given no 
			//which prime or non prime
			
			}
		}
		if (count == 2) {
			System.out.println("Prime no's total factors are "+count);
		} else {
			System.out.println("Non-Prime no's total factors are "+count);
		}

	}

}
