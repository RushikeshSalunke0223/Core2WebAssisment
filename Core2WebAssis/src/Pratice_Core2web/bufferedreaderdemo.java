package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreaderdemo {

	public static void main(String[] args) throws IOException {
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Society Name ");
		String societyName = bR.readLine();

		System.out.println("Enter the Wing name ");
		char Wing_no = (char) bR.readLine().charAt(0);
		
		System.out.println("Enter Flat Number");
		int flat_no = Integer.parseInt(bR.readLine());
		
		bR.close();
		

		System.out.println("Society Name is  " + societyName);

		System.out.println("Wing Name is  " + Wing_no);

		System.out.println("flat Number is  " + flat_no);

	}

}
