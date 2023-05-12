package Pratice_Core2web;

public class Pattern004 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch = 'A';
			for (int j = 1; j <= 4 - i + 1; j++) {
				System.out.print((ch++) + " ");
			}
			System.out.println();
		}
	}
}
