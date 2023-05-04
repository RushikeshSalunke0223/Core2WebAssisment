package com.Core2web.WhileLoop;

public class Oue8_Countdown {

	public static void main(String[] args) {
		int n = 1;

		if (n == 0) {
			System.out.println(n + " Day's Reamaing Countdown");
		} else {
			while (n >= 1) {
				System.out.println(n + "  Day's Reamaing Countdown\" ");
				n--;
			}

			if (n == 0) {
				System.out.println(n + "  Your time is Over ");
			}
		}

	}

}
