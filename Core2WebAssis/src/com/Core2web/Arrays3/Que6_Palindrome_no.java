package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que6_Palindrome_no {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want ");
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Enter the elements ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br1.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			int N=arr[i];
			int rev=0;
			while(N!=0) {
				int rem=N%10;
				rev=rev*10+rem;
				N=N/10;
			}
			if(rev==arr[i]) {
				System.out.println("Palindrome no "+arr[i]+" found at "+i+" index");
			}
		}
	}
}
