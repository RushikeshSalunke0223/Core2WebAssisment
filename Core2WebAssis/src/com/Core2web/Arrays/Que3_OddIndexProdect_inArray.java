package com.Core2web.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Que3_OddIndexProdect_inArray {

	void oddProduct() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("HOw many Element you want in Array  : ");
		int x = Integer.parseInt(bReader.readLine());
		int pro=1;
		System.out.println("Enter the Array Element :  ");
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bReader.readLine());
			if (arr[i] % 2 != 0) {
				pro=pro* arr[i];
			}
		}
		System.out.println("here is Your array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("total multiplication of Odd element in Array \n" + pro);
	}

	public static void main(String[] args) throws IOException{
		Que3_OddIndexProdect_inArray q1=new Que3_OddIndexProdect_inArray();
		q1.oddProduct();
		

	}

}
