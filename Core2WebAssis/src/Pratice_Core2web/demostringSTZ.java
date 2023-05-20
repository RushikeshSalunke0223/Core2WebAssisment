package Pratice_Core2web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class demostringSTZ {

	public static void main(String[] args)throws IOException {
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter Mall_name,Shop_name,Shop_no,Flower_name");
		 
		 String mall=bReader.readLine();
		 
		 StringTokenizer STZ=new StringTokenizer(mall," ");
		 
		 String t1=STZ.nextToken();
		 System.out.println("Mall_name : "+t1);
		 
		 String t2=STZ.nextToken();
		 System.out.println("Shop_name : "+t2);
		 
		 int t3=Integer.parseInt(STZ.nextToken());
		 System.out.println("Shop_Number : "+t3);
		 
		 char t4=STZ.nextToken().charAt(0);
		 System.out.println("Flower_name : "+t4);
		 

	}

}
