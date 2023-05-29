package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methodsdemo {
	void Add(int a, int b) {
		int ans = a + b;
		System.out.println("Toatl Addition  : " + ans);
	}

	void Sub(int a, int b) {
		int ans = a - b;
		System.out.println("total substration : " + ans);
	}

	void Mul(int a, int b) {
		int ans = a * b;
		System.out.println("total multiplication : " + ans);
	}

	void Div(int a, int b) {
		int ans = a % b;
		System.out.println("total Division : " + ans);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the A value");
		int a = Integer.parseInt(bReader.readLine());
		System.out.println("Enter the B value");
		int b = Integer.parseInt(bReader.readLine());

		methodsdemo m1 = new methodsdemo();
		m1.Add(a, b);

		methodsdemo m2 = new methodsdemo();
		m2.Sub(a, b);

		methodsdemo m3 = new methodsdemo();
		m2.Mul(a, b);

		methodsdemo m4 = new methodsdemo();
		m2.Div(a, b);
	}

}
