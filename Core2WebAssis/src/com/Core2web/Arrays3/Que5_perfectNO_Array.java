package com.Core2web.Arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5_perfectNO_Array {

	public static void main(String[] args) throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want ");
		int x=Integer.parseInt(br1.readLine());
		System.out.println("Enter the elements ");
		int arr[]=new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br1.readLine());
		}
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=1;j<arr[i];j++) {
				if(arr[i]%j==0) {
					sum=sum+j;
				}
			}
			if(sum==arr[i]) {
				System.out.println("perfect no "+arr[i]+" found at "+i+" index");
			}
		}
	}

}
