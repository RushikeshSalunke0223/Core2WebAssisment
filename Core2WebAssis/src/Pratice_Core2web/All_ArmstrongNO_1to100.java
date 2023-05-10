package Pratice_Core2web;

public class All_ArmstrongNO_1to100 {

	public static void main(String[] args) {
		int n = 154;
		int temp = n;
		while (n != 0) {
			@SuppressWarnings("unused")
			int rem = n % 10;
			temp = temp + (n * n * n);
			n = n / 10;
		}
		System.out.println(temp);
	}

}
