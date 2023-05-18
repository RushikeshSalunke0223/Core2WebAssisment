package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class br {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your favrate batsman name");
		String batsman=br.readLine();
		
		System.out.println("enter your favrate Boller name");
		String bollerString=br.readLine();
		
		System.out.println("enter your favrate player jerNo");
		int jerNO=Integer.parseInt(br.readLine());
				
		System.out.println("enter your favrate player Avg");
		float Avg=Float.parseFloat(br.readLine());
		
		System.out.println("Enter Batsman name "+batsman);
		
		System.out.println("Ente Boller name "+bollerString);
		
		System.out.println("Enter the jerno "+jerNO);
		
		System.out.println("Enter the Avg "+);
	}

}
