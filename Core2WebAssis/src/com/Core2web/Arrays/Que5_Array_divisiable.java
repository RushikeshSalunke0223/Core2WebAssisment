package com.Core2web.Arrays;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Que5_Array_divisiable {
	void Divisiable_by_5 () throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("HOw many Element you want in Array  : ");
		int x = Integer.parseInt(bReader.readLine());
		int sum = 0;
		System.out.println("Enter the Array Element :  ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			if (arr[i] % 5== 0) {
				System.out.print(+arr[i]+" <-- this no is by 5 \n");
				sum ++;
			}
		}
		System.out.println("here is Your array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("total no of element are divisiable by 5 = " + sum);
	}
	public static void main(String[] args) throws IOException {
		Que5_Array_divisiable q1=new Que5_Array_divisiable();
		q1.Divisiable_by_5();
	}

}
