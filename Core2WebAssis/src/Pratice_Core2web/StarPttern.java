package Pratice_Core2web;

public class StarPttern {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			int s = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print((s++) + " ");
			}
			System.out.println();
		}

	}

}
