package com.String.Pratice_Core2web.Array;

public class ArrayDemo {
	//Practices session

	public static void main(String[] args) {
		int Arr[] = { 10, 20, 30 };
		System.out.println(Arr);
		for (float v : Arr) {
			System.out.println(Arr[0]);
			System.out.println(v);
			System.out.println(v);
		}

		double Arr1[] = { 10d, 20d, 30d };
		System.out.println(Arr1);
		for (double v : Arr1) {
			System.out.println(v);

		}
		
		char arr5[]= {'A','B','C'};
		System.out.println(arr5);

		System.out.println("interger cashing version 1.5 ");
		int x = 10;
		int y = 10;
		Integer zInteger = 10;
		System.out.println(
				System.identityHashCode(x) + "" + System.identityHashCode(y) + "" + System.identityHashCode(zInteger));
		System.out.println();
		System.out.println("there is no cashing for long ");

		long x1 = 100000000;
		long y1 = 100000000;
		Long zInteger1 = (long) 1000000000;
		System.out.println(System.identityHashCode(x1) + "" + System.identityHashCode(y1) + ""
				+ System.identityHashCode(zInteger1));

		if (System.identityHashCode(x1) == System.identityHashCode(y1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
