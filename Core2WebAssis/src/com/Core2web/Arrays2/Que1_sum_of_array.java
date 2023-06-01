package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que1_sum_of_array {
	void sumArray() throws IOException{
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many element you want in Array : ");
		int x=Integer.parseInt(bReader.readLine());
		int sum=0;
		int arr[]=new int[x];
		System.out.println("Enter the Arrays Elemenets : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(bReader.readLine());
			sum=sum+arr[i];
		}
		System.out.println("Here is your Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("total Addition of Arrays elelment : "+sum);
		
	}

	public static void main(String[] args) throws IOException {
		Que1_sum_of_array que1_sum_of_array=new Que1_sum_of_array();
		que1_sum_of_array.sumArray();
		

	}

}
