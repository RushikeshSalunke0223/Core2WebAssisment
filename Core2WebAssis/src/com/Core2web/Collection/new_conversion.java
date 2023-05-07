package com.Core2web.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class new_conversion {

	public static void main(String[] args) {
		String str[]= {"Shubham","Rushi","Aman","Xing","Jayanth","Dipak"};
		
		int Array=str.length;
		for(int i=0;i<Array;i++) {
			System.out.println(str[i]);
		}
		

		List<String> LL=Arrays.asList(str);
		System.out.println(LL);

		Collections.sort(LL);
		System.out.println(LL);
	}

}
