package com.Core2web.Ifelse;

public class Oue9_PythagorasTriangle {

	public static void main(String[] args) {
		int a=2,b=2,c=2;
		
		if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (c*c)+(b*b)==(a*a)) {
			System.out.println("Triangle is Pythagores Triangle");
		}else {
			System.out.println("Triangle is Not a Pythagores Triangle");
		}

	}

}
