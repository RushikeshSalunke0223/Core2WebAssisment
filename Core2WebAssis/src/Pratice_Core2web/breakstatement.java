       package Pratice_Core2web;

import java.util.Scanner;

public class breakstatement {

	//this code is best optimization 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

			if (count > 2) {  
				//because of this if statement our code well optimized
				break;
			}
		}

		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Non Prime");
		}
	}

}
