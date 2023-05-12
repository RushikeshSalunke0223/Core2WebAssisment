package Pratice_Core2web;

public class Pattern_Code {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=3;j++) {
				if(j%2==1) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}

	}

}
