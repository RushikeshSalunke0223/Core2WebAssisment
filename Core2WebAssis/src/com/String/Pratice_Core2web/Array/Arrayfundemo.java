package com.String.Pratice_Core2web.Array;

public class Arrayfundemo {
	
	int fun(int i) {
		System.out.println("in fun");
		int val=i+50;
		
		return val;
	}

	public static void main(String[] args) {
		Arrayfundemo A1=new Arrayfundemo();
		int ret=A1.fun(10);
		System.out.println(ret);
	}

}
