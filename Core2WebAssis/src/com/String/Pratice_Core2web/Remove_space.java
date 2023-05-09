package com.String.Pratice_Core2web;

public class Remove_space {

	public static void main(String[] args) {
		String s = " The sun Is Brighter Star";

		String sd = s.replaceAll("\\s", "");
		System.out.println(sd);  
	}

}
