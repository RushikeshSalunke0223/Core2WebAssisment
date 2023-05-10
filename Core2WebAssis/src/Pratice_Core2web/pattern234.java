package Pratice_Core2web;

public class pattern234 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			char x='A'; 
			int v=1;
			for(int j=1;j<=4;j++) {
				if(j%2==1) {
					System.out.print((x++)+" ");
				}else {
					
					System.out.print((v++)+" ");
				}
			}
			System.out.println();
		}

	}

}
