package modapk;

public class fordemo {

	public static void main(String[] args) {
		int x = 25;
		int count=0;
		for (int i = 1; i <= 10; i++) {
			if(x%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("prime");
		}else {
			System.out.println("non prime");
		}
	}

}
