package com.Core2web.WhileLoop;

public class Oue7_EvenOdd_INRAndamNO {

	public static void main(String[] args) {
		int a=5;
		if(a%2==0) {
			while(a>=1) {
				System.out.println("Num "+a);
				a--;
			}
		}else {
			while(a>=1) {
				System.out.println("num "+a);
				if(a%2!=0) {
					System.out.println(a);
				}
				a--;
				
//				a=a-2;
			}
		}
		System.out.println();
	}

}
