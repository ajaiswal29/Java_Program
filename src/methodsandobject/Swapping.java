package methodsandobject;

public class Swapping {

	public static void main(String[] args) {
	//with 3rd variable
		int a = 2;
		int b = 3;
		/*int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);*/
		
		
	//without 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
