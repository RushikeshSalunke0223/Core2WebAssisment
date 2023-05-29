package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class method3demo {
	
	void fun(float a) {
		System.out.println("in float");
		System.out.println(a);
	}
	
	void fun(int a) {
		System.out.println("in float");
		System.out.println(a);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value : ");
		float num=Float.parseFloat(bReader.readLine());
		method3demo m1=new method3demo();
		m1.fun(num);
		
		
		m1.fun(10);
		m1.fun(10.0f);
	}

}
