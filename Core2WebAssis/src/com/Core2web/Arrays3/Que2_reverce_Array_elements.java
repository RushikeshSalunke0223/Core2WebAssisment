package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2_reverce_Array_elements {

	public static void main(String[] args) throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many elemets you want ");
		int x=Integer.parseInt(br1.readLine());
		System.out.println("Enter the Elements :");
		int arr[]=new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br1.readLine());
		}
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int rev=0;
			while(temp!=0) {
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;	
			}
			System.out.println("reverse arrays elements \n"+rev);
		}
	}

}
