package Pratice_Core2web;

public class demoSwitch {

	public static void main(String[] args) {
		int x=4;
		switch (x) {
		case 1: {
			System.out.println("one");
			break;
		}
		case 2:{
			System.out.println("two");
			break;
		}
		case 3:{
			System.out.println("three");
			break;
		}
		default:
			throw new IllegalArgumentException("Duplicagte Case : " + x);
		}
	}

}
