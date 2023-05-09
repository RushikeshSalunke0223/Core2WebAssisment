package Pratice_Core2web;

public class Continue {

	public static void main(String[] args) {
		int n = 50;

		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0 && i % 5 == 0) || (i % 4 == 0)) {
				continue;
			}
			System.out.println(i);
		}
	}

}
