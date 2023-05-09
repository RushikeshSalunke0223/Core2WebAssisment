package Pratice_Core2web;

public class divideby3and5 {

	public static void main(String[] args) {
		int n = 40;
		int i;
		for (i = 1; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
