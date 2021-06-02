package patterns;

public class Table {

	public static void main(String[] args) {
		/*print 1 2 3 4....10
		        2 		   20
		        3			.
		        .
		        102030..   100*/
		
		/*for (int i =1;i<=10;i++ ) {
			for (int j=1;j<=10;j++) {
				
				System.out.print(i*j);				
				
			}
			System.out.println();
		}*/
	
		/*2. print 1
		           2 3
		           4 5 6
		           7 8 9 10
		           
		int k =1;
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println("");*/
		
		
		/*  3.print   1
			        2   3
			      4   5   6
			    7   8   9   10*/
			
		int inc=1;
		
		for (int i=1;i<=4;i++) {
			
			for (int j=4;j>i;j--) {
				System.out.print(" ");
			}
		
		for (int k=1;k<=i;k++) {
			System.out.print(inc++);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		}
		
		/*4.print       A
	    			  B   c
                    D	E   F
    			  G   H   I   J*/

		int alpha = 65;
		for (int f = 1; f <= 4; f++) {

			for (int g = 4; g >= f; g--) {

				System.out.print(" ");

			}

			for (int q = 1; q <= f; q++) {
				System.out.print((char) (alpha) + " ");
				alpha++;
			}

			System.out.println(" ");

		}
	}

}
