package Pratice_Core2web;

public class PatternA1A1A1A1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				char x = 'A';
				int v = 1;
				if (j % 2 == 1) {
					System.out.print((x++) + " ");
				} else {
					System.out.print((v++) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	
		char x = 'A';
		int v = 1;
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {
				if (j % 2 == 1) {
					System.out.print((x++) + " ");
				} else {

					System.out.print(v++ + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				char xx = 'A';
				int vv = 1;
				if (j % 2 == 1) {
					System.out.print((xx++) + " ");
				} else {
					System.out.print((vv) + " ");
				}
			}
			System.out.println();
		}

	}

}
