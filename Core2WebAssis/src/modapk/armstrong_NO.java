package modapk;

public class armstrong_NO {

	public static void main(String[] args) {
		int n = 154;
		int sum = 0;
		int temp=n;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if(temp==sum) {
			System.out.println("aremstrong no");
		}else {
			System.out.println("not a aremstrong no");
		}
	}

}
