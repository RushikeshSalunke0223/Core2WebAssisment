package com.Core2web.Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que7_CommanArray {
	void Array1() throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many element you want : ");
		int x=Integer.parseInt(br1.readLine());
		System.out.println("Eneter the Array Elements : ");
		int Arr1[]=new int[x];
		for(int i=0;i<x;i++) {
			Arr1[i]=Integer.parseInt(br1.readLine());
		}
		System.out.println("how many element you want : ");
		int x1=Integer.parseInt(br1.readLine());
		int Arr2[]=new int[x1];
		System.out.println("Eneter the Array Elements : ");
		for(int i=0;i<x;i++) {
			Arr2[i]=Integer.parseInt(br1.readLine());
		}
		System.out.println("Comman Elements Of Array ");
		for(int i=0;i<Arr1.length;i++) {
			for(int j=0;j<Arr2.length;j++) {
				if(Arr1[i]==Arr2[j]) {
					System.out.println("comman element is : "+Arr1[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Que7_CommanArray a1=new Que7_CommanArray();
		a1.Array1();

	}

}
