package Pratice_Core2web;

public class demo2IMPswitch {
	public static void main(String[] args) {
		char ch = 65+3;

		switch (ch) {
		case 'A':
			System.out.println("A");
			break;
		case 66:
			System.out.println("B");
			break;
		case 'C':
			System.out.println("C");
			break;
		case 66 + 2:
			System.out.println("D");
			break;

		default:
			System.out.println("invalied");
			break;
		}
	}

}
