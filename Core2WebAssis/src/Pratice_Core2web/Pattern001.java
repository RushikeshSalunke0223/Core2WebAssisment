package Pratice_Core2web;

public class Pattern001 {

	public static void main(String[] args) {
		int s = 10;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((s--) + " ");
			}
			System.out.println();
		}

	}

}
