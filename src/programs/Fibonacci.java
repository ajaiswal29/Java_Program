package programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0, n2=1, n3 ;
		System.out.print(n1+" "+n2);
		
		//print fibonacci from 0 to 10;
		for (int i = 2; i < 10; i++) {

			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
