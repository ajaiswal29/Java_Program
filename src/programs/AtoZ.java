package programs;

public class AtoZ {
	//print AtoZ
	public static void main (String[]args)
	{
	char c;
	
	for (c='A';c<='Z';c++) {
		
		System.out.print(c + " ");
		
	}
	System.out.println();
	
	//print atoz
	
	
		char d;

		for (d = 'a'; d <= 'z'; d++) {

			System.out.print(d + " ");

		}
		System.out.println();
	//print ZtoA
	
		char e;
		
		for (e='Z';e>='A';e--) {
			System.out.print(e+" ");
		}
	
	}
}