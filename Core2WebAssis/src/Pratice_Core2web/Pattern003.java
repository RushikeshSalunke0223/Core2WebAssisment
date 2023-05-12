package Pratice_Core2web;

public class Pattern003 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
