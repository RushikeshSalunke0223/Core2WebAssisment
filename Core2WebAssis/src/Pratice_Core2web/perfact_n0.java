package Pratice_Core2web;

public class perfact_n0 {

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if(n==sum) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}

}
