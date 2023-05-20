package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class scannerdemo extends Object{

	public static void main(String[] args) throws IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" Enter society name ,wing,flat_no");
		String info=br1.readLine();
		
		System.out.println(info);
		StringTokenizer STZ=new StringTokenizer(info," ");
		
		String token1=STZ.nextToken();
		System.out.println("Society name : "+token1);
		
		String token2=STZ.nextToken();
		System.out.println("Wing name : "+token2);
		
		String token3=STZ.nextToken();
		System.out.println("Flat No : "+token3);

	}

}
