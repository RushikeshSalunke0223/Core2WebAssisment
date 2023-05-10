package com.Core2web.Collection;

import java.util.Arrays;
import java.util.List;

public class Collecrtions_ {
	public static void main(String[] args) {

		String str[] = 
			{ "Rushi", "Shubham", "manoj", "abhi", "Rama", "Anand", "Prem" };
		int a = str.length;
		for (int i = 0; i < a; i++) {
			System.out.println(str[i] + " ");
		}
		System.out.println();
		
		
		@SuppressWarnings("rawtypes")
		List LL=Arrays.asList(str);
		System.out.println(LL);
	}
}
