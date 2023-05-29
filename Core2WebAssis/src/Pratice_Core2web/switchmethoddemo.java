package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchmethoddemo {

	void Add(int a, int b) {
		int Ans = a + b;
		System.out.println("Total Addition " + Ans);
		if (Ans % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	void Sub(int a, int b) {
		int Ans = a - b;
		System.out.println("Total Substraction " + Ans);
		if (Ans % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	void Mul(int a, int b) {
		int Ans = a * b;
		System.out.println("Total Multiplication " + Ans);
		if (Ans % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	void Div(int a, int b) {
		int Ans = a % b;
		System.out.println("Total Substraction " + Ans);
		if (Ans % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the A value");
		int a = Integer.parseInt(bReader.readLine());
		System.out.println("Enter the B values");
		int b = Integer.parseInt(bReader.readLine());
		System.out.println("Enter Your choice \n1 : Addition \n2 : Substraction \n3 : Multiplication \n4 : Division");
		int methods = Integer.parseInt(bReader.readLine());

		switch (methods) {
		case 1: {
			switchmethoddemo s1 = new switchmethoddemo();
			s1.Add(a, b);
		}
			break;
		case 2: {
			switchmethoddemo s2 = new switchmethoddemo();
			s2.Sub(a, b);
		}
			break;
		case 3: {
			switchmethoddemo s3 = new switchmethoddemo();
			s3.Mul(a, b);
		}
			break;
		case 4: {
			switchmethoddemo s4 = new switchmethoddemo();
			s4.Div(a, b);
		}
			break;
		default: {
			System.out.println("Enter the valied input");
		}
		}

	}

}
