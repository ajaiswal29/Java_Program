package programs;

public class Swaping {
//By using 2 variables	
	public static void main (String args[]) {

	int a=2;
	int b=3;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("value of a " +a);
	System.out.println("Value of b " +b);


	//By using 3rd variable

   int A=20;
   int B=30;
   int C;

    C=A;
    A=B;
    B=C;
    
    System.out.println("value of A " +A);
	System.out.println("Value of B " +B);

    
    

	}
}