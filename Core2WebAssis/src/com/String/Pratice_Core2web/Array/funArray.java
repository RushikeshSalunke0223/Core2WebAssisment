package com.String.Pratice_Core2web.Array;

public class funArray {
	static void fun(int arr[]) {
		for (int x : arr) {
			System.out.println(arr);
			arr[0]=700;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 50;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 50, 100, 150 };
		System.out.println(arr);
		fun(arr);
		for (int s : arr) {
			System.out.println(arr);
		}

	}

}
